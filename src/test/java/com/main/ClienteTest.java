package com.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    public void testSetNome() {
        Cliente cliente = new Cliente();
        cliente.setNome("Teste");
        assertEquals("Teste", cliente.getNome());
    }
}
