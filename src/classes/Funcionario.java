package classes;

import java.math.BigDecimal;
import java.time.LocalDate;

import enums.EstadoCivil;
import enums.Sexo;

public class Funcionario {
    private String nomeCompleto;
    private String cpf;
    private String rg;
    private int nro_cart;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private Sexo sexo;
    private EstadoCivil estadoCivil;
    private String cargo;
    private BigDecimal salario;
    private LocalDate anoIngresso;

}
