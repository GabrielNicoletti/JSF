package aulajavaweb.dao;

import java.util.ArrayList;
import java.util.List;

import aulajavaweb.model.Tutor;

public class TutorDao implements Dao<Tutor>{

	private static TutorDao dao;
	private List<Tutor> tutores = new ArrayList<Tutor>();
	
	
	
	public List<Tutor> gettutores() {
		return tutores;
	}

	public void settutores(List<Tutor> tutores) {
		this.tutores = tutores;
	}

	//nao será possivel criar construtor fora dessa classe (metodo privado)
	private TutorDao(){
		
	}
	
	//verifica se existe instancia criada. Se nao, cria ela. Se sim, devolve a instancia criada 
	public static TutorDao singleton(){
		return dao == null ? new TutorDao() : dao;
	}

	@Override
	public void inserir(Tutor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Tutor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tutor buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tutor> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Tutor t) {
		// TODO Auto-generated method stub
		
	}


}