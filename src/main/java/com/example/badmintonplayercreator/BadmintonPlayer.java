
package com.example.badmintonplayercreator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BadmintonPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String playerName;
    private String skillLevel;
    private String playingStyle;
    private int speed;
    private int power;
    private String favoriteShot;

    public BadmintonPlayer() {
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getPlayingStyle() {
        return playingStyle;
    }

    public void setPlayingStyle(String playingStyle) {
        this.playingStyle = playingStyle;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFavoriteShot() {
        return favoriteShot;
    }

    public void setFavoriteShot(String favoriteShot) {
        this.favoriteShot = favoriteShot;
    }
}

