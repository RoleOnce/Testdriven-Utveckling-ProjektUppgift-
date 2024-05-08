package se.reky.hakan.web;

import jakarta.persistence.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import se.reky.hakan.model.Player;
import se.reky.hakan.service.PlayerService;

@Controller
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public String listPlayers(Model model) {
        model.addAttribute("players", playerService.findAllPlayersSortedByExperience());
        return "players"; // Name of the Thymeleaf template
    }

    @GetMapping("/player/{id}")
    public String showPlayer(@PathVariable Long id, Model model) {

        model.addAttribute("player", playerService.findPlayerById(id));

        return "player";
    }

    /*
    @GetMapping("/player")
    public String showPlayer(Model model, @RequestParam("id") Long id) {

        model.addAttribute("player", playerService.findPlayerById(id));
        return "player";
    }
     */
}
