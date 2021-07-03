package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.Service.ServiceUser;
import springmvc.model.User;

@Controller
public class Form_controllar {

	@Autowired
	private ServiceUser ser;

//	
	// ServiceUser getServiceuser() {
	// return serviceuser;
//	}
//	public void setServiceuser(ServiceUser serviceuser) {
//		this.serviceuser = serviceuser;
//	}
	@RequestMapping("/form")
	public String form1(Model m) {
		// m.addAttribute("Header1","learn code with mubashir khan");

		System.out.println("form is lodeded");
		return "form";
	}

//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleform(@RequestParam("email") String emailadd,
//			@RequestParam("username") String username1,
//			@RequestParam("password") String password1,
//			Model model
//			
//			) 
//	{  
//		User u=new User();
//		u.setEmail(emailadd);
//		u.setPassword(password1);
//		u.setUsername(username1);
//		System.out.println(u);
//		model.addAttribute("user" ,u);
//		
//		model.addAttribute("emailadd",emailadd);
//		model.addAttribute("username1",username1);
//		model.addAttribute("password1",password1);
//		
//		this.serviceuser.madeuser(u);
//	String name=req.getParameter("name");
//	
//	System.out.println(name);
//	System.out.println("form handle");
//	
//	System.out.println(emailadd);
//		System.out.println(username1);
//		System.out.println(password1);
//	return "success";
//	}
//}
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleformwithmodelattribute(@ModelAttribute User user, Model model) {

		System.out.println(user + "--------------------------------");
		// s User u=new User();
//	    u.setId(2);
//	    u.setEmail("mubashirkhan@12gmail.com");
//	    u.setPassword("mubashir122");
//	    u.setUsername("khansir");
		if (user.getUsername().equals("mubasir")) {
			return "redirect:/form"; //prefix redirect

		}
		System.out.println("Done inject database");
		this.ser.madeuser(user);

		return "success";

	}

	@ModelAttribute
	public void commondataforallmethod(Model m) {
		m.addAttribute("Header1", "its mubashir khan zafer ahmed");
		m.addAttribute("ms", "user form is seccessfully");

	}
}
