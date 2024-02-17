package com.lucas.techchallenge.external.repositories;

import com.lucas.techchallenge.common.daos.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepositoryImpl extends JpaRepository<UserDao, UUID> {
}
