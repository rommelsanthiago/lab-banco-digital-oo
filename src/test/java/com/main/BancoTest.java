package com.main;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BancoTest {

    @Test
    public void testSetNome() {
        Banco banco = new Banco();
        banco.setNome("Banco Teste");
        assertEquals("Banco Teste", banco.getNome());
    }

    @Test
    public void testSetContas() {
        Banco banco = new Banco();
        List<Conta> contas = new ArrayList<>();
        banco.setContas(contas);
        assertEquals(contas, banco.getContas());
    }
}
