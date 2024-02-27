package com.lucas.techchallenge.common.daos;

import com.lucas.techchallenge.core.entities.CPF;
import com.lucas.techchallenge.core.entities.Email;
import com.lucas.techchallenge.core.entities.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class UserDao {
    @Id
    private UUID id;
    private String username;
    private String cpf;
    private String email;

    public UserDao() {}

    public UserDao(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.cpf = user.getCpf().toString();
        this.email = user.getEmail().toString();
    }
}
