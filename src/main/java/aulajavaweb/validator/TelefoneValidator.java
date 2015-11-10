package aulajavaweb.validator;

import javax.faces.application.FacesMessage;

import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator("telefoneValidator")
public class TelefoneValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		
		String telefoneStr = (String) value;
		//Expressão regular para validar telefone com ou sem o 9
		if(!(telefoneStr.matches(".((10)|([1-9][1-9]).)\\s9?[6-9][0-9]{3}-[0-9]{4}") ||
				telefoneStr.matches(".((10)|([1-9][1-9]).)\\s[2-5][0-9]{3}-[0-9]{4}"))){
			((UIInput) component).setValid(false);
			
			FacesMessage message = new FacesMessage("Telefone Inválido");
			context.addMessage(component.getClientId(), message);
			
		}
		
	}

}
