package com.feria.webvirtual.testingweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



import com.feria.webvirtual.bean.LoginVO;

@Controller
public class LoginController {
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	
	
	
	@PostMapping("/validaLogin")
	public String validaLogin(@ModelAttribute LoginVO loginVO, Model model) {
		logger.info("Entrando a validaLogin POST \n "+loginVO);
		model.addAttribute("loginVO", loginVO);
		return "menu";
	}

	
	
	
	
}
