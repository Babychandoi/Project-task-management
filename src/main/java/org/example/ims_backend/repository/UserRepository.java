package org.example.ims_backend.repository;

import org.example.ims_backend.common.RoleLogin;
import org.example.ims_backend.dto.admin.response.UserResponse;
import org.example.ims_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
    List<User> findAllByIsActiveAndIsAdmin(int isActive, int isAdmin);

}
