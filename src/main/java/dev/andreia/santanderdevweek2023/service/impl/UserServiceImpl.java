package dev.andreia.santanderdevweek2023.service.impl;

import dev.andreia.santanderdevweek2023.model.User;
import dev.andreia.santanderdevweek2023.repository.UserRepository;
import dev.andreia.santanderdevweek2023.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return this.userRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
    }

    @Override
    public User create(User userToCreate) {
        if(this.userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account Number already exists.");
        }

        return this.userRepository.save(userToCreate);
    }
}
