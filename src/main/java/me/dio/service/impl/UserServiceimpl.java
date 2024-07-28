package me.dio.service.impl;

import me.dio.model.User;
import me.dio.repository.UserRepository;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class UserServiceimpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceimpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("User not found with id: " + id));
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This User Id already exists.");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public void deleteById(Long id) {
        if(!userRepository.existsById(id)) {
            throw new NoSuchElementException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }


}
