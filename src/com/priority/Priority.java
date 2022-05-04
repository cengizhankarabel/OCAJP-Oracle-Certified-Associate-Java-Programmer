package com.priority;

class ThreadClass extends Thread
{
	public ThreadClass()
	{
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class Priority 
{
	public static void main(String[] args) 
	{
		new ThreadClass();
	}
}
