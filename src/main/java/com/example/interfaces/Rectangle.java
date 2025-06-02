package com.example.interfaces;

public class Rectangle implements Drawable {

	private String name = "Rectangle";

	@Override
	public void draw() {
		System.out.println("사각형을 그립니다: " + name);
	}

	@Override
	public String getShapeName() {
		return name;
	}
}
