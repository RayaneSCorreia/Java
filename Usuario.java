package tsavepoo;

import java.util.ArrayList;

public class Usuario extends Pessoa {
    String email;
    Endereco endereco;
    ArrayList<Contato> contatos = new ArrayList<Contato>();

    public Usuario(String nome, String telefone, String email, Endereco endereco) {
	super(nome, telefone);
	this.endereco = endereco;
    }
    public Usuario() {}

}
