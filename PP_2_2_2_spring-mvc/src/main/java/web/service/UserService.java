package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(User updatedUsers);
    void delete(int id);
}
