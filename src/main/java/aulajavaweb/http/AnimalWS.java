package aulajavaweb.http;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import aulajavaweb.model.Animal;
import aulajavaweb.service.AnimalService;

@Path("animal")
public class AnimalWS {

	@POST
	@Path("insert")
	@Consumes(MediaType.APPLICATION_JSON)
	public void insert(Animal animal) throws ReflectiveOperationException {
		//AnimalService service = new AnimalService();
		//service.insert(animal);
	}

	@GET
	@Path("find/id{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Animal find(@PathParam("id") Integer id) {
		List<Animal> animais = findAll();
		for (Animal a1 : animais) {
			if (a1.getId().equals(id)) {
				return a1;
			}
		}
		return null;
	}

	@GET
	@Path("find/nome{nome}")
	@Produces(MediaType.APPLICATION_JSON)
	public Animal find(@PathParam("nome") String nome) {
		return null;
	}

	@DELETE
	@Path("delete/{id}")
	public void delete(@PathParam("id") Integer id) {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Animal> findAll() {
		Animal a1 = new Animal();
		a1.setId(1);
		a1.setMeses(1234);

		Animal a2 = new Animal();
		a2.setId(2);
		a2.setMeses(1234);

		List<Animal> animais = Arrays.asList(a1, a2);

		return animais;
	}

	public void update() {

	}

}