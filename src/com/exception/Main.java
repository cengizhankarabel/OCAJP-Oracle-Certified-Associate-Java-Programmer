package com.exception;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

class Friends{
	
	ArrayList<String> friendList = new ArrayList<String>();
}

public class Main {

	public static void main(String[] args) {
			
//		Mary friends with John             Output :  Mary --> John
//		Steve friends with Maya            Output :  Mary --> John; Steve --> Maya  
//		Kimberly friends with Mary        Output :  Kimbery --> Mary --> John; Steve --> Maya
//		Tina friends with Mary            Output :  Kimbery+1 --> Mary --> John; Steve --> Maya    
//		Heather friends with Mary        Output :  Kimbery+2 --> Mary --> John; Steve --> Maya
//		Silvia friends wih John            Output :  Kimbery+2 --> Mary+1 --> John; Steve --> Maya
//		public void (String name, String friendsWith)
//		{
//		System.out.println("Output :  "+ xxxxx);
//		}
		
		
		Friends forMarry = new Friends();
		Friends forSteve = new Friends();
		
		forMarry.friendList.add("John");
		
		forSteve.friendList.add("Maya");
		
		System.out.println(forMarry.friendList);
		
		
		

	}
}
