package tsaveprojectpoo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Usuario extends Pessoa {
	String email;
	Endereco endereco;
	ArrayList<Contato> contatos = new ArrayList<Contato>();

	public Usuario(String nome, String telefone, String email, Endereco endereco) {
		super(nome, telefone);
		this.endereco = endereco;
	}

	public Usuario() {
	}

	public static void obterInfo(Usuario usuario) {
		JOptionPane.showMessageDialog(null, usuario.nome + "\n" +
		 usuario.telefone + "\n" + usuario.email + "\n"/* + endereco.rua + "\t n�: "
		 + endereco.numero + "\t " + endereco.complemento + "\n"*/);
		 }

	//public String obterInfo(String nome, String telefone, String usuario) {
		//return nome + "\n" + telefone + "\n" + usuario ;
	//}

	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

}