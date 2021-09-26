package Pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/login")
	public String method01() {
		return "login";
	}
	
	@RequestMapping("/join")
	public String method02() {
		return "join";
	}
	
	@RequestMapping("/main")
	public String method03() {
		return "main";
	}
	
	@RequestMapping("/loginGo")
	public String method04(Model model, UserDTO udto, 
			HttpServletRequest r, HttpServletResponse response) {
		UserDAO udao = new UserDAO();
		int check = udao.login(udto);
		if(check == 0) {
			try {
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				
				out.print("<script>");
				out.print(" alert('아이디나 비밀번호가 틀렸습니다'); ");
				out.print(" history.go(-1); ");
				out.print("</script>");
				
				out.close();
				return null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			
		}
		
		// 아이디 정보를 session객체에 저장
		HttpSession session = r.getSession();
		session.setAttribute("id", udto.getId());
		
		// 페이지 이동
		return "main";
	}
	
	@RequestMapping("/logout")
	public void method05(HttpServletRequest r, HttpServletResponse response) {
		// 로그아웃 처리 -> 로그인 세션을 초기화(삭제)
		HttpSession session = r.getSession();
		session.invalidate();
		
		// 페이지 이동(js 사용)
		response.setContentType("text/html; charset=UTF-8");
		try {
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print(" alert('로그아웃 하였습니다.');");
			out.print(" location.href='./';");
			out.print("</script>");
			out.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/joinResult")
	public String method06(Model model, UserDTO udto) {
		UserDAO udao = new UserDAO();
		udao.insert(udto);
		model.addAttribute("id", udto.getId());
		model.addAttribute("name", udto.getName());
		model.addAttribute("age", udto.getAge());
		return "joinResult";
	}
	
	@RequestMapping("/idcheck")
	public String method07(HttpServletRequest r, HttpServletResponse response) throws Exception {
		// 한글처리
		r.setCharacterEncoding("utf-8");
		String id = r.getParameter("id").trim();
		
		System.out.println("ajax id 전송 : " + id);
		
		UserDAO udao = new UserDAO();
		
		int check = 0;
		
		if(id != null) {
			check = udao.idCheck(id);
		}
		
		System.out.println(check);
		
		PrintWriter out = response.getWriter();
		
		out.print(check);
		out.flush();
		out.close();
		
		return null;
	}	
	
	@RequestMapping("/userList")
	public String method08(Model model, UserDTO udto, HttpServletRequest request) {

		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		
		if(id == null || !id.equals("admin")){
			return "login";
		} 
		
		UserDAO udao = new UserDAO();
		List userList = udao.userList(udto);
		request.setAttribute("userList", userList);
		
		return "userList";
	}
	
}
