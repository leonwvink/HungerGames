package com.capgemini.Models;

import com.capgemini.Controllers.IBattle;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    private static boolean district;
    private static String gender;
    private List<Player> playerList = new ArrayList<>();
    private double whoHits;

    public void createPlayers() {
        for (int i = 1; i <= 24; i++) {
            if (i % 4 == 0) {
                district = true;
            } else {
                district = false;
            }
            if (i <= 12) {
                gender = "male";
            } else {
                gender = "female";
            }
            Player player = new Player(i, gender, district);
            playerList.add(player);
            System.out.println(player.getName() + " " + player.getAttack() + " " + player.getHealth() + " " + player.getGender());
        }
    }


    public void fight() {
        IBattle battle = new IBattle();

        while (playerList.get(21).isAlive() == true && playerList.get(23).isAlive() == true){
            whoHits = Math.random();
            if (whoHits > 0.5) {
                battle.battle(playerList.get(21), playerList.get(23));
            } else {
                battle.battle(playerList.get(23), playerList.get(21));
            }
        }

    }



}
