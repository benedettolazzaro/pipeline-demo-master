package it.corso.esempio.controller;

import it.corso.esempio.pojo.HelloResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello2")
public class HelloController2 {

	@RequestMapping(value = "/status", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HelloResponse getStatus() {
		HelloResponse res = new HelloResponse();
		res.setStatus("OK");
		return res;
	}
}
