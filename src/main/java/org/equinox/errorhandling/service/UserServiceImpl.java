package org.equinox.errorhandling.service;

import org.equinox.errorhandling.models.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private List<User> users;

    @Override
    public Optional<User> findById(Long id) {
/*        User user = null;
        for (User user1 : users) {
            if (user1.getId().equals(id)) {
                user = user1;
                break;
            }
        return Optional.ofNullable(user);
        }
*/
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    @Override
    public List<User> findAll() {
        return users;
    }
}
