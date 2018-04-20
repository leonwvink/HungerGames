package com.capgemini;

import com.capgemini.Controllers.IBattle;
import com.capgemini.Models.Arena;
import com.capgemini.Models.Player;

import static sun.audio.AudioPlayer.player;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {
        Arena startGame = new Arena();
        startGame.createPlayers();
        //startGame.fight();
        startGame.gameOn();



    }
}
