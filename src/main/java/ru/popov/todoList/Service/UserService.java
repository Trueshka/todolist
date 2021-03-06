package ru.popov.todoList.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.popov.todoList.Persist.entity.User;
import ru.popov.todoList.Persist.repo.UserRepository;
import ru.popov.todoList.repr.UserRepr;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void create(UserRepr userRepr){
        User user=new User();
        user.setUsername(userRepr.getUsername());
        user.setPassword(userRepr.getPassword());
        userRepository.save(user);
    }

}
