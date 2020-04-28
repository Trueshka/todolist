package ru.popov.todoList.Persist.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.popov.todoList.Persist.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
