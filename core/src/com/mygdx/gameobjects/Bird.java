package com.mygdx.gameobjects;

import com.badlogic.gdx.math.Vector2;

public class Bird {

	private Vector2 position;
	private Vector2 velocity;
	private Vector2 acceleration;
	
	private float rotation;
	private int width;
	private int height;
	
	public Bird(float x, float y, int width, int height){
		this.width = width;
		this.height = height;
		position = new Vector2(x,y);
		velocity = new Vector2(0,0);
		acceleration = new Vector2(0, 460);
	}//end Bird constructor
	
	public void update(float delta){
		velocity.add(acceleration.cpy().scl(delta));
		if( velocity.y > 200 ){
			velocity.y = 200;
		}//end if
		position.add(velocity.cpy().scl(delta));
	}//end update method
	
	public void onClick(){
		velocity.y = -140;
	}//end onClick method
	
	public float getX(){
		return position.x;
	}//end getX method
	
	public float getY(){
		return position.y;
	}//end getY method
	
	public float getWidth(){
		return width;
	}//end getWidth method
	
	public float getHeight(){
		return height;
	}//end getHeight method
	
	public float getRotation(){
		return rotation;
	}//end getRotation method
}//end Bird class
