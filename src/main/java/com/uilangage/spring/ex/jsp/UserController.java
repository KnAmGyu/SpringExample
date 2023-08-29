package com.uilangage.spring.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uilangage.spring.ex.jsp.domain.User;
import com.uilangage.spring.ex.jsp.service.UserService;

@RequestMapping("/jsp/User")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	//ㅇ이름 생년월일 이메일 전달받고 사용자정보 저장하는 기능
//	@RequestMapping(path="/jsp/user/create", method=RequestMethod.GET)
	@GetMapping("/create")
//	@ResponseBody
	public String createUser(
			@RequestParam("name") String name
			,@RequestParam("birthday") String birthday
			,@RequestParam("email") String email
			, Model model) {
		
//		int count = userService.addUser(name, birthday, email);
		
		User user = new User();
		user.setName(name);
		user.setYyyymmdd(birthday);
		user.setEmail(email);
		
		int count = userService.addUserByObject(user);
		
		model.addAttribute("result",user);	
		
		return "jsp/userInfo";
		
//		return "수행결과 : " + count;
	}
	@GetMapping("/input")
	public String inputUser() {
		return "jsp/userinput";
	}
	
	@GetMapping("/last")
	public String lastUser(Model model) {
		
		User user = userService.getLastUser();
		
		model.addAttribute("result", user);
		
		return "jsp/userInfo";
	}
	
	
}
