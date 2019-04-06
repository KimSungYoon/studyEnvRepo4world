package world;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web {
	
	@RequestMapping("name")
	public String world() {
		return "This is world 9";
	}
}
 