/*		 [Ball].java
 *Author: [Gregory Casey]
 *Submission Date: [12/5/2014]
 *
 *Purpose: A brief paragraph description of the
 *program. What does it do? this program is the ball.
		 
		
 *Statement of Academic Honesty:
		
 *The following code represents my own work. I have neither
 *received nor given inappropriate assistance. I have not copied
 *or modified code from any source other than the course webpage
 *or the course textbook. I recognize that any unauthorized
 *assistance or plagiarism will be handled in accordance with
 *the University of Georgia's Academic Honesty Policy and the
 *policies of this course. I recognize that my work is based
 *on an assignment created by the Department of Computer
 *Science at the University of Georgia. Any publishing
 *or posting of source code for this project is strictly
 *prohibited unless you have written consent from the Department
 *of Computer Science at the University of Georgia. 	
 */
import java.util.Random;

public class Ball {
	// CHECK TO SEE WHICH IS
	// PRIVATE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	int x;
	int y;
	int color;
	int radius;
	int speed;
	int xDir;
	int yDir;
	int courtWidth;
	int courtHeight;

	public Ball(int x, int y, int speed, int xDir, int yDir, int courtWidth,
			int courtHeight) {
		if (xDir == 1 || xDir == -1) {
			this.xDir = xDir;
		} else {
			this.xDir = 1;
		}
		if (yDir == 1 || yDir == -1) {
			this.yDir = yDir;
		} else {
			yDir = 1;
		}

		if (speed > 0 && speed <= 5) {
			this.speed = speed;
		} else {
			this.speed = 1;
		}
		if (courtWidth > (radius * 2)) {
			this.courtWidth = courtWidth;
		} else {
			courtWidth = 700;
		}
		if (courtHeight > (radius * 2)) {
			this.courtHeight = courtHeight;
		} else {
			courtHeight = 300;
		}
		if (x <= (courtWidth) && x >= 0) {
			this.x = x;
		} else {
			this.x = (courtWidth / 2);
		}
		if (y <= (courtHeight) && y >= (0)) {
			this.y = y;
		} else {
			this.y = (courtHeight / 2);
		}
		Random r = new Random();
		int low = 0;
		int high = 7;
		int color = r.nextInt(high - low) + low;
		this.color = color;

		// this.color=color;
		Random r2 = new Random();
		int low2 = 15;
		int high2 = 21;
		int R2 = r2.nextInt(high2 - low2) + low2;
		this.radius = R2;

		// // CHECK FOR IF
		// 0!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// Random rand = new Random(System.currentTimeMillis());
		// int randomColor = rand.nextInt(6)+1;
		// this.color=randomColor;
		// // CHECK FOR IF
		// 0!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// Random rand2 = new Random(System.currentTimeMillis());
		// int randomRadius = rand2.nextInt(6)+15;
		// this.radius=randomRadius;

	}

	public Ball(int x, int y, int radius, int courtWidth, int courtHeight) {
		if (x <= (courtWidth) && x >= 0) {
			this.x = x;
		} else {
			this.x = (this.courtWidth / 2);
		}
		// / look at this?
		if (y <= (courtHeight) && y >= 0) {
			this.y = y;
		} else {
			this.y = (this.courtHeight / 2);
		}

		this.xDir = 1;
		this.yDir = 1;
		this.speed = 1;

		if (courtWidth > (radius * 2)) {
			this.courtWidth = courtWidth;
		} else {
			courtWidth = 700;
		}
		if (courtHeight > (radius * 2)) {
			this.courtHeight = courtHeight;
		} else {
			courtHeight = 300;
		}
		// // CHECK FOR IF
		// 0!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// Random rand2 = new Random(System.currentTimeMillis());
		// int randomRadius = rand2.nextInt(6)+15;
		Random r = new Random();
		int low = 0;
		int high = 7;
		int color = r.nextInt(high - low) + low;
		this.color = color;
		Random r2 = new Random();
		int low2 = 15;
		int high2 = 21;
		int R2 = r2.nextInt(high2 - low2) + low2;
		// this.radius=R2;
		if (radius < 15) {
			this.radius = 15;
		} else {
			this.radius = R2;
		}
		// CHECK FOR IF
		// 0!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		Random rand = new Random(System.currentTimeMillis());
//		int randomColor = rand.nextInt(6) + 1;
//		this.color = randomColor;
	}

	public int getRadius() {
		return radius;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

	public int getXDir() {
		return xDir;
	}

	public int getYDir() {
		return yDir;
	}

	public void setColor(int color) {
		// Random r = new Random();
		// int low = 0;
		// int high=7;
		// int R = r.nextInt(high-low)+low;
		if (color >= 0 && color <= 6) {
			this.color = color;
		}

		// Random rand = new Random(System.currentTimeMillis());
		// int randomColor = rand.nextInt(6)+1;
		// if(color<=6&&color>=1)
		// {
		// this.color=randomColor;
		// }
	}

	public void setX(int x) {

		if (x <= (this.courtWidth) && x >= 0) {
			this.x = x;
		}

	}

	public void setY(int y) {
		if (y <= (this.courtHeight) && y >= 0) {
			this.y = y;
		}

	}

	public void flipXDir() {
		this.xDir = this.xDir * (-1);

	}

	public void flipYDir() {
		this.yDir = this.yDir * (-1);
	}

	public void move() {
		// bounce left/right
		if (((this.x + (this.speed * this.xDir) - this.radius) <= 0)||(this.x + (this.speed * this.xDir) + this.radius) >= this.courtWidth) {
					this.flipXDir();
		}
		if (this.xDir == 1) {
			this.x = this.x + (this.speed * this.xDir);
		}
		if (this.xDir == -1) {
			this.x = this.x + (this.speed * this.xDir);
		}
		if ((this.y + (this.speed * this.yDir) - this.radius) <= 0||(this.y + (this.speed * this.yDir) + this.radius) >= this.courtHeight) {
					this.flipYDir();
		}
		if (this.yDir == 1) {
			this.y = this.y + (this.speed * this.yDir);
		}
		if (this.yDir == -1) {
			this.y = this.y + (this.speed * this.yDir);
		}
	

	}

	public boolean isCollision(Ball anotherBall) {
		double distanceXcenter = anotherBall.x - this.x;
		double distanceYcenter = anotherBall.y - this.y;
		double distanceCenter = Math.sqrt(Math.pow(distanceXcenter, 2)
				+ Math.pow(distanceYcenter, 2));
		if ((this.radius + anotherBall.radius) >= distanceCenter) {
			return true;
		} else {
			return false;
		}
	}

	public void increaseSpeed() {
		if (this.speed <= 5) {
			this.speed = this.speed + 1;
		}
	}

	public void decreaseSpeed() {
		if (this.speed > 1) {
			this.speed = this.speed - 1;
		}
	}

	public String toString() {
		return "Ball center:" + this.x + "," + this.y + "\n Ball color: "
				+ this.color + "\n Ball radius: " + this.radius
				+ "\n Ball speed: " + this.speed;

	}
}
