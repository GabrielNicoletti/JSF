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
		animais.add(t);
		
	}

	@Override
	public void excluir(Animal t) {
		animais.remove(t);
		
	}

	@Override
	public Animal buscar(Integer id) {

		return animais.get(id);
	}

	@Override
	public List<Animal> buscarTodos() {

		return animais;
	}

	@Override
	public void atualizar(Animal t) {
		animais.remove(t);
		animais.add(t);
		
	}
	
	
}
