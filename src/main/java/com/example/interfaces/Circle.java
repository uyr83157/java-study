package com.example.interfaces;

public class Circle implements Drawable {

	private String name = "Circle";

	@Override
	public void draw() {
		System.out.println("원을 그립니다: " + name);
	}

	@Override
	public String getShapeName() {
		return name;
	}
}
