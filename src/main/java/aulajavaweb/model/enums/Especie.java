package aulajavaweb.model.enums;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public enum Especie {
   
	CANINO((byte) 1, "canino"),
	FELINO((byte) 2, "felino");
	 
	private byte code;
	private String description;
	
	private Especie(byte code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public byte getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public static Especie getByCode(int code){
		return getByCode((byte) code);
	}
	
	public static Especie getByCode(byte code) {
		for(Especie e : values()) {
			if(e.code == code) return e; 
		}
		return null;
	}
	
	public static Especie getByDescription(String description) {
		for(Especie e : values()) {
			if(e.description.equalsIgnoreCase(description)) return e;
		}
		return null;
	}
	
	
	
}
