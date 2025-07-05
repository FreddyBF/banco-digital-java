public class Main {
    public static void main(String[] args) {
		Cliente freddy = new Cliente();
		freddy.setNome("Alfredo");

		
		Conta corrente = new ContaCorrente(freddy);
		Conta poupanca = new ContaPoupanca(freddy);

		corrente.depositar(130);
		corrente.transferir(80, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
