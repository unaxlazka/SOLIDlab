package ocp;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet {
	Vector<Figure> figures = new Vector<Figure>();

	public void addFigure(Figure f) {
		figures.add(f);
	}

	public void drawFigures() {
		Enumeration<Figure> efigures = figures.elements();
		Figure f;
		while (efigures.hasMoreElements()) {
			f = efigures.nextElement();
			f.draw();
		}
	}
}