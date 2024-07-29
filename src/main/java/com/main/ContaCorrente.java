package com.main;

/**
 * Representa uma conta corrente, que é um tipo específico de conta bancária.
 * 
 * <p>Esta classe estende a classe {@link Conta} e implementa o método {@link #imprimirExtrato()} para
 * exibir o extrato da conta corrente.</p>
 * 
 * @author Rommel
 * @version 1.0
 */
public class ContaCorrente extends Conta {

    /**
     * Cria uma nova conta corrente para o cliente especificado.
     * 
     * @param cliente o cliente associado à conta corrente
     */
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    /**
     * Imprime o extrato da conta corrente.
     * 
     * <p>Este método exibe uma mensagem específica para contas correntes e, em seguida, imprime as
     * informações comuns da conta.</p>
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfosComuns();
    }
}
