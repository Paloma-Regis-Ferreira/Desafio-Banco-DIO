package application;

import entities.model.Banco;
import entities.model.Cliente;
import entities.model.Conta;
import entities.model.ContaCorrente;
import entities.model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Banco bancoNovo = new Banco();
		bancoNovo.setNome("banco Novo");
		
		Cliente paloma = new Cliente();
		paloma.setNome("paloma");
		
		Conta cc = new ContaCorrente(paloma);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(paloma);
        cc.transferir(100, cp);
        
        bancoNovo.addConta(cp);
        bancoNovo.addConta(cc);
        
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		System.out.println("Contas presentes no banco Novo: ");
		bancoNovo.listarContas();
		
	}

}
