package aulajavaweb.http;


import javax.ws.rs.Path;
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import aulajavaweb.model.HistoricoMedico;

@Path("historicomedico")
public class HistoricoMedicoWS {


	@POST
	@Path("insert")
	@Consumes(MediaType.APPLICATION_JSON)
	public void insert(HistoricoMedico HistoricoMedico) throws ReflectiveOperationException {
		//HistoricoMedicoService service = new HistoricoMedicoService();
		//service.insert(HistoricoMedico);
	}

	@GET
	@Path("find/id{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public HistoricoMedico find(@PathParam("id") Integer id) {
		List<HistoricoMedico> hists = findAll();
		for (HistoricoMedico h1 : hists) {
			if (h1.getId().equals(id)) {
				return h1;
			}
		}
		return null;
	}

	@GET
	@Path("find/nome{nome}")
	@Produces(MediaType.APPLICATION_JSON)
	public HistoricoMedico find(@PathParam("nome") String nome) {
		return null;
	}

	@DELETE
	@Path("delete/{id}")
	public void delete(@PathParam("id") Integer id) {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<HistoricoMedico> findAll() {
		HistoricoMedico h1 = new HistoricoMedico();
		h1.setId(1);		
		List<HistoricoMedico> hists = Arrays.asList(h1);

		return hists;
	}
	@POST
	@Path("update")
	@Produces(MediaType.APPLICATION_JSON)
	public void update() {

	}


}

