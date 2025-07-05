import java.util.List;

public class Banco {
    String name;
    List<Conta> contas;

    public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}