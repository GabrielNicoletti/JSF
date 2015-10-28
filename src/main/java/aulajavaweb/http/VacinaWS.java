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

import aulajavaweb.model.Vacina;
@Path("vacina")
public class VacinaWS {
	@POST
	@Path("insert")
	@Consumes(MediaType.APPLICATION_JSON)
	public void insert(Vacina Vacina) throws ReflectiveOperationException {
		//vacinaService service = new vacinaService();
		//service.insert(vacina);
	}

	@GET
	@Path("find/id{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Vacina find(@PathParam("id") Integer id) {
		List<Vacina> Vacinaes = findAll();
		for (Vacina v1 : Vacinaes) {
			if (v1.getId().equals(id)) {
				return v1;
			}
		}
		return null;
	}

	@GET
	@Path("find/nome{nome}")
	@Produces(MediaType.APPLICATION_JSON)
	public Vacina find(@PathParam("nome") String nome) {
		return null;
	}

	@DELETE
	@Path("delete/{id}")
	public void delete(@PathParam("id") Integer id) {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Vacina> findAll() {
		Vacina v1 = new Vacina();
		v1.setId(1);		
		v1.setNome("TesteNomeVacina");
		v1.setLote("testeLote");
		
		
		
		List<Vacina> Vacinaes = Arrays.asList(v1);

		return Vacinaes;
	}
	@POST
	@Path("update")
	@Produces(MediaType.APPLICATION_JSON)
	public void update() {

	}

}
