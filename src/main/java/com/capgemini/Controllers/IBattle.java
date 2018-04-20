package com.capgemini.Controllers;

import com.capgemini.Models.Arena;
import com.capgemini.Models.Player;

import java.util.List;

public class IBattle {
    private double attack;
    private double power;
    private int health;

    public void battle(Player player1, Player player2, List<Player> playerList) {


            //Player2 attacks Player1. Advantages are BattleItem and higher attack
            if (player1.isBattleItem() == true){
                attack = 2;
            } else { attack = 1;}

            if (player2.getDefence() - player1.getAttack() >=0) {
                // defence player2 bigger attack player1 -> 1 plus ratio
                power = 1 + ( player2.getDefence() - player1.getAttack() ) / (player2.getDefence() + player1.getAttack());
            } else {
                // defence player 2 smaller attack player1 ->
                power = 2 + ((player2.getDefence() - player1.getAttack()) / ((player2.getDefence() + player1.getAttack()) ));
            }
            health =(int) (attack * power * 0.5 * player1.getHealth() * Math.random());
            if (health <= 0) {
                health = 0;
                System.out.println("Player " + player1.getName() + " missed!");
            } else {
                if (player2.getHealth() - health <=0) {
                    player2.setHealth(0);
                } else {
                    player2.setHealth(player2.getHealth() - health);
                }
                System.out.println("Player " + player1.getName() + " struck " + health + " with a nice swing. Player " + player2.getName() + " has " + player2.getHealth() + " life points left.");
            }

            // player dead
            if (player1.getHealth() <= 0) {
                player1.setAlive(false);
                playerList.remove(player1);
                System.out.println(player1.getName() + "just died... :/");
            } else if (player2.getHealth() <= 0) {
                player2.setAlive(false);
                playerList.remove(player2);
                System.out.println(player2.getName() + " just died... :/");
            }

    }


}
