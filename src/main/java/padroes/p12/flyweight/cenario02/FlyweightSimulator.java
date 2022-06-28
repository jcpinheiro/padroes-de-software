package padroes.p12.flyweight.cenario02;

import java.util.Random;

public class FlyweightSimulator {

	private Random random;
	private String[] colors = {"RED", "GREEN", "BLUE"};
	private ShapeFactory shapeFactory;
	
	public FlyweightSimulator() {
		random = new Random();
		shapeFactory = new ShapeFactory();
	}
	
	public void run() {
		
		for(int i=0;i<30;++i) {
			Rectangle rectangle = (Rectangle) shapeFactory.getShape(getRandomColor());
			rectangle.setX(getRandomCoordinate());
			rectangle.setY(getRandomCoordinate());
			rectangle.draw();
		}	
	}

	private String getRandomColor() {
		return colors[random.nextInt(colors.length)];
	}
	
	private int getRandomCoordinate() {
		return random.nextInt(50);
	}
}
