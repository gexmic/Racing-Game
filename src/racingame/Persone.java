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
    private String carNumber;
    
    public Persone(String fName, String lName, String carNumber) {
        this.fName = fName;
        this.lName = lName;
        this.carNumber = playerNumber;
    }
    public String getfName() {
        return fName;
    }

    @Override
    public String toString() {
        return "Player "+ fName + " "+ lName+ " "+ "With the car# "+ carNumber;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }
    private String playerNumber;

    
    
    public abstract int moveFoaward(int roll);

}
