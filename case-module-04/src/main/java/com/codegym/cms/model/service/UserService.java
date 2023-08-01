package com.codegym.cms.model.service;

import com.codegym.cms.model.dto.UserDto;
import com.codegym.cms.model.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> getUsers();
//    List<UserDto> getUsersByFullName(String fullName);
    UserDto getUserById(Integer userId);
    Iterable<UserDto> findAll();
    Optional<UserDto> findById(Integer id);
    void save(UserDto userDto);
    void remove(Integer id);

    User findByUsername(String username);
    boolean checkLogin(String username, String password);
}
