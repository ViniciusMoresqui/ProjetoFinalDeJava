package com.vm.fastfood.users;

import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserModel,Long> {
    UserDetails findByLogin(String role);

}
