package com.calevin.springboothelloworld.service;

import com.calevin.springboothelloworld.model.Greeting;
import com.calevin.springboothelloworld.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {
    private GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Optional<Greeting> findOne(Long id) {
        var greeting = greetingRepository.findById(id);
        return greeting;
    }
}
