/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.enums;

/**
 *
 * @author Josh
 */
  public enum Instructions {
        Instructions ("Each player is given either red or black \n"
                + "tokens to play. The board consists of circular slots for \n"
                + "these tokens; 7 columns wide and 6 rows high. The players \n"
                + "take turns filling in the slots with their tokens; with \n"
                + "each token placed settling into the lowest row of the \n"
                + "column placed. The game is over when one player \n"
                + "'connects 4' tokens in an uninterrupted row. Have fun! \n");
    
    
  String instruct;
Instructions(String instructs) {
    this.instruct = instructs;
}
public String getValue() {
    return instruct;
}

public void display() {
     System.out.println(this.instruct);
}
  }