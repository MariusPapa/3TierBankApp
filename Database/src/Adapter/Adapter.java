package Adapter;

import java.util.ArrayList;

public class Adapter implements IAdapter{
	
	private Adaptee adaptee;
	
	public Adapter() throws ClassNotFoundException
	{
		adaptee = new Adaptee();
	}
	
}
