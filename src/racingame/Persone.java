/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racingame;

/**
 *
 * @author michael
 */
public abstract class Persone {
    private String fName;
    private String lName;
    private String playerNumber;

    public Persone(String fName, String lName, String playerNumber) {
        this.fName = fName;
        this.lName = lName;
        this.playerNumber = playerNumber;
    }
    
    public abstract int moveFoaward(int roll);

}
