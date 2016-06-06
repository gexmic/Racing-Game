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
public class RacerType1 extends Persone {
    
    private String carName;
    
    public RacerType1(String fName, String lName, String playerNumber, String carName) {
        super(fName, lName, playerNumber);
        this.carName = carName;
    }

    @Override
    public int moveFoaward(int roll) {
        
        int playerRoll = 0;
        
        if(roll<5)
           playerRoll = 2;           
            
        return playerRoll;
        
    }
    
    
    
}
