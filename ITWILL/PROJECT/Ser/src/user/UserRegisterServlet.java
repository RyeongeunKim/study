package user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset-utf-8");
		String userID = request.getParameter("userID");
		String userPassword = request.getParameter("userPassword");
		String userName = request.getParameter("userAddress");
		String userAddress = request.getParameter("userAddress");
		String userEmail = request.getParameter("userEmail");
		if (userID == null || userID.equals("") 
			|| userPassword == null || userPassword.equals("")
			|| userName == null || userName.equals("")
			|| userAddress == null || userAddress.equals("")
			|| userEmail == null || userEmail.equals("")){
			request.getSession().setAttribute("messageType", "오류 메시지");
			request.getSession().setAttribute("messageContent", "모든 내용을 입력하세요.");
			response.sendRedirect("join.jsp");
			return;
		}
		int result = new UserDAO().join(userID, userPassword, userName, userAddress, userEmail);
		if(result ==1 ){
			request.getSession().setAttribute("messageType", "성공 메시지");
			request.getSession().setAttribute("messageContent", "회원가입에 성공했습니다.");
			response.sendRedirect("join.jsp");
			return;
		}
		else{
			request.getSession().setAttribute("messageType", "오류 메시지");
			request.getSession().setAttribute("messageContent", "이미 존재하는 회원입니다.");
			response.sendRedirect("join.jsp");
			return;
		}
	}
}
