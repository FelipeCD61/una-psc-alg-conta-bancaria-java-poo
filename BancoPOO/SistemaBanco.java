public class SistemaBanco {
    private String nome;
    private String numeroConta;
    private double saldoInicial;
    private double saldo;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        saldo = saldoInicial;
        return saldo;
    }

    private double valorDepositar;
    private double valorSacar;

    public void setValorDepositar(double valorDepositar) {
        this.valorDepositar = valorDepositar;
    }
    public double getValorDepositar() {
        return valorDepositar;
    }

    public void setValorSacar(double valorSacar) {
        this.valorSacar = valorSacar;
    }
    public double getValorSacar() {
        return valorSacar;
    }

    public double depositar(double valorDepositar) {
        return saldo =+ valorDepositar;
    }

    public double sacar(double valorSacar) {
        return saldo =- valorSacar;
    }

    public double saldoDisponivel(double saldo) {
        return saldo;
    }
}