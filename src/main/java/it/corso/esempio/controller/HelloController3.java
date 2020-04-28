package it.corso.esempio.controller;

import it.corso.esempio.pojo.HelloResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello3")
public class HelloController3 {

	@RequestMapping(value = "/status", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HelloResponse getStatus() {
		HelloResponse res = new HelloResponse();
		res.setStatus("OK");
		return res;
	}

	@RequestMapping(value = "/status2", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HelloResponse getStatus2() {
		HelloResponse res = new HelloResponse();
		res.setStatus("OK");
		return res;
	}
}
