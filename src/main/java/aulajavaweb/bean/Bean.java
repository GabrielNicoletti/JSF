package aulajavaweb.bean;

import java.util.List;

import aulajavaweb.model.Animal;

public interface Bean <T> {
	
	public void insert(T t);
	public void delete(T t);
	public T list(Integer id);
	public List<T> listAll();
	public void update (T t);
	
}
