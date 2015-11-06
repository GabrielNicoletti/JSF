package aulajavaweb.dao;

import java.util.List;

import aulajavaweb.model.Model;

public interface Dao<T extends Model>  {

	public void insert(T t);
	public void delete(T t);
	public T list(Integer id);
	public List<T> listAll();
	public void update (T t);
	
}
