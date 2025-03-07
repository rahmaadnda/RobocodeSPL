package jab.movement;

import robocode.HitWallEvent;
import robocode.Event;

import jab.module.Module;
import jab.module.Movement;

public class Line extends Movement {
	
	private int moveDirection;
	
	public Line(Module bot) {
		super(bot);
		moveDirection = 1;
	}

	public void move() {
		// Limit our speed to 5
		bot.setMaxVelocity(8);
		// Start moving (and turning)
		bot.setAhead(10000 * moveDirection);
	}
	
	public void listen(Event e) {
		if (e instanceof HitWallEvent) {
			// move back a little after hitting the wall and before reversing
			bot.setBack(100);
			
			moveDirection *= -1;
		}
	}


}