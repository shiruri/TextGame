package com.shiro.textgame;
import java.util.*;

public class CharacterCreation {
    static Scanner scan = new Scanner(System.in);
    
    static Player createCharacter() {
        System.out.print("Enter Player Name: ");
        String playerName = scan.nextLine();
        Player pr = new Player(playerName,100,10,1.5,true);
        return pr;
    }
}
