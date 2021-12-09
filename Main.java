package pack_academia;
import java.util.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente a = new Cliente();
		
		Variaveis_m_escolha b = new Variaveis_m_escolha();
		b.setSim(true);
		b.setNao(false);

		a.setNome(sc.next());
		a.setNome_mae(sc.next());
		a.setNome_pai(sc.next());
		a.setCelular(sc.next());
		a.setCelular_whatz(sc.next());
		a.setData_nasc(sc.next());
		a.setEmail(sc.next());
		a.setResidencia(sc.next());
		a.setEndereco(sc.next());
		a.setEstado(sc.next());
		a.setCidade(sc.next());
		a.setAltura(sc.nextDouble());
		a.setModalidade(sc.next());
		a.setSexo(sc.next());
		a.setRG(sc.next());
		b.setComentario(sc.next());
		a.setAposentado(b);
		
		a.printVariaveis();
		a.printVariaveisA();
		sc.close();
	}

	private static void printVariaveis() {
		// TODO Auto-generated method stub
		
	}
}
