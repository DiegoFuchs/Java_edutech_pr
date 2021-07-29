
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setNome("diego");
		diego.setCpf("333.333.333-22");
		diego.setSalario(1500.00);
		
		System.out.println(diego.getNome());
		System.out.println(diego.getBonificacao());
	}
}
