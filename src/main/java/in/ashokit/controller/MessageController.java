package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	@GetMapping("/message")
	public String getWelcomeMsg(Model model) {
		model.addAttribute("msg", "Welcome to Message");
		return "index";
	}

}
