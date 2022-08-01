package net.emmecilab.players.controller;

import java.util.List;

import net.emmecilab.players.model.Player;
import net.emmecilab.players.service.PlayerServiceDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/v1")
public class PlayersController {

	@Autowired
	private PlayerServiceDB playerService;

	@Operation(summary = "View a list of players")
	@ApiResponse(responseCode = "200", description = "Successfully retrieved list")
	@ApiResponse(responseCode = "401", description = "You are not authorized to access this resource")
	@ApiResponse(responseCode = "404", description = "List not found")
	@GetMapping("/players")
	public List<Player> getAllPlayers() {
		return playerService.getAllPlayers();
	}

	@Operation(summary = "Get a player")
	@ApiResponse(responseCode = "200", description = "Successfully retrieved player")
	@ApiResponse(responseCode = "401", description = "You are not authorized to access this resource")
	@ApiResponse(responseCode = "404", description = "Player not found")
	@GetMapping("/players/{id}")
	public Player getPlayer(@PathVariable Long id) {
		return playerService.getPlayer(id);
	}

	@Operation(summary = "Add a new player")
	@ApiResponse(responseCode = "200", description = "Player added successfully")
	@ApiResponse(responseCode = "401", description = "You are not authorized to access this resource")
	@PostMapping("/players")
	public void addPlayer(@RequestBody Player player) {
		playerService.addPlayer(player);
	}

	@Operation(summary = "Update a player")
	@ApiResponse(responseCode = "200", description = "Player updated successfully")
	@ApiResponse(responseCode = "401", description = "You are not authorized to access this resource")
	@ApiResponse(responseCode = "404", description = "Player not found")
	@RequestMapping(value = "/players/{id}", method = RequestMethod.PUT)
	public void updatePlayer(@PathVariable Long id, @RequestBody Player player) {
		playerService.updatePlayer(id, player);
	}

	@Operation(summary = "Delete a player")
	@ApiResponse(responseCode = "200", description = "Player deleted successfully")
	@ApiResponse(responseCode = "401", description = "You are not authorized to access this resource")
	@ApiResponse(responseCode = "404", description = "Player not found")
	@RequestMapping(value = "/players/{id}", method = RequestMethod.DELETE)
	public void deletePlayer(@PathVariable Long id) {
		playerService.deletePlayer(id);
	}
}
