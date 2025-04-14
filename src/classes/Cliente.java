package classes;

import java.time.LocalDate;

import enums.EstadoCivil;

public class Cliente {
    private String nome;
    private String cpf;
    private LocalDate data_nasc;
    private Endereco endereco;
    private EstadoCivil est_civil;

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

}
