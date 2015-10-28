package aulajavaweb.validator;

import aulajavaweb.model.Model;

public interface Validator <T extends Model>{
	public boolean validate(T t);
}
