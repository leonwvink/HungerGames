package com.capgemini.Models;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    private static boolean district;
    private static String gender;
    private List<Player> playerList = new ArrayList<>();

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


    
}
