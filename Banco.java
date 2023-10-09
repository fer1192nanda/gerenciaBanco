package gerenciaBanco;

public class Banco {
	private double saldo = 0;
	
	public void exbirSaldo() {
		System.out.println("Seu saldo: " + saldo);
	}
	
	public void depositar(double saldo) {
		this.saldo = saldo;
	}
	
	public void retirar ( double valor ) {
		double resultado = this.saldo - valor;
		
		if (resultado < 0) {
			System.out.println("\nNão tem saldo suficiente");
		} else {
			this.saldo = resultado;
			System.out.println("\nRetirada feita");
		}
	}
}
