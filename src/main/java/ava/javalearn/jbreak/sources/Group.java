package ava.javalearn.jbreak.sources;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Group {

    private User[] users;
    private List<User> userList;
    private Map<String, User> nameToUser;

    // Сделать источник пользователей в существующем классе Froup
    public Stream<User> users() {
        return Arrays.stream(users);
    }

    public Stream<User> users1() {
        return nameToUser.values().stream();
    }

    public Stream<User> users2() {
        return userList.stream();
    }

    @Data
    @AllArgsConstructor
    private class User {
        private String name;

    }
}
