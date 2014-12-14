
package br.com.wpattern.frameworks.resteasy.utils.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.wpattern.frameworks.resteasy.utils.ServiceName;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestBean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseBean;

// Content-Type: application/json
@Path(ServiceName.MATH_SERVICE)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface IMathRestService {

	// REQUEST =
	// RESPONSE = Hello RESTEasy
	@GET
	public String hello();

	// REQUEST = {"requestBean":{"value1":10,"value2":20}}
	// RESPONSE = {"responseBean":{"result":30}}
	@POST
	public ResponseBean hello(RequestBean requestBean);

}
