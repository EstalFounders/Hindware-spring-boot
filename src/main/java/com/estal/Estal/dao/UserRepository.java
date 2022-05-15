package com.estal.Estal.dao;

import com.estal.Estal.entity.SihEntity;
import org.hibernate.annotations.SQLUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;


@Transactional
public interface UserRepository extends JpaRepository<SihEntity, Long> {
  // write custom methods here

  @Query(value = "SELECT * FROM sql6492441.southIndiaHead WHERE user_name = :username", nativeQuery = true)
  SihEntity findByUsername(String username);

}
