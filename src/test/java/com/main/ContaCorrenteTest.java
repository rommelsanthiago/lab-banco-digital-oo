package com.main;

import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {

    @Test
    public void testImprimirExtrato() {
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente Teste");
        ContaCorrente conta = new ContaCorrente(cliente);
        conta.depositar(500);
        conta.imprimirExtrato();  // Este teste não valida a saída do console, apenas executa o método para garantir que não há exceções
    }
}
