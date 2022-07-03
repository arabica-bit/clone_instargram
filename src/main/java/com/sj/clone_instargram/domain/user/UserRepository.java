package com.sj.clone_instargram.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository {
    User findUserByEmail(String email);
    User findUserById(Long id);
}
