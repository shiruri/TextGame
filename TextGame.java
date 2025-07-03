package com.shiro.textgame;

public class TextGame {
    static Player pr = new Player();
    static int currentPlayerhealth = pr.getPlayerHealth();
    static String currentPlayewr = pr.getPlayerName();
    static CharacterCreation cr = new CharacterCreation();
    static boolean newGame = true;
    static MainGame m = new MainGame();

    public static void main(String[] args) {

        if (newGame == true) {
             pr = cr.createCharacter();
            newGame = false;
        }
         while (pr.isIsAlive()) {
               System.out.println(pr.toString());
                m.mainGame();
            }
        }

    }

       
           
