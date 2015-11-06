package aulajavaweb.dao;

import java.util.ArrayList;
import java.util.List;

import aulajavaweb.model.Animal;


public class AnimalDao implements Dao<Animal>{

	private static AnimalDao dao;
	private List<Animal> animais = new ArrayList<Animal>();
	
	
	
	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	//nao será possivel criar construtor fora dessa classe (metodo privado)
	private AnimalDao(){
		
	}
	
	//verifica se existe instancia criada. Se nao, cria ela. Se sim, devolve a instancia criada 
	public static AnimalDao singleton(){
		return dao == null ? new AnimalDao() : dao;
	}

	@Override
	public void inserir(Animal t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Animal t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Animal buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Animal> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Animal t) {
		// TODO Auto-generated method stub
		
	}


}
