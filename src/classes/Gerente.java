package classes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

public class Gerente extends Funcionario {
    private LocalDate data_ingr_gerente;
    private int nro_agencia; // Nro da agencia em que trabalha
    private Set<String> cursos; // O melhor é um conjunto?
    private static BigDecimal comissao;

    public BigDecimal CalcSal() {
        return super.getSalario().add(comissao);
    }

    public static BigDecimal getComissao() {
        return comissao;
    }

    public static void setComissao(BigDecimal comis) {
        comissao = comis;
    }
}
