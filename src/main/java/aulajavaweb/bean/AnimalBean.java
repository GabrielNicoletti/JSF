package aulajavaweb.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import aulajavaweb.dao.AnimalDao;
import aulajavaweb.model.Animal;

@ManagedBean
public class AnimalBean implements Bean<Animal> {
	
	private Animal animal = new Animal ();	
	private AnimalDao dao = AnimalDao.singleton();
	
	//cria construtor para acessar metodos da classe 
	public AnimalBean(){
		
	}	
	
	public Animal getAnimal() {
		return animal;
	}

	@Override
	public void inserir(Animal t) {
		dao.inserir(t);
	}

	@Override
	public void excluir(Animal t) {
		dao.excluir(t);
		
	}

	@Override
	public Animal buscar(Integer id) {
		
		return dao.buscar(id);
	}

	@Override
	public List<Animal> buscarTodos() {		
		return dao.buscarTodos();
	}



	@Override
	public void atualizar(Animal t) {
		dao.atualizar(t);
		
	}



}
	

