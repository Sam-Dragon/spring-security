package learn.spring.authentication.security.controllers;

import java.nio.charset.Charset;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest")
public class RestTemplateAuthenticationController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public String getByRest() {
		String url = "http://localhost:9092/authentication/basic/RestTemplate";
		ResponseEntity<String> outpot = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<>(createHeaders("user", "user")), String.class);

		return outpot.getBody();
	}

	HttpHeaders createHeaders(String username, String password) {
		return new HttpHeaders() {
			{
				String auth = username + ":" + password;
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};
	}

}
