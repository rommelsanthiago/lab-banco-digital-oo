package com.main;

import org.junit.jupiter.api.Test;

public class ContaPoupancaTest {

    @Test
    public void testImprimirExtrato() {
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente Teste");
        ContaPoupanca conta = new ContaPoupanca(cliente);
        conta.depositar(500);
        conta.imprimirExtrato();  // Este teste não valida a saída do console, apenas executa o método para garantir que não há exceções
    }
}
