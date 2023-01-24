/**
 * 
 */
package k23.SB278CarDatabaseWeek12.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {
	
	@RequestMapping("main")
	@ResponseBody
	public String showMainPage() {
			return "This is the main page";
	}
	
	@RequestMapping("index")
	@ResponseBody
	public String showIndex() {
			return "This Is The Main Page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String showContact() {
			return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello(@RequestParam(name="location", required=false, defaultValue="strange world") String location, 
		@RequestParam(name="name", required=false, defaultValue="stranger") String name) {
			return "Welcome to the " + location + " " + name;
	}

}
