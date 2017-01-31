package com.sample.restapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.sample.restapi.model.SearchResponse;

@SpringBootApplication
public class ConsumerApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ConsumerApplication.class);

	public static void main(String[] args) {
		
		RestTemplate restTemplate = new RestTemplate();
		SearchResponse searchResponse = restTemplate.getForObject("http://www.omdbapi.com?s=rush", SearchResponse.class);
		
		log.info(searchResponse.toString());
	}
}
