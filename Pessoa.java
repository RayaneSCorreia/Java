package tsaveprojectpoo;


public class Pessoa {
	
	String nome;
	String telefone;

	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public Pessoa() {
	}

	public static void obterInfo(Usuario usuario) {
		System.out.println(usuario.nome);
	}     

}
