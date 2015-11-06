package aulajavaweb.dao;

import java.util.List;

import aulajavaweb.model.Model;

public interface Dao<T extends Model>  {

	public void inserir(T t);
	
	public void excluir(T t);
	
	public T buscar(Integer id);
	
	public List<T> buscarTodos();
	
	public void atualizar(T t);

	
}
