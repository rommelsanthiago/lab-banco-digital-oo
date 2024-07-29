package com.main;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal da aplicação Spring Boot que configura e executa a aplicação.
 * 
 * <p>Esta classe implementa a interface {@link CommandLineRunner} para executar um código de exemplo quando a aplicação é iniciada.</p>
 * 
 * @author Rommel
 * @version 1.0
 */

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	/**
     * Método principal que inicia a aplicação Spring Boot.
     * 
     * @param args os argumentos da linha de comando
     */
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	/**
     * Método chamado após a inicialização da aplicação Spring Boot.
     * 
     * <p>Este método cria instâncias de {@link Cliente}, {@link ContaCorrente}, {@link ContaPoupanca} e {@link Banco}, 
     * realiza operações básicas como depósito, saque e transferência, e imprime os extratos e informações das contas.</p>
     * 
     * @param args os argumentos da linha de comando
     * @throws Exception se ocorrer algum erro durante a execução
     */
	@Override
	public void run(String... args) throws Exception {
		Cliente rommel = new Cliente();
		rommel.setNome("Rommel");

		Conta cc = new ContaCorrente(rommel);
		System.out.println("=== Criando nova conta corrente... ===");
		System.out.println("Conta corrente criada");
		System.out.println("Conta número: " + cc.numero + ", Titular: " + cc.cliente.getNome());
		Conta poupanca = new ContaPoupanca(rommel);
		System.out.println("=== Criando nova conta poupança... ===");
		System.out.println("Conta poupança criada");
		System.out.println("Conta número: " + poupanca.numero + ", Titular: " + poupanca.cliente.getNome());

		Banco banco = new Banco();
        banco.setNome("Banco Digital");
        banco.setContas(new ArrayList<>());
        banco.getContas().add(cc);
        banco.getContas().add(poupanca);

		cc.depositar(100);
		System.out.println("=== Deposito conta corrente ===");
		System.out.println("Deposito de " + cc.saldo + ", para o titular: " + cc.cliente.getNome());
		cc.sacar(50);
		System.out.println("=== Saque conta corrente ===");
		System.out.println("Saque de " + cc.saldo + ", para o titular: " + cc.cliente.getNome());
		cc.transferir(100, poupanca);
		System.out.println("=== Transferencia conta corrente para poupança ===");
		System.out.println("Transferencia de " + cc.saldo + ", para o titular: " + poupanca.cliente.getNome());
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		System.out.println("=== Contas no " + banco.getNome() + " ===");
        for (Conta conta : banco.getContas()) {
            System.out.println("Conta número: " + conta.getNumero() + ", Saldo: " + conta.getSaldo());
        }
	}
}
