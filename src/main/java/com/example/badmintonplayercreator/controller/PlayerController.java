
package com.example.badmintonplayercreator.controller;

import com.example.badmintonplayercreator.BadmintonPlayer;
import com.example.badmintonplayercreator.BadmintonPlayerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerController {

    private final BadmintonPlayerRepository playerRepository;

    public PlayerController(BadmintonPlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping("/")
    public String home() {
        return "player";
    }

    @PostMapping("/create")
    public String createPlayer(
            @RequestParam String playerName,
            @RequestParam String skillLevel,
            @RequestParam String playingStyle,
            @RequestParam int speed,
            @RequestParam int power,
            @RequestParam String favoriteShot,
            Model model) {

        BadmintonPlayer player = new BadmintonPlayer();
        player.setPlayerName(playerName);
        player.setSkillLevel(skillLevel);
        player.setPlayingStyle(playingStyle);
        player.setSpeed(speed);
        player.setPower(power);
        player.setFavoriteShot(favoriteShot);

        playerRepository.save(player);

        model.addAttribute("playerName", playerName);
        model.addAttribute("skillLevel", skillLevel);
        model.addAttribute("playingStyle", playingStyle);
        model.addAttribute("speed", speed);
        model.addAttribute("power", power);
        model.addAttribute("favoriteShot", favoriteShot);

        return "player";
    }
}
