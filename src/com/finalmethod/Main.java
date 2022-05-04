package com.finalmethod;

import java.util.Vector;

public class Main {
	
	 
	public static void main(String[] args) {
		

	
	 Vector v = new Vector(214444);
     Vector v1 = new Vector(214744444);
     Vector v2 = new Vector(214444);
     System.out.println("Memory Leaks");
     
     String s1 = "cengizhan";
     s1.concat(" karabel");
     
     System.out.println(s1);
	
	}

}
