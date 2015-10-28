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


import aulajavaweb.model.Tutor;
@Path("tutor")
public class TutorWS {
	@POST
	@Path("insert")
	@Consumes(MediaType.APPLICATION_JSON)
	public void insert(Tutor tutor) throws ReflectiveOperationException {
		//AnimalService service = new AnimalService();
		//service.insert(animal);
	}

	@GET
	@Path("find/id{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Tutor find(@PathParam("id") Integer id) {
		List<Tutor> tutores = findAll();
		for (Tutor t1 : tutores) {
			if (t1.getId().equals(id)) {
				return t1;
			}
		}
		return null;
	}

	@GET
	@Path("find/nome{nome}")
	@Produces(MediaType.APPLICATION_JSON)
	public Tutor find(@PathParam("nome") String nome) {
		return null;
	}

	@DELETE
	@Path("delete/{id}")
	public void delete(@PathParam("id") Integer id) {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tutor> findAll() {
		Tutor t1 = new Tutor();
		t1.setId(1);
		t1.setEmail("teste@teste.com");
		t1.setNome("TesteNomeTutor");
		
		
		
		List<Tutor> tutores = Arrays.asList(t1);

		return tutores;
	}

	public void update() {

	}
}
