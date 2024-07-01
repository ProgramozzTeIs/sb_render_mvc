package pti.sb_render_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pti.sb_render_mvc.dto.UserDto;
import pti.sb_render_mvc.service.AppService;


@Controller
public class AppController {

	private AppService service;

	
	@Autowired
	public AppController(AppService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping("/")
	public String index() {
		return "index.html";
	}
	
	
	@PostMapping("/user")
	public String login(
				Model model,
				@RequestParam("uname") String userName,
				@RequestParam("upwd") String userPassword
			)
	{
		String targetPage = "";
		
		UserDto userDto = service.doLogin(userName, userPassword);
		if(userDto != null) {
			
			targetPage = "treasuregame.html";
			model.addAttribute("userDto", userDto);
		}
		else {
			
			targetPage = "index.html";
		}
		
		return targetPage;
	}
	
	
	@GetMapping("/user/game")
	public String gameFinished(
				@RequestParam("uid") int userId,
				@RequestParam("gamewin") int win,
				@RequestParam("gamesteps") int steps
			) {
		
		
		
		return "index.html";
	}
}




















