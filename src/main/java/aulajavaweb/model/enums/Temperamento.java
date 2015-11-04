package aulajavaweb.model.enums;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public  enum Temperamento {
	
	DOCIL((byte) 1, "D�cil"), 
	DE_GUARDA((byte) 2, "Animal de guarda"), 
	ANTI_SOCIAL((byte) 3, "Anti-social");
	
	private byte code;
	private String description;
	
	private Temperamento(byte code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public byte getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Temperamento getByCode(byte code) {
		for(Temperamento t : values()) {
			if(t.code == code) return t; 
		}
		return null;
	}
	
	public Temperamento getByDescription(String description) {
		for(Temperamento t : values()) {
			if(t.description.equalsIgnoreCase(description)) return t;
		}
		return null;
	}
	
	
	

}
