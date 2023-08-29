package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class join extends HttpServlet {
	private static final long serialVersionUID = 1L;
	dbconfig db = null;
	PreparedStatement ps = null;
	
    public join() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        
        String mtitle = request.getParameter("mtitle").intern();
        String mname = request.getParameter("mname").intern();
        String mpass = request.getParameter("mpass").intern();
        String mfile = request.getParameter("mfile").intern();
        String mcnt = request.getParameter("mcnt").intern();

        PrintWriter pw = response.getWriter(); //스크립트 출력
        if(mtitle == "" || mname == "" || mpass == "" || mfile == "" || mcnt == "") {
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
                String sql = "insert into fromlist values ("
                        + "'0', ?, ?, ?, ?, ?, now(), '0')";
                this.ps = con.prepareStatement(sql);
                this.ps.setString(1, mtitle);
                this.ps.setString(2, mname);
                this.ps.setString(3, mpass);
                this.ps.setString(4, mfile);
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
