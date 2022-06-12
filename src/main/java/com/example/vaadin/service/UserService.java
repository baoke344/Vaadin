package com.example.vaadin.service;

import com.example.vaadin.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class UserService {

    private final WebClient webclient;

    public UserService(WebClient.Builder builder) {
        webclient = builder.baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    public User[] getUsers() {
        return webclient
                .get()
                .uri("/users")
                .retrieve()
                .bodyToMono(User[].class).block();
    }

}
