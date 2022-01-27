package javaSpringMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
   @RequestMapping("/loadform")
   public String loadForm() {
	   System.out.println("This is loadform resolver!!");
	   return "form";
   }
   
   @RequestMapping("/loadform_1")
   public String loadForm1() {
	   System.out.println("This is loadform resolver!!");
	   return "form1";
   }
    /*
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) public String
	 * processForm(HttpServletRequest req) {
	 * System.out.println("This is processForm resolver!!");
	 * System.out.println("email: "+ req.getParameter("email"));
	 * System.out.println("username: "+ req.getParameter("username"));
	 * System.out.println("password: "+ req.getParameter("password")); return
	 * "form"; }
	 */
   
   //////////////////////////////////////////////////////////////////////////////
   @RequestMapping(path="/processform",method=RequestMethod.POST)
   public String processForm(@RequestParam("email") String email,
		                     @RequestParam("username") String username,
		                     @RequestParam("password") String password,Model model) {
	   System.out.println("This is processForm resolver!!");
	   System.out.println("email: "+email);
	   System.out.println("username: "+username);
	   System.out.println("password: "+password);
	   
	   model.addAttribute("email",email);
	   model.addAttribute("username",username);
	   model.addAttribute("password",password);
	   
	   User user=new User(email,username,password);
	   model.addAttribute("user",user);
	   
	   return "submitFormUsingRequestParamAndModel";
   }
   
   
   /////////////////////////////////////////////////////////////////////////////////
   @RequestMapping(path="/processform_1",method=RequestMethod.POST)
   public String processForm_1(@ModelAttribute User user,Model model) {   
	   System.out.println("This is processForm-1 resolver!!");
	   model.addAttribute("user",user);
	   return "submitFormUsingModelAttribute";
   }
   
   @ModelAttribute
   public void modelDemo(Model model) {
	   model.addAttribute("Arunendra","Wellcome to our world!!");
	   System.out.print("@ModelAttribute on method...");
   }
}
