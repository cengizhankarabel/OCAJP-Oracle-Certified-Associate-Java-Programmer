package com.quiz;

@FunctionalInterface
interface DefaultMethodInterface {
	default void implementedMethod() {
		System.out.println("inside interface");
	}
}

public class Quiz implements DefaultMethodInterface {
	void implementedMethod() {
		System.out.println("inside class");
	}
}
