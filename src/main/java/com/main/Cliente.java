package com.main;

/**
 * Representa um cliente com informações básicas.
 * 
 * <p>Esta classe contém o nome do cliente e métodos para obter e definir o nome.</p>
 * 
 * @author Rommel
 * @version 1.0
 */
public class Cliente {

    private String nome;

    /**
     * Retorna o nome do cliente.
     * 
     * @return o nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente.
     * 
     * @param nome o nome do cliente a ser definido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
