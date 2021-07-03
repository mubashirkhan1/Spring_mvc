package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Redirectcontroller 
{
	//first handler form
	@RequestMapping("/red1")
	public String refirst()
	{
		System.out.println("redirect 1 is loded");
		return "redirect:/red2";
		// use prefix redirect
	}
	@RequestMapping("/red2")
	public RedirectView redsecond()
	{
		//use redirect view
		RedirectView rv=new RedirectView();
		rv.setUrl("form");
		System.out.println("redirect 2 is loded");
		return rv;
		
	
	}
}
