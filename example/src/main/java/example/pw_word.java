package example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class pw_word extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public pw_word() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
	    String id = request.getParameter("id");
	    String email = request.getParameter("email");
		
	    boolean isCorrect = checkUserInfo(name, id, email);
	    
	    if(isCorrect) {
	    	System.out.println("임시패스워드 : a123456");
	    } else {
	    	System.out.println("해당 정보를 확인하지 못하였습니다.");
	    }
	}
	private boolean checkUserInfo(String name, String id, String email) {
	    String[][] members = {
	        {"장진호", "배유미", "염무원", "김승균", "김경민", "장진호", "김경민"},
	        {"jang_ho@nate.com", "bae_mi@nate.com", "number1@gmail.com", "kim@nate.com", "min@nate.com", "ho@naver.com", "k_min@gmail.com"},
	        {"jang_ho", "bae_mi", "number1", "kim", "min", "ho", "k_min"}
	    };
	    for (int i = 0; i < members[0].length; i++) {
	        if (members[0][i].equals(name) && members[2][i].equals(id) && members[1][i].equals(email)) {
	            return true;
	        }
	    }
	    return false;
	}
}
