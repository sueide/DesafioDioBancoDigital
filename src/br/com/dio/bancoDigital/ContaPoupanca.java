package br.com.dio.bancoDigital;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***\tExtrato Conta Poupança\t***");
        super.imprimirInfoComuns();
    }

}
