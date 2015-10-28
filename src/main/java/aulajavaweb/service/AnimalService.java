package aulajavaweb.service;

import aulajavaweb.model.Animal;
import aulajavaweb.persistence.dao.AnimalDao;
import aulajavaweb.validator.AnimalValidator;

public class AnimalService extends Service<Animal, AnimalValidator, AnimalDao>{

	public AnimalService() throws InstantiationException, IllegalAccessException  {
		super(AnimalValidator.class, AnimalDao.class);
		
	}

}
