package web;

import java.io.IOException;

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
        Part file = request.getPart("mfile");
        System.out.println(file.getName());	//name값명
        System.out.println(file.getSize());	//파일 사이즈
        System.out.println(file.getContentType());	//파일에 대한 속성
        System.out.println(file.getHeader(getServletName()));	//파일명
        String filenm = file.getSubmittedFileName().intern();
        if(filenm == "") {
        	System.out.println("첨부파일 없음");
        }
        else {
        	System.out.println("첨부파일이 있음");
        }
    }
}
