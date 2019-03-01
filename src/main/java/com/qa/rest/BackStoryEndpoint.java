package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.qa.business.service.BackStoryService;

@Path("/BackStory")
public class BackStoryEndpoint {
	
	@Inject
	private BackStoryService service;

	@Path("/getAllBackStorys")
	@GET
	@Produces({ "application/json" })
	public String getAllBackStorys() {
		return service.getAllBackStorys();
	}
	
	@Path("/getABackStory/{id}")
	@GET
	@Produces({ "application/json" })
	public String getABackStory(@PathParam("id") Long id) {
		return service.getABackStory(id);
	}

	@Path("/createBackStory")
	@POST
	@Produces({ "application/json" })
	public String addBackStory(String BackStory) {
		return service.addBackStory(BackStory);
	}

	@Path("/deleteBackStory/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteBackStory(@PathParam("id") Long id) {
		return service.deleteBackStory(id);
	}

	@Path("/updateBackStory/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateBackStory (@PathParam("id") Long id , String BackStory)
	{
		return service.updateBackStory(BackStory, id);
	}
	
	
	public void setService(BackStoryService service) {
		this.service = service;
	}

}
