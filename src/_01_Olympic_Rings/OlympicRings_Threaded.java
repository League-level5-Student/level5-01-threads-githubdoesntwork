package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

public static void execute(Robot ex, Color c) {
	ex.setSpeed(100);
	ex.penDown();
	ex.setPenColor(c);
	for (int i = 0; i < 360; i++) {
		ex.move(1);
		ex.turn(1);
	}
	ex.hide();
}
public static void main(String[] args) {
	Robot a = new Robot(100,100);
	Robot b = new Robot(170,160);
	Robot c = new Robot(240,100);
	Robot d = new Robot(310,160);
	Robot e = new Robot(380,100);
	Thread a1 = new Thread(()->execute(a,Color.blue));
	Thread b1 = new Thread(()->execute(b,Color.yellow));
	Thread c1 = new Thread(()->execute(c,Color.black));
	Thread d1 = new Thread(()->execute(d,Color.green));
	Thread e1 = new Thread(()->execute(e,Color.red));
	a1.start();
	b1.start();
	c1.start();
	d1.start();
	e1.start();
}
}

