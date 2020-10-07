package guru.springframework.joker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.joker.services.JokerService;

@Controller
public class JokerController {
	private JokerService jokerService;

	@Autowired
	public JokerController(JokerService jokerService) {
		this.jokerService = jokerService;
	}

	@RequestMapping({ "/", "" })
	public String showJoke(Model model) {
		model.addAttribute("joke", jokerService.getJoke());
		return "chucknorris";

	}

}
