package com.capgemini.Models;

public class Player {
    private int name;
    private boolean isAlive = true;
    private int health = 100;
    private String gender;
    private double attack = 100;
    private double defence = 100;
    private boolean battleItem = false;
    private boolean isDistrict;
    private int locX;
    private int locY;


    public Player(int name, String gender, boolean isDistrict) {
        this.name = name;
        this.gender = gender;
        this.isDistrict = isDistrict;
        // defence bonus due to the drive
        if (isDistrict == true) {
            this.defence = defence * 1.4;
        } else {
            // attack bonus due to the training. Got sword also.
            this.battleItem = true;
            this.attack = attack * 1.8;
        }
        this.attack = (int) (10*attack*Math.random());
        this.defence = (int)  (10*defence*Math.random());
        this.locX =(int) (10*Math.random());
        this.locY = (int) (10*Math.random());

    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public boolean isBattleItem() {
        return battleItem;
    }

    public void setBattleItem(boolean battleItem) {
        this.battleItem = battleItem;
    }

    public boolean isDistrict() {
        return isDistrict;
    }

    public void setDistrict(boolean district) {
        isDistrict = district;
    }

    public int getLocX() {
        return locX;
    }

    public void setLocX(int locX) {
        this.locX = locX;
    }

    public int getLocY() {
        return locY;
    }

    public void setLocY(int locY) {
        this.locY = locY;
    }
}
