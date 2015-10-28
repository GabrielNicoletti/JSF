package aulajavaweb.http;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import aulajavaweb.model.Animal;
import aulajavaweb.model.AnimalVacina;

@Path("animalVacina")
public class AnimalVacinaWS {
	@POST
	@Path("insert")
	@Consumes(MediaType.APPLICATION_JSON)
	public void insert(AnimalVacina aniVac) throws ReflectiveOperationException {
		//AnimalService service = new AnimalService();
		//service.insert(animal);
	}	


	
}
