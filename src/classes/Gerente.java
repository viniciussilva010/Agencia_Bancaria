package classes;

import java.time.LocalDate;
import java.util.Set;

public class Gerente extends Funcionario {
    private LocalDate data_ingr_gerente;
    private int nro_agencia; // Nro da agencia em que trabalha
    private Set<String> cursos; // O melhor é um conjunto?
}
