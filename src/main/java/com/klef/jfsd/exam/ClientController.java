package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/SpringMVC")
public class ClientController 
{
	@GetMapping("/welcome")
	@ResponseBody
	public String welcome()
	{
		return "Welcome! JFSD End Sem Lab";
	}
	
	@GetMapping("/test")
	public String test() 
	{
		return "test";
	}
	
	@GetMapping("/showInfo")
	public ModelAndView showInfo(@RequestParam int id, @RequestParam String name)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		mv.addObject("name", name);
		mv.setViewName("showInfo");
		return mv;
	}
	
	@GetMapping("calculateSum/{num1}/{num2}")
	public ModelAndView calculateSum(@PathVariable int num1, @PathVariable int num2)
	{
		ModelAndView mv = new ModelAndView("calculateSum");
		int sum = num1+num2;
		mv.addObject("num1", num1);
		mv.addObject("num2", num2);
		mv.addObject("sum", sum);
		return mv;
	}
	
	@GetMapping("employeeForm")
	public String employeeForm()
	{
		return "employeeForm";
	}
	
	@GetMapping("/addNumbers")
	public ModelAndView addNumbers(@RequestParam int num1, @RequestParam int num2)
	{
		ModelAndView mv = new ModelAndView("calculateSum");
		int sum = num1+num2;
		mv.addObject("num1", num1);
		mv.addObject("num2", num2);
		mv.addObject("sum", sum);
		return mv;
	}
	
	@GetMapping("/combine")
	public ModelAndView combine(@RequestParam String str1, @RequestParam String str2)
	{
		ModelAndView mv = new ModelAndView("combine");
		mv.addObject("str1", str1);
		mv.addObject("str2", str2);
		return mv;
	}
	
	@GetMapping("/calculate")
	public ModelAndView calculate(@RequestParam int num1, @RequestParam int num2)
	{
		ModelAndView mv = new ModelAndView("calculate");
		int sum = num1+num2;
		int mul = num1*num2;
		mv.addObject("num1", num1);
		mv.addObject("num2", num2);
		mv.addObject("sum", sum);
		mv.addObject("mul", mul);
		return mv;
	}
}
