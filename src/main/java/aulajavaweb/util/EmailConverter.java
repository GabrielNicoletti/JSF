package aulajavaweb.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import aulajavaweb.model.Email;

@FacesConverter(value="emailConverter", forClass=Email.class)
public class EmailConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		if (value != null){
			return new Email(value);
		}
		return null;
	}

	
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {

		return ((Email) value).toString();
	}
	
}
