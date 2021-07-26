package javaSpringMVC.Notes;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

public class Notes {
	public static void main(String args[]) {
		 //Architecture....................................................
		 System.out.println("     Spring Web Model-View-Controller\r\n\n"
		 		+ "  ===============Web Browser==============\r\n"
		 		+ " |                                        |\r\n"
		 		+ " |                                        |\r\n"
		 		+ "Front Controller====>Controller=======>view ");
		 
			/*
			 * Model - A model contains the data of the application. A data can be a single
			 * object or a collection of objects. 
			 
			 * Controller - A controller contains the
			 * business logic of an application. Here, the @Controller annotation is used to
			 * mark the class as the controller. 
			 
			 * View - A view represents the provided
			 * information in a particular format. Generally, JSP+JSTL is used to create a
			 * view page. Although spring also supports other view technologies such as
			 * Apache Velocity, Thymeleaf and FreeMarker. 
		
			 * Front Controller - In Spring Web
			 * MVC, the DispatcherServlet class works as the front controller. It is
			 * responsible to manage the flow of the Spring MVC application.
			 */
		 
			/*
			 * Transfer the data from Controller to view
			 * 
			 * 1. Using Model Object 
			 * 
			 *   Model model = null; 
			 *   String name="Arunendra"; 
			 *   model.addAttribute("name",name);
			 * 
			 *   JSP side:
			 *   request.getAAttribute(name);
			 *   
			 * 2. Using ModelAndView Object
			 * 
			 *   ModelAndView mv=new ModelAndView();
			 *   mv.addObject("list",list);
			 *   mv.setViewName("modelandview_list");
			 *   
			 *   JSP side:
			 *    1. request.getAAttribute(list);
			 *   
			 *    2. Using Expression Language
			 *    <%@page isELIgnored="false" %>
			 *    ${list}
			 *   
			 */  
		 
		    /*
			 * Transfer the data from view to Controller
			 *  
			 */
	}
}
