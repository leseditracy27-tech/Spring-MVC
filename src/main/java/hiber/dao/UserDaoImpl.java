package hiber.dao;

import hiber.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    public void saveUser(User user) {
        if (user.getId() == null) {
            entityManager.persist(user);
        } else {
            entityManager.merge(user);
        }
    }

    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    public void deleteUser(Long id) {
        User user = getUserById(id);
        if (user != null) entityManager.remove(user);
    }

    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User findId(Long id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(Long id) {

    }
}
