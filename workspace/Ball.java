import java.awt.*;

//
//  Class author:  Christian M
//  Date created:  12/4/2024
//  General description: this makes a ball for the game that bounces around and destroys blocks
//
public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int Xpos;
	private int Ypos;
	private int size;
	private int XVelocity;
	private int YVelocity;
	private int reverseX;
	private int reverseY;
	
	//constructor(s):
	public Ball(int initXpos, int initYpos, int initSize){
		Xpos = initXpos;
		Ypos = initYpos;
		size = initSize;
		XVelocity = 2;
		YVelocity = 2;
	}

	//methods:
//
//  Pre-condition: input g
//  Post-condition: will make a ball grpahic with color and a size
//
	public void draw(Graphics g){
		g.setColor(Color.green);
		g.fillOval(Xpos , Ypos, size, size);
	}


	public void setSize(int size){
		this.size = size;
	}
	public int getSize(){
		return size;
	}


	public void setX(int Xpos){
		this.Xpos = Xpos;
	}
	public int getXpos(){
		return Xpos;
	}


	public void setY(int Ypos){
		Ypos = this.Ypos;
	}
	public int getYpos(){
		return Ypos;
	}


	public void setYVelocity(int YVelocity){
		this.YVelocity = YVelocity;
	}
	public int getYVelocity(){
		return YVelocity;
	}


	public void setXVelocity(int XVelocity){
		this.XVelocity = XVelocity;
	}
	public int getXVelocity(){
		return XVelocity;
	}

//
//  Pre-condition: reverse x and y must input an int valuse
//  Post-condition: will reverse that velocity
//

	public int reverseX(){
		XVelocity = -XVelocity;
		return reverseX;
	}
	public int reverseY(){
		YVelocity = -YVelocity;
		return reverseY;
	}

//
//  Pre-condition: move must input a void
//  Post-condition: will move the ball
//

	public void move(){
		Xpos += XVelocity;
		Ypos += YVelocity;
	}
	
}
