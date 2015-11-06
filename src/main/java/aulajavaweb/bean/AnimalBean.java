package aulajavaweb.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import aulajavaweb.dao.AnimalDao;
import aulajavaweb.model.Animal;

@ManagedBean
public class AnimalBean implements Bean  <Animal>{
	private Animal animal = new Animal();
	
	public AnimalBean(){
		
	}
	public Animal getAnimal(){
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	@Override
	public void insert(Animal t) {
		AnimalDao.singleton().insert(t);		
	}
	@Override
	public void delete(Animal t) {
		AnimalDao.singleton().delete(t);		
	}
	@Override
	public Animal list(Integer id) {
		return AnimalDao.singleton().list(id);
	}
	@Override
	public List<Animal> listAll() {
		return AnimalDao.singleton().listAll();
	}
	@Override
	public void update(Animal t) {
		AnimalDao.singleton().update(t);	
	}
}
