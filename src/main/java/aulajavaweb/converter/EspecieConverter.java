package aulajavaweb.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import aulajavaweb.model.enums.Especie;

@FacesConverter(value = "especieConverter", forClass = Especie.class)
public class EspecieConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String str) {

		return Especie.getByDescription(str);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {

		return ((Especie) value).getDescription();
	}

}
