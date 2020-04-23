package it.corso.esempio.controller;

import it.corso.esempio.pojo.HelloResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloControllerTest3 {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testStatusOk() {
		HelloResponse actual = this.restTemplate.getForObject("/hello3/status", HelloResponse.class);
		HelloResponse expected = buildExpectedOkResponse();
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void testStatusOk2() {
		HelloResponse actual = this.restTemplate.getForObject("/hello3/status2", HelloResponse.class);
		HelloResponse expected = buildExpectedOkResponse();
		assertThat(actual).isEqualTo(expected);
	}

	private HelloResponse buildExpectedOkResponse() {
		HelloResponse res = new HelloResponse();
		res.setStatus("OK");
		return res;
	}

}
