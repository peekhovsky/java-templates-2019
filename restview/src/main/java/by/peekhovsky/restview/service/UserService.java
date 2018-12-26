package by.peekhovsky.restview.service;

import by.peekhovsky.restview.model.User;
import by.peekhovsky.restview.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAllUsers() {
        return repository.findAll();
    }

    public Optional<User> findById(final long id) {
        return Optional.of(repository.findOne(id));
    }

}
