package pti.sb_render_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pti.sb_render_mvc.db.Database;
import pti.sb_render_mvc.model.User;

@Controller
public class AppController {

	private Database db;
	
	
	@Autowired
	public AppController(Database db) {
		super();
		this.db = db;
	}
	
	
	@GetMapping("/")
	public String index(Model model) {
		
		User user = db.getUserById(1);
		
		model.addAttribute("user", user);
		return "index.html";
	}
}
