package aulajavaweb.model;

public class Email {

	private String valor;
	private static final String PROVEDOR = "dextra-sw.com";
	
	public Email(String valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return valor + "@" + PROVEDOR;
	}
	
}
