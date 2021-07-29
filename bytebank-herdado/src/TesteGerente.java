
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("fuchs");
		g1.setCpf("333.333.333-22");
		g1.setSalario(5000.0);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());

		g1.setSenha(12345);
		boolean autenticou = g1.autentica(12345);

		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
		
		
		
		
		
	}
}
