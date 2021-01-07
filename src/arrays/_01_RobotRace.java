package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot[] robots = new Robot[5];
	Random random = new Random();
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.
for (int i = 0; i < robots.length; i++) {
	robots[i] = new Robot();
	robots[i].setSpeed(25);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
for (int i = 0; i < robots.length; i++) {
	robots[i].setX(250 + 100*i);
	robots[i].setY(500);
}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
while( robots[0].getY() > 0 && robots[1].getY() > 0 && robots[2].getY() > 0 && robots[3].getY() > 0 && robots[4].getY() > 0)
for (int i = 0; i < robots.length; i++) {

	robots[i].move(random.nextInt(50));
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
Robot farthestrobot = robots[0];
for (int i = 0; i < robots.length; i++) {
	if(farthestrobot.getY() >= robots[i].getY()) {
		farthestrobot = robots[i];
	}
}
if(farthestrobot.getX() == 250) {
	System.out.println("robot0 " + farthestrobot.getY());
}
if(farthestrobot.getX() == 350) {
	System.out.println("robot1 " + farthestrobot.getY());
}
if(farthestrobot.getX() == 450) {
	System.out.println("robot2 " + farthestrobot.getY());
}
if(farthestrobot.getX() == 550) {
	System.out.println("robot3 " + farthestrobot.getY());
}
if(farthestrobot.getX() == 650) {
	System.out.println("robot4 " + farthestrobot.getY());
}
System.out.println(farthestrobot.toString() + farthestrobot.getY());
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
