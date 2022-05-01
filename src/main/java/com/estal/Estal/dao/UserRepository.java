package com.estal.Estal.dao;

import com.estal.Estal.entity.sihEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;


@Transactional
public interface UserRepository extends JpaRepository<sihEntity, Long> {
  // write custom methods here

}
