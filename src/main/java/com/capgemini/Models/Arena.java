package com.capgemini.Models;

import com.capgemini.Controllers.IBattle;
import com.capgemini.Controllers.LocChange;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    private static boolean district;
    private static String gender;
    private List<Player> playerList = new ArrayList<>();
    private double whoHits;
    public boolean gameOn =true;
    private int deadCount;

    public void createPlayers() {
        for (int i = 1; i <= 24; i++) {
            if (i % 4 == 0) {
                district = false;
            } else {
                district = true;
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


    public void fight(Player player1, Player player2) {
        IBattle battle = new IBattle();
        //while both player alive, fight goes on
        System.out.println("It's game on between player " + player1.getName() + " and player " + player2.getName() + "!");
        //while (playerList.get(21).isAlive() == true && playerList.get(23).isAlive() == true){
        while (player1.isAlive() == true && player2.isAlive() == true){
            // random who attacks
            whoHits = Math.random();
            if (whoHits > 0.5) {
                battle.battle(player1, player2, playerList);
            } else {
                battle.battle(player2, player1, playerList);
            }
        }

    }

    public void gameOn(){
        LocChange locChange = new LocChange();

        while (gameOn == true) {
            locChange.changeLocation(playerList);
            locChange.checkLocation(playerList);

            for (int i=0; i<=playerList.size()-1; i++) {
                if (playerList.get(i).isAlive() == false){
                    deadCount = deadCount + 1;
                }
            }
            if (deadCount == 23){
                gameOn = false;
                System.out.println("wuuuhuuu " + playerList.get(0).getName() + " won!! Ah shit and he just got killed also... Why?!");
            }


        }
    }





}
