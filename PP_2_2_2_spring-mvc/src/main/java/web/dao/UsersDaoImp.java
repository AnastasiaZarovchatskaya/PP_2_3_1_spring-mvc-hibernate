package web.dao;

import org.springframework.stereotype.Repository;
import web.dao.UsersDao;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
public class UsersDaoImp implements UsersDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    @Override
    public List<User> index() {
        return entityManager.createQuery("select p from User p", User.class)
                .getResultList();
    }

    @Transactional
    @Override
    public User show(int id) {
        return entityManager.find(User.class,id);
    }

    @Transactional
    @Override
    public void save(User user) {
        entityManager.persist(user);

    }

    @Transactional
    @Override
    public void update(User updatedUsers) {
        entityManager.merge(updatedUsers);
    }

    @Transactional
    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}