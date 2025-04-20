package Java8Features;

import java.util.Optional;

public class OptionalExample {

    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static Optional<User> findUserById(String userId) {
        if ("123".equals(userId)) {
            return Optional.of(new User("Alice"));
        }
        return Optional.empty();  // User not found
    }

    public static void main(String[] args) {
        Optional<User> user = findUserById("456");

        String name = user.map(User::getName)
                .orElse("Unknown User");

        System.out.println(name);  // Outputs: Unknown User
    }
}
