package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("First")
public class HomeController {

//	Model
    @RequestMapping(path="/home", method = RequestMethod.GET)
    public String home(Model model) {
        System.out.println("This is home url");
        
        model.addAttribute("name", "Kamal");
        
        List<String> friends =new ArrayList<String>();
        friends.add("Kamal");
        friends.add("Kishor");
        friends.add("ABC");
        
        model.addAttribute("friendlist", friends);
        
        
        return "index";
    }
    
    
    @RequestMapping("/about")
    public String aubout() {
        System.out.println("This is about page");
        return "about";
    }
    
//    ModelAndView
    @RequestMapping("/help")
    public ModelAndView home() {
    	System.out.println("This is help controller");
    	
//    	Creating model and view object
    	ModelAndView modelandview = new ModelAndView();
    	
//    	setting the data
    	modelandview.addObject("name", "KKB");
    	
//    	setting the view name
    	modelandview.setViewName("help");
    	
    	LocalDateTime now = LocalDateTime.now();
    	modelandview.addObject("time", now);
    	
    	List<Integer> marks=new ArrayList<Integer>();
    	marks.add(34);
    	marks.add(43);
    	marks.add(50);
    	modelandview.addObject("marks", marks);
    	
    	return modelandview;
    }
}
