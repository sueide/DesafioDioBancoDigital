package br.com.dio.bancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Sueide");
        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100d);
        Conta cp = new ContaPoupanca(cliente);
        cc.transferir(10d,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
