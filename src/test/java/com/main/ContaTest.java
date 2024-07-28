package com.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    public void testDepositar() {
        Cliente cliente = new Cliente();
        Conta conta = new ContaCorrente(cliente);
        conta.depositar(200);
        assertEquals(200, conta.getSaldo());
    }

    @Test
    public void testTransferir() {
        Cliente cliente = new Cliente();
        Conta contaOrigem = new ContaCorrente(cliente);
        Conta contaDestino = new ContaPoupanca(cliente);
        contaOrigem.depositar(200);
        contaOrigem.transferir(100, contaDestino);
        assertEquals(100, contaOrigem.getSaldo());
        assertEquals(100, contaDestino.getSaldo());
    }
}
