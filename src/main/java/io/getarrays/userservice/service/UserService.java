package io.getarrays.userservice.service;

import io.getarrays.userservice.domain.Role;
//import io.getarrays.userservice.domain.User;
import io.getarrays.userservice.domain.User1;

import java.util.List;

/**
 * @author Get Arrays (https://www.getarrays.io/)
 * @version 1.0
 * @since 7/10/2021
 */
public interface UserService {
    User1 saveUser(User1 user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User1 getUser(String username);
    List<User1>getUsers();
}
