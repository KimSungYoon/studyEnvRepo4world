package world;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web {

//	@RequestMapping("/hello")
//	public String hello() {
//		return "This is hello 6";
//	}
	
	@RequestMapping("/world")
	public String world() {
		return "This is world 6";
	}
}
 