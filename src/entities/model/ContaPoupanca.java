package entities.model;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca (Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato conta popanca");
		super.imprimirInfosComuns();
	}


}
