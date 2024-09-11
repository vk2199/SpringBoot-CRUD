package com.userApi.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userApi.UserEntity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{


}
