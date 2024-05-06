import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

     public void abrirConta(Conta conta) {
        if (contas == null) {
            contas = new ArrayList<>();
        }
        contas.add(conta);
    }

    public void fecharConta(Conta conta) {
        if (contas != null) {
            contas.remove(conta);
        }
    }

}