package aulajavaweb.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import aulajavaweb.dao.VacinaDao;
import aulajavaweb.model.Vacina;
import aulajavaweb.model.enums.FabricanteVacina;
import aulajavaweb.model.enums.TipoVacina;

@ManagedBean
public class VacinaBean  implements Bean<Vacina>{
	

	private Vacina vacina = new Vacina();
	private static VacinaDao dao  = new VacinaDao().singleton();
	
	public Vacina getVacina() {
		return vacina;
	}
	
	public void setVacina(Vacina vacina) {
		this.vacina = vacina;	
	}
	
	public VacinaBean(){
		
	}
	
	@Override
	public void inserir(Vacina t) {
		
		
	}
	@Override
	public void excluir(Vacina t) {
		
		
	}
	@Override
	public Vacina buscar(Integer id) {
		
		return null;
	}
	@Override
	public List<Vacina> buscarTodos() {
		
		return null;
	}
	@Override
	public void atualizar(Vacina t) {
		
		
	}
	public TipoVacina[] getTipoVacina(){
		return vacina.getTipoVacina().values();
	}
	public String getNome(){
		return vacina.getNome();
	}
	public FabricanteVacina[] getFabricante(){
		return vacina.getFabricante().values();
	}
}
