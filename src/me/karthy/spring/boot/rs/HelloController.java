package me.karthy.spring.boot.rs;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author karthy
 *
 */
@RestController
@RequestMapping("/home")
public class HelloController {

	@RequestMapping("/getIndex")
	public String getIndex() {
		
		return "Greetings from Spring Boot!";
	}

}