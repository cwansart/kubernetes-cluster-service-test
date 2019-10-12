package de.openknowledge.greeting.service;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("greetings")
@Singleton
@Produces(MediaType.APPLICATION_JSON)
public class GreetingService {

    @Inject
    private UserRepository repository;

    @GET
    public Response getGreetings() {
        List<Greeting> greetings = repository.getAllUsers().stream()
            .map(Greeting::new)
            .collect(Collectors.toList());
        return Response.ok(greetings).build();
    }
}
