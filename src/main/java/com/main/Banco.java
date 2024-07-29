package com.main;

import java.util.List;

/**
 * Representa um banco que gerencia um conjunto de contas bancárias.
 * 
 * <p>Esta classe contém o nome do banco e uma lista de contas associadas a ele.</p>
 * 
 * @author Rommel
 * @version 1.0
 */
public class Banco {

    private String nome;
    private List<Conta> contas;

    /**
     * Retorna o nome do banco.
     * 
     * @return o nome do banco
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do banco.
     * 
     * @param nome o nome do banco a ser definido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a lista de contas associadas ao banco.
     * 
     * @return a lista de contas
     */
    public List<Conta> getContas() {
        return contas;
    }

    /**
     * Define a lista de contas associadas ao banco.
     * 
     * @param contas a lista de contas a ser definida
     */
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
