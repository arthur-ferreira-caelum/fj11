
public class TesteDoBanco {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1);
		conta.setAgencia("3028");
		conta.setTitular("Luke");
		conta.deposita(100);

		System.out.println("Saldo: " + conta.getSaldo());

		conta.saca(10);

		System.out.println("Saldo: " + conta.getSaldo());
	} // fim main
} // fim TesteDoBanco
