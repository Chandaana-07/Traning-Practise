package jsp.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController{
	
	@GetMapping("/html-request")
	@ResponseBody
	public String htmlRequest(){
		return """
				<html>
				<body style='font-family:Arial;'>
				<h2>Hello from Spring Mvc Demo-HEllO CONTROLLER</h2>
				<p>This html is from HelloController</p>
				</body>
				</html>
				""";
	}
	
	@GetMapping("/hello-html")
	public String helloHtml(Model model) {
		model.addAttribute("App_name","Simple MVC Application");
		model.addAttribute("author","Chandana");
		model.addAttribute("message","Hello from JSP page via Spring MVC application");
	return "hello";
	
	}
	}



