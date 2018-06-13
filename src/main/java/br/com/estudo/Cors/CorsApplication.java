package br.com.estudo.Cors;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class CorsApplication {

	@Value("${server.port}")
	private static String server_port;
	
	@RequestMapping("/home")
	public String hello() {
		return "Its Working!";
	}
	
	public static void main(String[] args) {
		//SpringApplication.run(CorsApplication.class, args);
		SpringApplication corsapplication = new SpringApplication(CorsApplication.class);
		Map<String, Object> map = new HashMap<>();
        map.put("SERVER_PORT", server_port);
        corsapplication.setDefaultProperties(map);
        corsapplication.run(args);
	}
}
