public class App {
    public static void main(String[] args) {
		Cliente marco = new Cliente();
		marco.setNome("Marco");
		
		Conta cc = new ContaCorrente(marco);
		Conta poupanca = new ContaPoupanca(marco);

		cc.depositar(0);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}