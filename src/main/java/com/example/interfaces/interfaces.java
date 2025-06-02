package com.example.interfaces;

import java.util.ArrayList;
import java.util.List;

public class interfaces {
	public static void main(String[] args) {

		List<Drawable> shapes = new ArrayList<>();
		shapes.add(new Circle());
		shapes.add(new Rectangle());
		shapes.add(new Circle());

		for (Drawable shape : shapes) {
			System.out.print("[" + shape.getShapeName() + "] ");
			shape.draw();
		}

		System.out.println("--------------------");

		Drawable drawable = new Rectangle();
		drawable.draw();
	}
}
