package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontroller {
	@RequestMapping("/ph")
	public String home(Model md) {

		md.addAttribute("name", "shoeb is my little charm");
		System.out.println("this is home url");

		List<String> list = new ArrayList<String>();
		list.add("mubashir");
		list.add("rumasha");
		list.add("muzammil");
		list.add("akhklaq");
		list.add("umar");
		md.addAttribute("friends", list);
		return "index";
	}

	@RequestMapping("/vote")
	public String vote() {
		System.out.println("my name is mubashir khan zafer ahmede");
		return "vote1";
	}

	@RequestMapping("help")
	public ModelAndView help() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","imtiyaaz ahmed khan zafer");
		mv.addObject("no",1213);
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(11);
		al.add(4);
		al.add(11);
		al.add(6);
		al.add(54);
		mv.addObject("name23",al);
		System.out.println("this is help controller page");
		mv.setViewName("help1");
		return mv;

	}
}
