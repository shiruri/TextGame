package com.shiro.textgame;

public class Enemies {
 
    private String enemyName;
    private int enemyHealth;
    private int enemyDamage;
    private double enemyDefense;
    private boolean isAlive;
    
    public Enemies() {
    }
   

    public Enemies(String enemyName, int enemyHealth, int enemyDamage, double enemyDefense, boolean isAlive) {
        this.enemyName = enemyName;
        this.enemyHealth = enemyHealth;
        this.enemyDamage = enemyDamage;
        this.enemyDefense = enemyDefense;
        this.isAlive = isAlive;
    }
    
    

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }

    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    public double getEnemyDefense() {
        return enemyDefense;
    }

    public void setEnemyDefense(int enemyDefense) {
        this.enemyDefense = enemyDefense;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
}
