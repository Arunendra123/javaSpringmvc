package javaSpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	 @RequestMapping("/")
     public String home() {
		 System.out.println("This is home resolver!!");
    	 return "index";
     }
	 
	 @RequestMapping("/main")
     public String main() {
		 System.out.println("This is main resolver!!");
    	 return "main";
     }
	 
	 @RequestMapping("/result")
     public String result() {
		 System.out.println("This is result using JSP resolver!!");
		 return "result";
     }
	 
	 @RequestMapping("/TransferDataUsingModel")
     public String model(Model model) {
		 System.out.println("This is TransferDataUsingModel resolver!!");	 
		 String name="Test";
		 String id="testId";		 
         model.addAttribute("name",name);
         model.addAttribute("id",id);
		 return "TransferDataUsingModel";
     }
	 
	 @RequestMapping("/TransferListUsingModel")
     public String model_list(Model model) {
		 System.out.println("This is TransferListUsingModel resolver!!"); 
         model.addAttribute("list",CustomList.getList()); 
		 return "TransferListUsingModel";
     }
	 
	 @RequestMapping("/TransferListUsingModelAndView")
     public ModelAndView modelAndView() {
		 System.out.println("This is TransferListUsingModelAndView resolver!!"); 
		 ModelAndView mv=new ModelAndView();
         mv.addObject("list",CustomList.getList());
         mv.setViewName("TransferListUsingModelAndView");
		 return mv;
     }
	 
	 @RequestMapping("/ReadDataUsingEL")
     public ModelAndView usingel() {
		 System.out.println("This is ReadDataUsingEL resolver!!"); 
		 ModelAndView mv=new ModelAndView();
         mv.addObject("list",CustomList.getList());
         mv.setViewName("ReadDataUsingEL");
		 return mv;
     }
	 
	 @RequestMapping("/ReadDataUsingJSTL")
     public ModelAndView usingjstl() {
		 System.out.println("This is ReadDataUsingJSTL resolver!!");	 
		 ModelAndView mv=new ModelAndView();
         mv.addObject("list",CustomList.getList());
         mv.setViewName("ReadDataUsingJSTL");
		 return mv;
     }
}
