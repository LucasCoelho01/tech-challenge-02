package com.lucas.techchallenge.external.repositories;

import com.lucas.techchallenge.common.daos.ProductDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepositoryImpl extends JpaRepository<ProductDao, UUID> {
}
