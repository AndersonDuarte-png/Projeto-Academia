package pack_academia;
import java.util.Scanner;

public class Variaveis_m_escolha {

	private boolean sim;
	private boolean nao;
	private String comentario;
	
	public boolean isSim() {
		return sim;
	}
	public void setSim(boolean sim) {
		this.sim = sim;
	}
	public boolean isNao() {
		return nao;
	}
	public void setNao(boolean nao) {
		this.nao = nao;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public String getComentario() {
		return comentario;
	}

	
}
