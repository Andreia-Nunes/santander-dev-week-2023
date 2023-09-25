package dev.andreia.santanderdevweek2023.service;

import dev.andreia.santanderdevweek2023.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
