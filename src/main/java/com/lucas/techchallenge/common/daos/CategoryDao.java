package com.lucas.techchallenge.common.daos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lucas.techchallenge.common.daos.ProductDao;
import com.lucas.techchallenge.common.dtos.CategoryDto;
import com.lucas.techchallenge.core.entities.Category;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "categories")
public class CategoryDao {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private UUID id;
    private String categoryName;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private Set<ProductDao> products;

    public CategoryDao() {}

    public CategoryDao(Category category) {
        this.categoryName = category.getCategoryName();
    }
}
