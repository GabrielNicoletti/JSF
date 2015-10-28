package aulajavaweb.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class HistoricoMedico implements Model {

	@Id
	private Integer id;
	private boolean castrado;
	private List<String> doencasCronicas;
	private List<String> cirurgias;
	private Animal animal;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public boolean isCastrado() {
		return castrado;
	}

	public List<String> getDoencasCronicas() {
		return doencasCronicas;
	}

	public List<String> getCirurgias() {
		return cirurgias;
	}

	public Animal getAnimal() {
		return animal;
	}

	
	
}
