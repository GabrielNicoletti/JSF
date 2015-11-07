package aulajavaweb.model.enums;

public enum TipoVacina {
	RAIVA (1, "RAIVA"), 
	V8 (2, "V8"),
	V11 (3, "V11"),
	V10(4, "V10"),
	V12(5, "V12"), 
	V14(6, "V14"), 
	TRIPLICE_FELINA(7, "TRIPLICE_FELINA"), 
	LEPTOSPIROSE(8, "LEPTOSPIROSE"), 
	CINOMOSE(9, "CINOMOSE"),
	TOSSE_DOS_CANIS(10, "TOSSE_DOS_CANIS"), 
	GIARDIA(11, "GIARDIA");
	
	private TipoVacina(int code, String desc){
		this.code=code;
		this.description =desc;
	}
	
	public int code;
	public String description;

	public int getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}
	
}
