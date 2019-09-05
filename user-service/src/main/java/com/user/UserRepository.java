package com.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
