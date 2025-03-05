package org.equinox.errorhandling.service;

import org.equinox.errorhandling.models.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(Long id);
}
