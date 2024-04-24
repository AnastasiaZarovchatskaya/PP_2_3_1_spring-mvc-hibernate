package web.dao;

import web.model.User;

import java.util.List;

public interface UsersDao {
     List<User> index();
     User show(int id);
     void save(User user);
     void update(User updatedUsers);
     void delete(int id);




}
