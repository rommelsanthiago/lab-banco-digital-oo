package com.main;

/**
 * Define as operações básicas que uma conta bancária deve suportar.
 * 
 * <p>Esta interface especifica os métodos para saque, depósito, transferência e impressão de extrato.</p>
 * 
 * @author Rommel
 * @version 1.0
 */
public interface IConta {

    /**
     * Realiza um saque na conta.
     * 
     * @param valor o valor a ser sacado
     */
    void sacar(double valor);

    /**
     * Realiza um depósito na conta.
     * 
     * @param valor o valor a ser depositado
     */
    void depositar(double valor);

    /**
     * Transfere um valor para outra conta.
     * 
     * @param valor o valor a ser transferido
     * @param contaDestino a conta para a qual o valor será transferido
     */
    void transferir(double valor, IConta contaDestino);

    /**
     * Imprime o extrato da conta.
     */
    void imprimirExtrato();
}
