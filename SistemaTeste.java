package tsaveprojectpoo;

import javax.swing.JOptionPane;

public class SistemaTeste {
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.nome = JOptionPane.showInputDialog("Digite seu nome");
		usuario.telefone = JOptionPane.showInputDialog("Telefone: ");
		usuario.email = JOptionPane.showInputDialog("Email: ");

		Endereco endereco = new Endereco();
		endereco.rua = JOptionPane.showInputDialog("Digite sua rua ");
		endereco.numero = JOptionPane.showInputDialog("N�mero: ");
		endereco.complemento = JOptionPane.showInputDialog("Complemento: ");

		usuario.endereco = endereco;

		String resposta = "";

		while (!resposta.equals("5")) {
			resposta = obterMenu();
			if (resposta.equals("1")) {
				Contato contato = new Contato();
				contato.nome = JOptionPane.showInputDialog("Nome do contato");
				contato.telefone = JOptionPane.showInputDialog("Telefone");
				contato.favorito = true;
				usuario.adicionarContato(contato);

			} else if (resposta.equals("2")) {
				if (usuario.contatos.size() == 0) {
					JOptionPane.showMessageDialog(null, "               Lista vazia!");

				} else {
					int contato1 = usuario.contatos.size();
					usuario.listarContatos(usuario, contato1);

				}
			} else if (resposta.equals("3")) {
				if (usuario.contatos.size() == 0) {
					JOptionPane.showMessageDialog(null, "Não há contatos cadastrados");
				} else {
					int contato1 = usuario.contatos.size();
					usuario.enviarLocalizacao(usuario, contato1);

				}
			} else if (resposta.equals("4")) {
				Pessoa.obterInfo(usuario);
				usuario.obterInfo(usuario);

			}
		}
	}

	// Método
	public static String obterMenu() {
		return JOptionPane.showInputDialog(
				"                       Menu\n 1 - Cadastrar\n 2 - Exibir lista de contatos\n 3 - Enviar Localização\n 4 - Informações do Usuario\n 5 - Sair\n");
	}
}
