package br.com.estudo.Cors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class CorsApplication {

	  @RequestMapping("/")
	    @ResponseBody
	    String home() {
	        return "Its Workings!";
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(CorsApplication.class, args);
	}
}
