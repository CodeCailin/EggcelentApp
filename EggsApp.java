/*
Eggs Program
Claire McDermott
18 Feb 21

*/

import java.util.*;

public class EggsApp{
	public static void main(String[]args){


	//variables
	final int FULLBOX;
	int eggs;
	int totalFilledBoxes;
	int remainder;



	//objects
	Scanner keyboard=new Scanner(System.in);
	Eggs myEggs = new Eggs();


	//input
	System.out.println("How many eggs did you collect");
	eggs=keyboard.nextInt();
	myEggs.setEggs(eggs);

	//process
	myEggs.compute();


	//output
	totalFilledBoxes=myEggs.getTotalFilledBoxes();
	remainder=myEggs.getRemainder();

	System.out.println("You can fill "+ totalFilledBoxes +" boxes fully and you will have " + remainder + " eggs left over.");



	}





}