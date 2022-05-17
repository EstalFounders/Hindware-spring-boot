package com.hindware.hindware.dao;

import com.hindware.hindware.entity.SihEntity;
import com.hindware.hindware.entity.ZonalManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;


@Transactional
public interface ZonalManagerRepository extends JpaRepository<ZonalManagerEntity, Long> {
  // write custom methods here

  @Query(value = "SELECT * FROM sql6492441.southIndiaHead WHERE user_name = :username", nativeQuery = true)
  SihEntity findsihByUsername(String username);

}
