package com.upskill.assignment_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		// TODO Auto-generated method stub
		System.out.println(" My car has 4 Doors");
	}

	@Override
	public void iWheel() {
		// TODO Auto-generated method stub
		System.out.println("My car has 4 Wheel");
	}

	@Override
	public void iEngine() {
		// TODO Auto-generated method stub
		System.out.println(" my car has 2 engine");
	}

	@Override
	public int iSail() {
		// TODO Auto-generated method stub
		System.out.println(" my boat has 1 sail");
		return 1;
	}

	@Override
	public String iCabin() {
		// TODO Auto-generated method stub
		System.out.println("my boat has AC cabin ");
		return "AC";
	}
	
	/*
	(parent)         (keyword)   (child)              (keyword)       (grandchild)
    Class             extends     class(R)
    Abstract Class    extends      class(R)(R)
    Interface        Implement     class(R)
    Interface        extends     Interface[i][i]      Implements     class[R][R]
    
    */
}
