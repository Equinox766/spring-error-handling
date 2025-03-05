package org.equinox.errorhandling;

import org.equinox.errorhandling.models.domain.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean("default")
    List<User> Users() {
        return Arrays.asList(
            new User(1L, "John", "Doe"),
            new User(2L, "Jane", "Doe"),
            new User(3L, "Jack", "Doe"),
            new User(4L, "Jack", "Doe"),
            new User(5L, "Jack", "Doe")
        );
    }
}
