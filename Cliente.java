package pack_academia;
import java.util.*;
import java.util.Date;




public class Cliente {
	private String nome;
	private String nome_mae;
	private String nome_pai;
	private String data_nasc;
	private String cidade;
	private String estado;
	private String endereco;
	private String email;
	private String celular;
	private String celular_whatz;
	private String residencia;
	private String modalidade;
	private String RG;
	private String sexo;
	private double altura;
	
	public String getResidencia() {
		return residencia;
	}






	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}






	public String getModalidade() {
		return modalidade;
	}






	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}






	public String getRG() {
		return RG;
	}






	public void setRG(String rG) {
		RG = rG;
	}






	public String getSexo() {
		return sexo;
	}






	public void setSexo(String sexo) {
		this.sexo = sexo;
	}






	public double getAltura() {
		return altura;
	}






	public void setAltura(double d) {
		this.altura = d;
	}






	public String getNome() {
		return nome;
	}






	public void setNome(String nome) {
		this.nome = nome;
	}






	public String getNome_mae() {
		return nome_mae;
	}






	public void setNome_mae(String nome_mae) {
		this.nome_mae = nome_mae;
	}






	public String getNome_pai() {
		return nome_pai;
	}






	public void setNome_pai(String nome_pai) {
		this.nome_pai = nome_pai;
	}






	public String getData_nasc() {
		return data_nasc;
	}






	public void setData_nasc(String string) {
		this.data_nasc = string;
	}






	public String getCidade() {
		return cidade;
	}






	public void setCidade(String cidade) {
		this.cidade = cidade;
	}






	public String getEstado() {
		return estado;
	}






	public void setEstado(String estado) {
		this.estado = estado;
	}






	public String getEndereco() {
		return endereco;
	}






	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}






	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}






	public String getCelular() {
		return celular;
	}






	public void setCelular(String celular) {
		this.celular = celular;
	}






	public String getCelular_whatz() {
		return celular_whatz;
	}






	public void setCelular_whatz(String celular_whatz) {
		this.celular_whatz = celular_whatz;
	}






	public void DefinirSexo( String sexo){
		this.sexo = sexo;
	}
	
	public void printVariaveis () {
		System.out.println("nome = " + this.nome );
		System.out.println("nome mãe = " + this.nome_mae );
		System.out.println("nome pai = " + this.nome_pai );
		System.out.println("nome data_nasc = " + this.data_nasc );
		System.out.println("nome cidade = " + this.cidade );
		System.out.println("nome estado = " + this.estado );
		System.out.println("nome endereco = " + this.endereco );
		System.out.println("nome email = " + this.email );
		System.out.println("nome celular = " + this.celular );
		System.out.println("nome celular_whatz = " + this.celular_whatz );
		System.out.println("nome residencia = " + this.residencia );
		System.out.println("nome modalidade = " + this.modalidade );
		System.out.println("nome residencia = " + this.residencia );
		System.out.println("nome RG = " + this.RG );
		System.out.println("nome sexo = " + this.sexo );
		System.out.println("nome altura = " + this.altura );
	}

}
