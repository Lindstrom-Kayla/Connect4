/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.connect4.enums;

/**
 *
 * @author SexyMama
 */
public enum GameStatus {
    S ("Settings Menu"),
    T ("Tips"),
    B ("Background Color"), 
    G ("Game Color"), 
    H ("Help Menu"),
    I ("Instructions"), 
    Q ("Quit"),
    A ("Statistics Menu"), 
    M ("Main Menu");

String value;
GameStatus(String value) {
    this.value = value;
}
public String getValue() {
    return value;
}
}
