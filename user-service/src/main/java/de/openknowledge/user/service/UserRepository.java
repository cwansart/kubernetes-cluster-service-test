package de.openknowledge.user.service;

import javax.inject.Singleton;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Singleton
public class UserRepository {

    private List<User> users = Arrays.asList(
        new User("Marie"),
        new User("Max"),
        new User("Larissa"),
        new User("Lars")
    );

    public List<User> getAllUsers() {
        return Collections.unmodifiableList(users);
    }
}
