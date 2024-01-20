package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.area(10);
		
		Rectangle R = new Rectangle();
		R.area(10, 20);
	}
}
