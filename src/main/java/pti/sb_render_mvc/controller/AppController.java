package pti.sb_render_mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {

	
	@GetMapping("/")
	public String index() {
		
		return "index.html";
	}
}
