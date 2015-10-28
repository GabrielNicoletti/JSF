package aulajavaweb.http;

import javax.ws.rs.Path;

@Path("historico")
public class HistoricoMedicoWS {

<<<<<<< HEAD
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

	public void update() {

	}

=======
>>>>>>> af11e4beaa3f0f5125522661a438dea5d3dc55dd
}
