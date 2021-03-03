/*
Eggs Program
Claire McDermott
18 Feb 21

*/


public class Eggs {

//variables
private final int FULLBOX;
private int eggs;
private int totalFilledBoxes;
private int remainder;


//Constructors
public Eggs(){
	FULLBOX=12;
	eggs=0;
	remainder=0;
	totalFilledBoxes=0;
}

//Getters
public void setEggs(int eggs){
this.eggs=eggs;

}


//process
public void compute(){
	totalFilledBoxes=eggs/FULLBOX;
	remainder=eggs%FULLBOX;
}



//setteres
public int getTotalFilledBoxes(){
	return totalFilledBoxes;
	}

public int getRemainder(){
		return remainder;
		}











}