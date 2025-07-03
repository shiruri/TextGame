package com.shiro.textgame;
import java.util.Random;
public class MainGame {

    static Player pr = new Player();
    static Random rand = new Random();
    Enemies updateEnemy = new Enemies();
    
    Enemies goblin = new Enemies("Goblin",100,10,1.6,true);
    Enemies skeleton = new Enemies("skeleton",50,30,1.6,true);
    Enemies mage = new Enemies("mage",150,60,2.6,true);
    Enemies demon = new Enemies("demon",3300,70,1.6,true);

    
    public static void mainGame() {
        
      while(pr.isIsAlive() == true) {
          
      }
    }
}
