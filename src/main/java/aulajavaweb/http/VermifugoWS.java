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

import aulajavaweb.model.Vermifugo;
@Path("vermifugo")
public class VermifugoWS {
	@POST
	@Path("insert")
	@Consumes(MediaType.APPLICATION_JSON)
	public void insert(Vermifugo Vermifugo) throws ReflectiveOperationException {
		//VermifugoService service = new VermifugoService();
		//service.insert(Vermifugo);
	}

	@GET
	@Path("find/id{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Vermifugo find(@PathParam("id") Integer id) {
		List<Vermifugo> Vermifugoes = findAll();
		for (Vermifugo v1 : Vermifugoes) {
			if (v1.getId().equals(id)) {
				return v1;
			}
		}
		return null;
	}

	@GET
	@Path("find/nome{nome}")
	@Produces(MediaType.APPLICATION_JSON)
	public Vermifugo find(@PathParam("nome") String nome) {
		return null;
	}

	@DELETE
	@Path("delete/{id}")
	public void delete(@PathParam("id") Integer id) {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Vermifugo> findAll() {
		Vermifugo v1 = new Vermifugo();
		v1.setId(1);		
		
		
		
		List<Vermifugo> Vermifugoes = Arrays.asList(v1);

		return Vermifugoes;
	}

	public void update() {

	}
}
