package com.main;

/**
 * Representa uma conta poupança, que é um tipo específico de conta bancária.
 * 
 * <p>Esta classe estende a classe {@link Conta} e implementa o método {@link #imprimirExtrato()} para
 * exibir o extrato da conta poupança.</p>
 * 
 * @author Rommel
 * @version 1.0
 */
public class ContaPoupanca extends Conta {

    /**
     * Cria uma nova conta poupança para o cliente especificado.
     * 
     * @param cliente o cliente associado à conta poupança
     */
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    /**
     * Imprime o extrato da conta poupança.
     * 
     * <p>Este método exibe uma mensagem específica para contas poupança e, em seguida, imprime as
     * informações comuns da conta.</p>
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
