package padroes.p12.flyweight.cenario02;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	// we will create a rectangle for every color
	private Map<String, Shape> shapes;
	
	public ShapeFactory() {
		shapes = new HashMap<>();
	}
	
	// get a shape based on a given color
	public Shape getShape(String color) {
		
		if(shapes.containsKey(color))
			return shapes.get(color);
		
		System.out.println("Creating a new rectangle...");
		Shape shape = new Rectangle(color);
		shapes.put(color, shape);
		return shape;	
	}
}
