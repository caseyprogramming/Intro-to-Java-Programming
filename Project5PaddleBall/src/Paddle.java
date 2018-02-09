/*		 [Paddle].java
 *Author: [Parker Casey]
 *Submission Date: [12/5/2014]
 *
 *Purpose: A brief paragraph description of the
 *program. What does it do? this is the paddle.
		 
		
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
public class Paddle {
	//Declare instance variables
int x;
int width;
int height;
int speed;
int direction;
int courtWidth;
	public Paddle (int courtWidth)  {
				this.width=100;
				this.height=10;
				this.direction=0;
				this.speed=0;
			if(courtWidth>=width){
				this.courtWidth=courtWidth;
			}
			else{
				this.courtWidth=700;
			}
			this.x=this.courtWidth/2-(width/2);
			}

	public Paddle (int width, int courtWidth)  {
			if(courtWidth>0&&courtWidth>this.width){
				this.courtWidth=courtWidth;	
			}
			else{
				this.courtWidth=700;
			}
			if(width>0){
			this.width=width;
			}
			else{
				this.width=100;
			}
			}

			public int getX() { 
				return x;
			}  
			
			public int getDirection() {
				return direction;
			}
			
			public int getSpeed() {
				return speed;
			}

			public int getWidth() {
				return width;
			}
				
			public int getHeight() {
				return height;
			}  
			
			public void setDirection(int direction)   {
				if(direction==-1){
					this.direction=-1;
				}
				if(direction==1){
					this.direction=1;
				}
				if(direction==0){
					this.direction=0;
				}
			}
			
			public void setSpeed(int speed)   {
				if(speed>=1){
					this.speed=speed;
				}
			}

			public void move() {
				if(direction==-1){
					
					this.x=this.x+(this.speed*-1);
					if(this.x<=0){
						this.x=0;
					}
				}
				if(direction==1){
					
					this.x=this.x+(this.speed*1);
					if((this.x+(this.width))>=courtWidth){
						this.x=courtWidth-(this.width);
					}
				}
				if(direction==0){
					this.x=this.x;
				}
			}
			
			public boolean isCollision(Ball aBall) {
			/*if(this.height==(aBall.y-aBall.radius)){
				if((aBall.x-aBall.radius)==((this.width/2)+this.x)||(this.x-(this.width/2))==(aBall.x-aBall.radius)){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}*/
				
				
				if(this.height>=(aBall.y-aBall.radius)){
					if((aBall.x-aBall.radius)<=(this.x+this.width)&&(aBall.x+aBall.radius)>=(this.x)){	
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}
			}
			
			public void center()  {
			this.x=(courtWidth/2-(width/2));
			
			}

			public String toString() {
				return "Paddle center: "+this.x+"\n Paddle direction: "+this.direction+"\n Paddle speed: "+this.speed+"\n Paddle width: "+this.width+"\n Paddle height: "+this.height;
				
			}

}
