package br.com.dio.bancoDigital;

public abstract class Conta implements Transacao{
    private static final int AGENCIA_PADRAO = 1;
    private static Integer SEQUENCIAL = 1;
    protected String tipoDeConta;
    protected Integer agencia;
    protected Integer numeroConta;
    protected Double saldoConta = 0d;

    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }
    @Override
    public void sacar(Double valor) {
        this.saldoConta -= valor;
    }

    @Override
    public void depositar(Double valor) {
        this.saldoConta += valor;
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimirInfoComuns() {
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d",this.agencia));
        System.out.println(String.format("Conta: %d",this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldoConta));
    }

}
