package de.openknowledge.user.service;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("users")
@Singleton
@Produces(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    private UserRepository repository;

    @GET
    public Response getAllUsers() {
        return Response.ok(repository.getAllUsers()).build();
    }
}
