package aulajavaweb.model.enums;

public enum FabricanteVacina {
	 MERIAL (1, "MERIAL"),
	 HERTAPE (2, "HERTAPE"),
	 BIOVET(3, "BIOVET"),
	 VIRBAC (4, "VIRBAC"),
	 VENCOFARMA(5, "VENCOFARMA"),
	 NOVARTIS(6, "NOVARTIS");
	 
	 private int code;
	 private String descryption;
	 
	 private FabricanteVacina(int code, String descr){
		 this.code = code;
		 this.descryption = descr;
	 }
}

