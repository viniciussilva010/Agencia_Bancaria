package classes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Conta {
    protected String senha;
    protected int nro_conta;
    protected BigDecimal saldo;
    protected LocalDateTime data_abertura;
    protected LocalDateTime ult_movimentacao;
}
