package com.calevin.springboothelloworld;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import com.calevin.springboothelloworld.model.Greeting;
import com.calevin.springboothelloworld.service.GreetingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/greeting")
public class GreetingController {
	private GreetingService greetingService;
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	public GreetingController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@GetMapping(path="/")
	public String helloWorld() {
		return "helloWorld";
	}

	@GetMapping("/hello")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/hello/{id}")
	public ResponseEntity<Greeting> getGreetingById(@PathVariable("id") Long id) {
		Optional<Greeting> greeting = greetingService.findOne(id);
		if(greeting.isPresent()) {
			return new ResponseEntity<>(greeting.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}