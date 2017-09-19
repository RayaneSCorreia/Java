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
		JOptionPane.showMessageDialog(null, usuario.nome + "\n" + usuario.telefone + "\n" + usuario.email + "\n");
	}

	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	public void listarContatos(Usuario usuario, int contato1) {
		String infoContatos = "Contatos\n";
		for (int i = 0; i < contatos.size(); i++) {
			Contato contato11 = contatos.get(i);
			String infoFavorito = contato11.favorito ? "Favorito" : "Não Favorito";
			infoContatos = infoContatos + "ID " + i + ", " + contato11.nome + ", " + contato11.telefone + ", "
					+ infoFavorito + "\n";
		}
		JOptionPane.showMessageDialog(null, infoContatos);
	}

	public void enviarLocalizacao(Usuario usuario, int contato1) {
		String favContatos = "Localização enviada para:\n";
		for (int i = 0; i < usuario.contatos.size(); i++) {
			Contato contato = usuario.contatos.get(i);
			if (contato.favorito) {
				favContatos = favContatos + contato.nome + "\n";
			}

		}
		JOptionPane.showMessageDialog(null, favContatos);
	}
}
