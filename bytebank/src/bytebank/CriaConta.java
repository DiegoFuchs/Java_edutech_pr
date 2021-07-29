package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("a primeira conta tem " + primeiraConta.saldo);
		System.out.println("a segunda conta tem " + segundaConta.saldo);

		System.out.println(primeiraConta.agencia);
	}
}
