package bancfer;

public class CPersona {
    private String nom;
    private String primer_cognom;
    private String segon_cognom;
    private int numero_secret;
    
    /*
     * Constructor inicialitzat
     */
    public CPersona(String nom, String primer_cognom, String segon_cognom, int numero_secret) {
		super();
		this.nom = nom;
		this.primer_cognom = primer_cognom;
		this.segon_cognom = segon_cognom;
		this.numero_secret = numero_secret;
	}
    
    /*
     * Constructor copia: Clon d'objecte ja creat
     */
    
    public CPersona(CPersona a){
    	this.nom = a.nom;
    	this.primer_cognom = a.primer_cognom;
    	this.segon_cognom = a.segon_cognom;
    	this.numero_secret = a.numero_secret;
    }
    
	/*
	 * Metodes get/set
	 */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrimer_cognom() {
		return primer_cognom;
	}
	public void setPrimer_cognom(String primer_cognom) {
		this.primer_cognom = primer_cognom;
	}
	public String getSegon_cognom() {
		return segon_cognom;
	}
	public void setSegon_cognom(String segon_cognom) {
		this.segon_cognom = segon_cognom;
	}
	public int getNumero_secret() {
		return numero_secret;
	}
	public void setNumero_secret(int numero_secret) {
		this.numero_secret = numero_secret;
	}
    
    
}
