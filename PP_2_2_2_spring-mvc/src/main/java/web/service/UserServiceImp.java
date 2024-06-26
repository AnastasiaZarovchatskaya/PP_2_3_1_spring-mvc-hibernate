package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UsersDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;
@Component
public class UserServiceImp implements UserService {

    private UsersDao usersDao;
    @Autowired
    public UserServiceImp(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public List<User> index(){
        return usersDao.index();
    }
    @Transactional
    @Override
    public User show(int id){
        return usersDao.show(id);
    }

    @Transactional
    @Override
    public void save(User user){
        usersDao.save(user);
    }

    @Transactional
    @Override
    public void update(User updatedUsers){
        usersDao.update(updatedUsers);
    }

    @Transactional
    @Override
    public void delete(int id){
        usersDao.delete(id);
    }
}
