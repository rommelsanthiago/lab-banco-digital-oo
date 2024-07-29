package com.main;

/**
 * Representa uma conta bancária.
 * 
 * <p>Esta classe permite criar uma conta bancária e realizar operações como depósito, transferência e saque.</p>
 * 
 * @author Rommel
 * @version 1.0
 */
public abstract class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    /**
     * Cria uma nova conta bancária para o cliente especificado.
     * 
     * @param cliente o cliente associado à conta
     */
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    /**
     * Realiza um depósito na conta.
     * 
     * @param valor o valor a ser depositado
     */
    public void depositar(double valor) {
        saldo += valor;
    }

    /**
     * Realiza um saque da conta.
     * 
     * @param valor o valor a ser sacado
     */
    public void sacar(double valor) {
        saldo -= valor;
    }

    /**
     * Transfere um valor para outra conta.
     * 
     * @param valor o valor a ser transferido
     * @param contaDestino a conta para a qual o valor será transferido
     */
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    /**
     * Retorna o número da agência da conta.
     * 
     * @return o número da agência
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * Retorna o número da conta.
     * 
     * @return o número da conta
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Retorna o saldo atual da conta.
     * 
     * @return o saldo da conta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Imprime informações comuns da conta, como titular, agência, número e saldo.
     */
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses para imprimir o extrato da conta.
     */
    public abstract void imprimirExtrato();
}
