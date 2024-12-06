//
//  Class author:  Christian M
//  Date created:  12/4/2024
//  General description: this makes a paddle for the game, moves left and right and bounces the ball
//

import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int X;
	private int Y;
	private int Width;
	private int Height;
	private	int Velocity;

	
	//constructor(s):
	public Paddle(int initX, int initY, int initWidth, int initHeight){
		X = initX;
		Y = initY;
		Width = initWidth;
		Height = initHeight;
	}

	//methods:
	public void draw(Graphics g){
		g.setColor(Color.yellow);
		g.fillRect(X , Y, Width, Height);
	}

	public void setX(int X){
		this.X = X;
	}
	public int getX(){
		return X;
	}

	public void setY(int Y){
		this.Y = Y;
	}
	public int getY(){
		return Y;
	}

	
	public void setWidth(int Width){
		this.Width = Width;
	}
	public int getWidth(){
		return Width;
	}

	public void setHeight(int Height){
		this.Height = Height;
	}
	public int getHeight(){
		return Height;
	}

	public void setVelocity(int Velocity){
		this.Velocity = Velocity;
	}
	public int getVelocity(){
		return Velocity;
	}

	public int addVelocity(int Velocity){
		this.Velocity += Velocity;
		return Velocity;
	}

//
//  Pre-condition: move must input a void
//  Post-condition: will move the paddle left or right
//
	public void move(){
		X += Velocity;
		if(Velocity > 0){
			Velocity--;
		}
		if (Velocity<0){
			Velocity++;
		}
	}
}
