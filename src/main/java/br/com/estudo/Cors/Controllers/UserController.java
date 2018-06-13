package br.com.estudo.Cors.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/users")
	@ResponseBody
	public String getUsers() {
		return "{\"users\":[{\"name\":\"Andy\", \"country\":\"Brazil\"}," +
		           "{\"name\":\"Chun-li\",\"country\":\"China\"}]}";
	}
}