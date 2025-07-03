
package com.shiro.textgame;


public class Player {
 private String playerName;
    private int playerHealth;
    private int playerDamage;
    private double playerDefense;
    private boolean isAlive = true;
    
    @Override
    public String toString() {
        return "playerName= " + this.playerName + "\nplayerHealth= " + this.playerHealth + "\nplayerDamage= " + this.playerDamage + "\nplayerDefense= " + this.playerDefense;
    }

    
    public Player() {
    }
 

    public Player(String playerName, int playerHealth, int playerDamage, double playerDefense ,boolean isAlive) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.playerDamage = playerDamage;
        this.playerDefense = playerDefense;
        this.isAlive = isAlive;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public int getPlayerDamage() {
        return playerDamage;
    }

    public void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
    }

    public double getPlayerDefense() {
        return playerDefense;
    }

    public void setPlayerDefense(double playerDefense) {
        this.playerDefense = playerDefense;
    }
  
}
