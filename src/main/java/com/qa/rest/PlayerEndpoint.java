package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.qa.business.service.PlayerService;

@Path("/Player")
public class PlayerEndpoint {
	
	@Inject
	private PlayerService service;

	@Path("/getAllPlayers")
	@GET
	@Produces({ "application/json" })
	public String getAllPlayers() {
		return service.getAllPlayers();
	}
	
	@Path("/getAPlayer/{id}")
	@GET
	@Produces({ "application/json" })
	public String getAPlayer(@PathParam("id") Long id) {
		return service.getAPlayer(id);
	}

	@Path("/createPlayer")
	@POST
	@Produces({ "application/json" })
	public String addPlayer(String Player) {
		return service.addPlayer(Player);
	}

	@Path("/deletePlayer/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deletePlayer(@PathParam("id") Long id) {
		return service.deletePlayer(id);
	}

	@Path("/updatePlayer")
	@PUT
	@Produces({ "application/json" })
	public String updatePlayer(@PathParam("id") Long id , String Player) {
		return service.updatePlayer(Player, id);
	}
	
	
	public void setService(PlayerService service) {
		this.service = service;
	}

}
