package aulajavaweb.http;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import aulajavaweb.model.AnimalVermifugo;

@Path("animalVermifugo")
public class AnimalVermifugoWS {
	
	@Path("insert")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insert(AnimalVermifugo aniVerm){
		
	}
}
