package aulajavaweb.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Animal t) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Animal list(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Animal> listAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(Animal t) {
		// TODO Auto-generated method stub
		
	}
}
