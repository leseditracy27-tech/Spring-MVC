package hiber.dao;

import hiber.model.User;
import java.util.List;

public interface UserDao {

    List<User> findAll();

    User findId(Long id);

    void save(User user);

    void delete(Long id);
}