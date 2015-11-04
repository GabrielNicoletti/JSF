package aulajavaweb.model.enums;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public enum Estado {
	
	AC((byte) 1, "Acre"),
	AL((byte) 2, "Alagoas"),
	AP((byte) 3, "Amap�"),
	AM((byte) 4, "Amazonas"),
	BA((byte) 5, "Bahia"),
	CE((byte) 6, "Cear�"),
	DF((byte) 7, "Distrito Federal"), 
	ES((byte) 8, "Esp�rito Santo"), 
	GO((byte) 9, "Goi�nia"),
	MA((byte) 10, "Maranh�o"),
	MT((byte) 11, "Mato Grosso"),
	MS((byte) 12, "Mato Grosso do Sul"),
	MG((byte) 13, "canino"),
	PA((byte) 14, "Par�"),
	PB((byte) 15, "Para�ba"),
	PR((byte) 16, "Paran�"),
	PE((byte) 17, "Pernambuco"),
	PI((byte) 18, "Piaui"),
	RJ((byte) 17, "Rio de Janeiro"),
	RN((byte) 17, "Rio Grande do Norte"),
	RS((byte) 17, "Rio Grande do Sul"),
	RO((byte) 17, "Rond�nia"),
	RR((byte) 17, "Roraima"),
	SC((byte) 17, "Santa Catarina"),
	SP((byte) 17, "S�o Paulo"),
	SE((byte) 17, "Sergipe"),
	TO((byte) 17, "Tocantins");

	
	private byte code;
	private String description;
	
	private Estado(byte code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public byte getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Estado getByCode(byte code) {
		for(Estado e : values()) {
			if(e.code == code) return e; 
		}
		return null;
	}
	
	public Estado getByDescription(String description) {
		for(Estado e : values()) {
			if(e.description.equalsIgnoreCase(description)) return e;
		}
		return null;
	}
	
	
	
}