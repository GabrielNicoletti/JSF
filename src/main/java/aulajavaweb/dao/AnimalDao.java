package aulajavaweb.dao;

import java.util.ArrayList;
import java.util.List;

import aulajavaweb.model.Animal;

public class AnimalDao  implements Dao<Animal>{
	
	private static AnimalDao dao;
	
	private List<Animal> animais= new ArrayList<Animal>();
	
	public static AnimalDao singleton(){
		return dao ==null ? new AnimalDao() : dao;
	}
	
	public List<Animal> getAnimais(){
		return animais;
	}

	@Override
	public void insert(Animal t) {
		animais.add(t);
		
	}

	@Override
	public void delete(Animal t) {
		animais.remove(t);
		
	}

	@Override
	public Animal list(Integer id) {
		
		return animais.get(id); 
	}

	@Override
	public List<Animal> listAll() {
		
		return animais;
	}

	@Override
	public void update(Animal t) {
		animais.remove(t);
		animais.add(t);
		
	}
	

}
