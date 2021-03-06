package aulajavaweb.model;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.Id;

import aulajavaweb.model.enums.Especie;
import aulajavaweb.model.enums.Raca;
import aulajavaweb.model.enums.Sexo;
import aulajavaweb.model.enums.Temperamento;


// @XmlRootElement


public class Animal implements Model {

	@Id
	private Integer id;

	private String nome;

	private Especie especie;
	private Raca raca;
	private Sexo sexo;
	private Integer meses;
	private Temperamento temperamento;
	private String pelagem;
	// em gramas
	private Integer peso;

	private HistoricoMedico historicoMedico;

	@PostConstruct
	public void post() {
		nome = "nome";
	}

	@Override
	public Integer getId() {
		return id;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Integer getMeses() {
		return meses;
	}

	public void setMeses(Integer meses) {
		this.meses = meses;
	}

	public Temperamento getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(Temperamento temperamento) {
		this.temperamento = temperamento;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public HistoricoMedico getHistoricoMedico() {
		return historicoMedico;
	}

	public void setHistoricoMedico(HistoricoMedico historicoMedico) {
		this.historicoMedico = historicoMedico;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Especie[] getEspecies() {

		return Especie.values();

	}

}
