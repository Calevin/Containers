package com.calevin.springboothelloworld.repository;

import com.calevin.springboothelloworld.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
    List<Greeting> findByText(String text);
}