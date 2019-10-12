package de.openknowledge.greeting.service;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Singleton;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;

@RequestScoped
public class UserRepository {

    private URI uri;

    @PostConstruct
    public void init() throws URISyntaxException {
        String host = Objects.requireNonNull(System.getenv("USER_SERVICE_SERVICE_HOST"), "User service host env not found");
        String port = Objects.requireNonNull(System.getenv("USER_SERVICE_SERVICE_PORT"), "User service port env not found");
        uri = new URI(String.format("http://%s:%s", host, port));
    }

    public List<User> getAllUsers() {
        return RestClientBuilder.newBuilder().baseUri(uri).build(UserServiceClient.class).getAllUsers();
    }
}
