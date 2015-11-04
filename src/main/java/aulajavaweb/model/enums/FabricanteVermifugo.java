package aulajavaweb.model.enums;

public enum FabricanteVermifugo {

	 KONIG((byte) 1, "konig"), 
	 MERIAL((byte) 2, "merial"), 
	 CEVA((byte) 3, "ceva"), 
	 BAYER((byte) 4, "bayer"), 
	 CEPAV((byte) 5, "cepav"), 
	 AGENER((byte) 6, "agener"), 
	 BIOVET((byte) 7, "biovet"), 
	 COVELI((byte) 8, "coveli"), 
	 VETNIL((byte) 9, "vetnil"),
	 DUPRAT((byte) 10, "duprat"), 
	 VANSIL((byte) 11, "vansil");
	 
	 private byte codigo;
	 private String descricao;
	 
	 private FabricanteVermifugo(byte codigo, String descricao) {
		 this.codigo = codigo;
		 this.descricao = descricao;
	 }
	 
	 public FabricanteVermifugo getByCodigo(int codigo) {
		 return getByCodigo((byte) codigo);
	 }
	
	 public FabricanteVermifugo getByCodigo(byte codigo) {
		 for(FabricanteVermifugo f : values()) {
			 if(f.codigo == codigo) {
				 return f;
			 }
		 }
		 return null;
	 }
	 
	 public FabricanteVermifugo getByDescricao(String descricao) {
		 for(FabricanteVermifugo f : values()) {
			 if(f.descricao.equalsIgnoreCase(descricao)) {
				 return f;
			 }
		 }
		 return null;
	 }
	 
}




