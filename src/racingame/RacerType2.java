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
public class RacerType2 extends Persone {
    
    private int carType;
    
    public RacerType2(String fName, String lName, String playerNumber, int carType) {
        super(fName, lName, playerNumber);
        this.carType = carType;
    }

    public int getCarType() {
        return carType;
    }

    @Override
    public String toString() {
       return super.toString()+" and car type " + carType+ " WIN!!!";
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }

    @Override
    public int moveFoaward(int roll) {
        
        int playerRoll = 0 ; 


	if (roll >= 0 && roll <= 4)
	{
		playerRoll +=3;
	
	}

	if (roll == 5 || roll == 6)
	{
		playerRoll -=0;
	}

	if (roll >= 7 && roll <= 9)
	{ 
		playerRoll +=1;
	}
        
        return playerRoll;
    }
    
    
    
}
