package aulajavaweb.bean;

import java.util.List;


public interface Bean<T> {

		public void inserir(T t);
		
		public void excluir(T t);
		
		public T buscar(Integer id);
		
		public List<T> buscarTodos();
		
		public void atualizar(T t);
		

	

}
