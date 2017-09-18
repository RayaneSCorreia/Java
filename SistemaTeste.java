package tsavepoo;

import javax.swing.JOptionPane;

public class SistemaTeste {

    public static void main(String[] args) {
	Usuario usuario = new Usuario();
	usuario.nome = JOptionPane.showInputDialog("Digite seu nome");
	usuario.telefone = JOptionPane.showInputDialog("Telefone: ");
	usuario.email = JOptionPane.showInputDialog("Email: ");

	Endereco endereco = new Endereco();
	endereco.rua = JOptionPane.showInputDialog("Digite sua rua ");
	endereco.numero = JOptionPane.showInputDialog("Número: ");
	endereco.complemento = JOptionPane.showInputDialog("Complemento: ");

	usuario.endereco = endereco;

	String resposta = "";

	while (!resposta.equals("4")) {
	    resposta = obterMenu();
	    if (resposta.equals("1")) {
		Contato contato = new Contato();
		contato.nome = JOptionPane.showInputDialog("Nome do contato");
		contato.telefone = JOptionPane.showInputDialog("Telefone");
		contato.favorito = true;
		usuario.contatos.add(contato);

	    } else if (resposta.equals("2")) {
		if (usuario.contatos.size() == 0) {
		    JOptionPane.showMessageDialog(null, "Lista vazia");

		} else {
		    String infoContatos = "Contatos\n";
		    for (int i = 0; i < usuario.contatos.size(); i++) {
			Contato contato = usuario.contatos.get(i);
			String infoFavorito = contato.favorito ? "Favorito" : "Não Favorito";
			infoContatos = infoContatos + "ID " + i + ", " + contato.nome + ", " + contato.telefone + ", "
				+ infoFavorito + "\n";
		    }

		    JOptionPane.showMessageDialog(null, infoContatos);

		}
	    } else if (resposta.equals("3")) {
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
    }

    public static String obterMenu() {
	return JOptionPane
		.showInputDialog("Menu\n 1 - Cadastrar\n 2 - Exibir Lista\n 3 - Enviar Localização\n 4 - Sair\n");
    }
}
