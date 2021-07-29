package bytebank3;

public class TestaGetESett {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
	
		Cliente diego = new Cliente();
		conta.setTitular(diego);
		diego.setNome("diego");
	
		System.out.println(conta.getTitular().getNome());
	
		conta.getTitular().setProfissao("estudante");
	
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("estudante");
		
	
	
	}
}
