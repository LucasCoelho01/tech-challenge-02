package com.lucas.techchallenge.communication.gateways;

import com.lucas.techchallenge.common.daos.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserDao, UUID> {
}
