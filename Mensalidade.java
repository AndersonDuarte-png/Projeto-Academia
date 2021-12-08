package projeto_academia;

public class Mensalidade {
	private String data_inicio_pags;
	private String ultima_data_pags;
	private String total_pags;
	
	
	public String getData_inicio_pags() {
		return data_inicio_pags;
	}
	public void setData_inicio_pags(String data_inicio_pags) {
		this.data_inicio_pags = data_inicio_pags;
	}
	public String getUltima_data_pags() {
		return ultima_data_pags;
	}
	public void setUltima_data_pags(String ultima_data_pags) {
		this.ultima_data_pags = ultima_data_pags;
	}
	public String getTotal_pags() {
		return total_pags;
	}
	public void setTotal_pags(String total_pags) {
		this.total_pags = total_pags;
	}
	
	public void InserirDataInicio(String data) {
		this.data_inicio_pags = data;
	}
	
	public void ImprimeDataInicio() {
		System.out.println(this.data_inicio_pags);
	}
	

}
