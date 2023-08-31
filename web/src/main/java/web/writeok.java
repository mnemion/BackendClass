package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

//파일 업로드 가능
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 1,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 100
)

public class writeok extends HttpServlet {
    private static final long serialVersionUID = 1L;
    dbconfig db = null;
    PreparedStatement ps = null;

    public writeok() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");

        //System.out.println(file.getName());    //name값명
        //System.out.println(file.getSize());    //파일 사이즈
        //System.out.println(file.getContentType());    //파일에 대한 속성
        //System.out.println(file.getHeader(getServletName()));    //파일명
        
        String mtitle = request.getParameter("utitle").intern();
        String mname = request.getParameter("uname").intern();
        String mpass = request.getParameter("upass").intern();
        
        Part file = request.getPart("mfile");
        String filenm = file.getSubmittedFileName().intern();
        if(filenm.equals("")) {
            System.out.println("첨부파일 없음");
            filenm = null;
        }
        else {
            System.out.println("첨부파일이 있음");
        }
        
        String mcnt = request.getParameter("texts").intern();

        PrintWriter pw = response.getWriter(); //스크립트 출력
        if(mtitle == "" || mname == "" || mpass == "" || filenm == "" || mcnt == "") {
            pw.write("<script>"
                    + "alert('올바른 정보가 전달되지 않으셨습니다.');"
                    + "history.go(-1);"
                    + "</script>");
        }
        else {
            try {
                this.db = new dbconfig();
                Connection con = this.db.dbinfo();
                //람다식 형태의 코드로 작성
                String sql = "insert into board values ("
                        + "'0', ?, ?, ?, ?, ?, now(), '0')";
                this.ps = con.prepareStatement(sql);
                this.ps.setString(1, mtitle);
                this.ps.setString(2, mname);
                this.ps.setString(3, mpass);
                this.ps.setString(4, filenm);
                this.ps.setString(5, mcnt);

                int call = this.ps.executeUpdate();
                String msg = "";
                if(call > 0) {
                    msg = "정상적으로 글쓰기가 완료되었습니다.";
                    this.ps.close();
                    con.close();

                }
                else {
                    msg = "글쓰기가 원활하게 진행되지 않았습니다.";
                }
                pw.write("<script>"
                    + "alert('"+msg+"');"
                    + "location.href='./list.html';"
                    + "</script>");
            }
            catch(Exception e) {
                System.out.println("Database 정보 오류!!");
            }
        }
        
        
    }
}