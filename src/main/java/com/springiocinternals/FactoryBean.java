package com.springiocinternals;

import java.util.logging.Level;
import java.util.logging.Logger;


interface Shape {
	void draw();
}

class Circle implements Shape {

	final Logger LOGGER = Logger.getLogger(this.getClass().getName());

	@Override
	public void draw() {
		LOGGER.log(Level.INFO, "Circle implements Shape - Circle.draw()");
	}
}

class Rectangle implements Shape {

	final Logger LOGGER = Logger.getLogger(this.getClass().getName());

	@Override
	public void draw() {
		LOGGER.log(Level.INFO, "Rectangle implements Shape - Rectangle.draw()");
	}
}

class Square implements Shape {

	final Logger LOGGER = Logger.getLogger(this.getClass().getName());

	@Override
	public void draw() {
		LOGGER.log(Level.INFO, "Square implements Shape - Square.draw()");
	}
}

public class FactoryBean {
	
	private String shapeType;

	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}
	
	public String getShapeType() {
		return shapeType;
	}

	// use getShape method to get object of specified shape type
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase(Shap.CIRCLE.value)) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase(Shap.RECTANGLE.value)) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase(Shap.SQUARE.value)) {
			return new Square();
		}
		//else
		return null;
	}
}

enum Shap {

	CIRCLE("CIRCLE"), RECTANGLE("RECTANGLE"), SQUARE("SQUARE");
	public final String value;

	private Shap(String value) {
		this.value = value;
	}
}