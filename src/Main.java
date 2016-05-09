import java.util.logging.Logger;

import colours.*;
import garage.*;

public class Main {

	public Main() {
	}

	final static Logger LOGGER = Logger.getLogger(Main.class.getName());

	static Car car = new Car();

	public static void main(String[] args) {

		LOGGER.info("");

		System.out.println("The colour before change: " + car.getColour());
		Blue.makeMeBlue(car);
		System.out.println("The colour after change: " + car.getColour());
		
	}

}
