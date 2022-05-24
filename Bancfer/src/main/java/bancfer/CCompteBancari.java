package bancfer;

public class CCompteBancari {
	private int numero;
	private CPersona propietari;
	private int saldo;
	public static int aux = 0;
	private static int inicial = 200;
	
	//Constructor inicialitzat
	public CCompteBancari(CPersona propietari) {
		this.numero = 1234 + CCompteBancari.aux;
		this.propietari = propietari;
		this.saldo = inicial;
		CCompteBancari.aux++;
	}
	
	//Constructor copia: Clon d'objecte
	public CCompteBancari(CCompteBancari a){
		this.numero = a.numero;
		this.propietari = a.propietari;
		this.saldo = a.saldo;
	}
	
	//Metodes get/set
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public CPersona getPropietari() {
		return propietari;
	}

	public void setPropietari(CPersona propietari) {
		this.propietari = propietari;
	}

	public static int getInicial() {
		return inicial;
	}

	public static void setInicial(int inicial) {
		CCompteBancari.inicial = inicial;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	//Modificar saldo inicial: Metode static
	public static void saldoInicial(CCompteBancari a, int num) { 
		a.saldo = num;
	}
	
	//Consultar saldo: Utilitzo el get.
	public int getSaldo() {
		return saldo;
	}
	
	//Comprovar numero secret
	public boolean comprovarNumero(int n1, int n2) {
		if (n1 == n2){return true;}
		else return false;
	}
	
	//Ingressar saldo
	public boolean ingressarSaldo(int quantitat, int numero_secret) { 
		this.saldo = this.saldo + quantitat;
		return true;
	}
	
	//Extreure saldo
	public boolean extreureSaldo(int quantitat, int numero_secret) { 
		this.saldo = this.saldo - quantitat;
		return true;
	}
	
}
