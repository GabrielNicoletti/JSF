package aulajavaweb.model.enums;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public enum Sexo {

	MACHO((byte) 1, "macho"), 
	FEMEA((byte) 2, "f�mea");
	
	private byte code;
	private String description;
	
	private Sexo(byte code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public byte getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Sexo getByCode(byte code) {
		for(Sexo s : values()) {
			if(s.code == code) return s; 
		}
		return null;
	}
	
	public Sexo getByDescription(String description) {
		for(Sexo s : values()) {
			if(s.description.equalsIgnoreCase(description)) return s;
		}
		return null;
	}
	
	
	
}