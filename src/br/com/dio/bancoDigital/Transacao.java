package br.com.dio.bancoDigital;
/*
Interface com métodos a serem implemetados pelos vários tipos de conta
 */
public interface Transacao {
    void sacar(Double valor);
    void depositar(Double valor);
    void transferir(Double valor, Conta contaDestino);
    void imprimirExtrato();
}
