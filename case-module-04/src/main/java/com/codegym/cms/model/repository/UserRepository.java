package com.codegym.cms.model.repository;

import com.codegym.cms.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);

    @Query(nativeQuery = true,
            value = "SELECT r.name FROM roles r " +
                    "JOIN users_roles ur  on ur.role_id = r.id " +
                    "JOIN users u ON u.id = ur.user_id " +
                    "WHERE u.username = :username")
    List<String> findRolesByUsername(@Param("username") String username);
}
