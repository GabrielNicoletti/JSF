package aulajavaweb.service;
import aulajavaweb.model.Model;
import aulajavaweb.persistence.dao.DaoImpl;
import aulajavaweb.validator.Validator;

public abstract class Service <E extends Model, 
								V extends Validator<E>,
								D extends DaoImpl<E>	> {
		private V validator;
		private D dao;
	
		public Service(Class <V> classValidator, Class<D> classDao) 
				throws InstantiationException, IllegalAccessException{
			this.validator = classValidator.newInstance();
			this.dao = classDao.newInstance();
		}
		
		public void insert (E e){
			if(validator.validate(e))
				dao.insert(e);	
		}
		public void find (E e){
			if(validator.validate(e))
				dao.find(e); 	
		}
		public void delete(E e){
			if(validator.validate(e))
				dao.delete(e);
		}
		
}
