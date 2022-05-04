package com.mylist;

import java.util.ArrayList;
import java.util.List;

public class MyListGeneric<Object> {
    private List<Object> values=new ArrayList<>();
	
    public void add(Object value) {
        values.add(value);    //line 1
        System.out.println(values);
    }
	
    public static void main(String[] args) {
		MyListGeneric<String> myListString = new MyListGeneric<String>();
		myListString.add("Good");
	}
}
