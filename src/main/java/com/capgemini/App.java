package com.capgemini;

import com.capgemini.Models.Player;

/**
 * Hello world!
 *
 */
public class App 
{


    private static boolean district;
    private static String gender;

    public static void main( String[] args ) {

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
            System.out.println(player.getName() + " " + player.getAttack() + " " + player.getHealth() + " " + player.getGender());
        }





        System.out.println(  );
    }
}
