package pack_academia;

public class Anamnese{
	
	private Variaveis_m_escolha aposentado = new Variaveis_m_escolha();
	private Variaveis_m_escolha fequencia= new Variaveis_m_escolha();
	private Variaveis_m_escolha medicamento= new Variaveis_m_escolha();
	private Variaveis_m_escolha doresCorporais= new Variaveis_m_escolha();
	private Variaveis_m_escolha alergias= new Variaveis_m_escolha();
	private Variaveis_m_escolha fraturas= new Variaveis_m_escolha();
	private Variaveis_m_escolha cirurgia= new Variaveis_m_escolha();
	private Variaveis_m_escolha gravidez= new Variaveis_m_escolha();
	private Variaveis_m_escolha colesterol= new Variaveis_m_escolha();
	private Variaveis_m_escolha pressaoArterial= new Variaveis_m_escolha();
	private Variaveis_m_escolha diabetes= new Variaveis_m_escolha();
	private Variaveis_m_escolha fumante= new Variaveis_m_escolha();
	private Variaveis_m_escolha anabolizante= new Variaveis_m_escolha();
	private Variaveis_m_escolha problemasM= new Variaveis_m_escolha(); /* problemas mestruais */
	private Variaveis_m_escolha posturais= new Variaveis_m_escolha();
	private Variaveis_m_escolha Artrite_artrose= new Variaveis_m_escolha();
	private Variaveis_m_escolha tireoide= new Variaveis_m_escolha();
	private Variaveis_m_escolha asma= new Variaveis_m_escolha();
	private Variaveis_m_escolha bronquite= new Variaveis_m_escolha();
	private Variaveis_m_escolha varizes= new Variaveis_m_escolha();
	private Variaveis_m_escolha HIV= new Variaveis_m_escolha();
	private Variaveis_m_escolha epilepsia= new Variaveis_m_escolha();
	private Variaveis_m_escolha contracoesInvoluntarias= new Variaveis_m_escolha();
	private Variaveis_m_escolha crises_nervosas= new Variaveis_m_escolha();
	private Variaveis_m_escolha osteoporoses= new Variaveis_m_escolha();
	private Variaveis_m_escolha drogas= new Variaveis_m_escolha();
	private String comentarioF; /* comentario para saber hisotrico fisico pessoal e da familia */
	
	
	public Variaveis_m_escolha getAposentado() {
		return aposentado;
	}
	public void setAposentado(Variaveis_m_escolha aposentado) {
		this.aposentado = aposentado;
	}
	public Variaveis_m_escolha getFequencia() {
		return fequencia;
	}
	public void setFequencia(Variaveis_m_escolha fequencia) {
		this.fequencia = fequencia;
	}
	public Variaveis_m_escolha getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Variaveis_m_escolha medicamento) {
		this.medicamento = medicamento;
	}
	public Variaveis_m_escolha getDoresCorporais() {
		return doresCorporais;
	}
	public void setDoresCorporais(Variaveis_m_escolha doresCorporais) {
		this.doresCorporais = doresCorporais;
	}
	public Variaveis_m_escolha getAlergias() {
		return alergias;
	}
	public void setAlergias(Variaveis_m_escolha alergias) {
		this.alergias = alergias;
	}
	public Variaveis_m_escolha getFraturas() {
		return fraturas;
	}
	public void setFraturas(Variaveis_m_escolha fraturas) {
		this.fraturas = fraturas;
	}
	public Variaveis_m_escolha getCirurgia() {
		return cirurgia;
	}
	public void setCirurgia(Variaveis_m_escolha cirurgia) {
		this.cirurgia = cirurgia;
	}
	public Variaveis_m_escolha getGravidez() {
		return gravidez;
	}
	public void setGravidez(Variaveis_m_escolha gravidez) {
		this.gravidez = gravidez;
	}
	public Variaveis_m_escolha getColesterol() {
		return colesterol;
	}
	public void setColesterol(Variaveis_m_escolha colesterol) {
		this.colesterol = colesterol;
	}
	public Variaveis_m_escolha getPressaoArterial() {
		return pressaoArterial;
	}
	public void setPressaoArterial(Variaveis_m_escolha pressaoArterial) {
		this.pressaoArterial = pressaoArterial;
	}
	public Variaveis_m_escolha getDiabetes() {
		return diabetes;
	}
	public void setDiabetes(Variaveis_m_escolha diabetes) {
		this.diabetes = diabetes;
	}
	public Variaveis_m_escolha getFumante() {
		return fumante;
	}
	public void setFumante(Variaveis_m_escolha fumante) {
		this.fumante = fumante;
	}
	public Variaveis_m_escolha getAnabolizante() {
		return anabolizante;
	}
	public void setAnabolizante(Variaveis_m_escolha anabolizante) {
		this.anabolizante = anabolizante;
	}
	public Variaveis_m_escolha getProblemasM() {
		return problemasM;
	}
	public void setProblemasM(Variaveis_m_escolha problemasM) {
		this.problemasM = problemasM;
	}
	public Variaveis_m_escolha getPosturais() {
		return posturais;
	}
	public void setPosturais(Variaveis_m_escolha posturais) {
		this.posturais = posturais;
	}
	public Variaveis_m_escolha getArtrite_artrose() {
		return Artrite_artrose;
	}
	public void setArtrite_artrose(Variaveis_m_escolha artrite_artrose) {
		Artrite_artrose = artrite_artrose;
	}
	public Variaveis_m_escolha getTireoide() {
		return tireoide;
	}
	public void setTireoide(Variaveis_m_escolha tireoide) {
		this.tireoide = tireoide;
	}
	public Variaveis_m_escolha getAsma() {
		return asma;
	}
	public void setAsma(Variaveis_m_escolha asma) {
		this.asma = asma;
	}
	public Variaveis_m_escolha getBronquite() {
		return bronquite;
	}
	public void setBronquite(Variaveis_m_escolha bronquite) {
		this.bronquite = bronquite;
	}
	public Variaveis_m_escolha getVarizes() {
		return varizes;
	}
	public void setVarizes(Variaveis_m_escolha varizes) {
		this.varizes = varizes;
	}
	public Variaveis_m_escolha getHIV() {
		return HIV;
	}
	public void setHIV(Variaveis_m_escolha hIV) {
		HIV = hIV;
	}
	public Variaveis_m_escolha getEpilepsia() {
		return epilepsia;
	}
	public void setEpilepsia(Variaveis_m_escolha epilepsia) {
		this.epilepsia = epilepsia;
	}
	public Variaveis_m_escolha getContracoesInvoluntarias() {
		return contracoesInvoluntarias;
	}
	public void setContracoesInvoluntarias(Variaveis_m_escolha contracoesInvoluntarias) {
		this.contracoesInvoluntarias = contracoesInvoluntarias;
	}
	public Variaveis_m_escolha getCrises_nervosas() {
		return crises_nervosas;
	}
	public void setCrises_nervosas(Variaveis_m_escolha crises_nervosas) {
		this.crises_nervosas = crises_nervosas;
	}
	public Variaveis_m_escolha getOsteoporoses() {
		return osteoporoses;
	}
	public void setOsteoporoses(Variaveis_m_escolha osteoporoses) {
		this.osteoporoses = osteoporoses;
	}
	public Variaveis_m_escolha getDrogas() {
		return drogas;
	}
	public void setDrogas(Variaveis_m_escolha drogas) {
		this.drogas = drogas;
	}
	public String getComentarioF() {
		return comentarioF;
	}
	public void setComentarioF(String comentario) {
		this.comentarioF = comentario;
	}
	
	public void printVariaveisA () {
		System.out.println("aposentado  = " + this.aposentado.isSim());
		System.out.println("aposentado  = " + this.aposentado.isNao());
		System.out.println("aposentado  = " + this.aposentado.getComentario());
	}

}
