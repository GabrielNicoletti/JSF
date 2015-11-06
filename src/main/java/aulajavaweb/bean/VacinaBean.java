package aulajavaweb.bean;

import java.util.List;

import aulajavaweb.dao.VacinaDao;
import aulajavaweb.model.Vacina;

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
		// TODO Auto-generated method stub
		
	}
	@Override
	public Vacina buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Vacina> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void atualizar(Vacina t) {
		// TODO Auto-generated method stub
		
	}
}
