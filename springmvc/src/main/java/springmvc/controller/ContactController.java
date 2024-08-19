package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.servie.UserService;

@Controller
public class ContactController {
	
	private UserService userservice;
	
	@RequestMapping("/Contact")
	public String showForm(Model m) {
		System.out.println("contact page>>>>>>>>>>.");
		return "Contact";
	}
	
//	Used for common value
	@ModelAttribute
	public void common(Model m) {
		System.out.println("contact page>>>>>>>>>>.");
		m.addAttribute("Header", "Kamal contact");
		m.addAttribute("Desc", "DESC of page");
		
	}
	
//	Using HttpServeletRequest
	
//	@RequestMapping(path="/processform",method=RequestMethod.POST)
//	public String handleForm(HttpServletRequest request) {
//		String email=request.getParameter("email");
//		System.out.println("email is   : " +email);
//		return "thankyou";
//	}
	
//	Using @RequestParam
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@RequestParam(name="email",required = false) String userEmail , 
			@RequestParam("username") String name,
			@RequestParam("password") String password, Model model) {
		
//		View to Controller data print  (Brown)
		
// (brown)		System.out.println("email is   : " +userEmail);  ( after + green)
//		System.out.println("Username   :" +name);
//		System.out.println("password   :" +password);
//		
		
//		model.addAttribute("name", name);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", password);
		
//		Form Handling with @ModelAttribute
		
		User user=new User();
		user.setEmail(userEmail);
		user.setUsername(name);
		user.setPassword(password);
		
		System.out.println("email is   : " +userEmail);
		System.out.println("Username   :" +name);
		System.out.println("password   :" +password);
		
		model.addAttribute("user",user);
		
		return "thankyou";
	}
	

	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute ("user") User user, Model model) {
		
		System.out.println(user);
		this.userservice.ceateUser(user);
		
		return "thankyou";
	}
}
