package com.hindware.hindware.dao;

import com.hindware.hindware.entity.SihEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;


@Transactional
public interface SihRepository extends JpaRepository<SihEntity, Long> {
  // write custom methods here

  @Query(value = "SELECT * FROM sql6492441.south_India_head WHERE user_name = :username", nativeQuery = true)
  SihEntity findsihByUsername(String username);

}
