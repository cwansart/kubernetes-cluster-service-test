package de.openknowledge.greeting.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("api/users")
public interface UserServiceClient {

    @GET
    List<User> getAllUsers();
}
