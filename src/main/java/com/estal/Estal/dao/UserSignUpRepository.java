package com.estal.Estal.dao;

import com.estal.Estal.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;


@Transactional
public interface UserSignUpRepository extends JpaRepository<UserEntity, Long> {
  // write custom methods here

}
