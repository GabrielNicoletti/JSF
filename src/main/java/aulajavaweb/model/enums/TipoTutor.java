package aulajavaweb.model.enums;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public enum TipoTutor {

	PROPRIETARIO((byte) 1, "proprietario"),
	TUTOR_ENTIDADE((byte) 2, "tipo de entidade");
	
	private byte code;
	private String description;
	
	private TipoTutor(byte code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public byte getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public TipoTutor getByCode(byte code) {
		for(TipoTutor t : values()) {
			if(t.code == code) return t; 
		}
		return null;
	}
	
	public TipoTutor getByDescription(String description) {
		for(TipoTutor t : values()) {
			if(t.description.equalsIgnoreCase(description)) return t;
		}
		return null;
	}
	
	
	
}


