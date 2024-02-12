package com.lucas.techchallenge.core.entities;

import lombok.Data;

@Data
public class CPF {
    private String cpf;

    public CPF(String cpf) throws Exception {
        boolean isCpfvalid = validateCpf(cpf);

        if (isCpfvalid) {
            this.cpf = cpf;
        } else {
            throw new Exception("CPF invalid !!!!!!!");
        }
    }

    private boolean validateCpf(String cpf) {
        return true;
    }
}
