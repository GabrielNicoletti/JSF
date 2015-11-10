package aulajavaweb.validator;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator("emailValidator")
public class EmailValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		
		String email = (String) value;
		if(email.indexOf('@') == -1){
			((UIInput) component).setValid(false);
			FacesMessage message = new FacesMessage("Email Inválido");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(component.getClientId(), message);
			throw new ValidatorException(message);
		}
	}



}
