package com.capgemini.Controllers;

import com.capgemini.Models.Arena;
import com.capgemini.Models.Player;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

public class LocChange {

    //private List<int> games = new ArrayList<>();

    public void changeLocation(List<Player> playerList) {
        for (int i = 0; i <= playerList.size()-1; i++) {
            playerList.get(i).setLocX((int) (10* Math.random()));
            playerList.get(i).setLocY((int) (10* Math.random()));
        }
    }

    public void checkLocation(List<Player> playerList) {
        for (int i = 0; i <= playerList.size()-1; i++) {
            for (int j = 0; j <= playerList.size()-1; j++) {
                if (i != j && playerList.get(i).getLocX() == playerList.get(j).getLocX() && playerList.get(i).getLocY() == playerList.get(j).getLocY() && playerList.get(i).isAlive() == true && playerList.get(j).isAlive() == true) {
                    //games.add(i);
                    //games.add(j);


                    Arena arena = new Arena();
                    arena.fight(playerList.get(i), playerList.get(j));

                }
            }
        }

    }

}
