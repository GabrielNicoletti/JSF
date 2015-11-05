package aulajavaweb.model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
//@XmlRootElement
@ManagedBean
public class AnimalVacina implements Model {

	@Id
	private Integer id;
	private Animal animal;
	private Vacina vacina;
	private Date dataAplicacao;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Animal getAnimal() {
		return animal;
	}
	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public Vacina getVacina() {
		return vacina;
	}
	
	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	
	public Date getDataAplicacao() {
		return dataAplicacao;
	}
	
	public void setDataAplicacao(Date dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}
	
}
