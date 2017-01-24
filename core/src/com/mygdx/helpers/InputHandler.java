package com.mygdx.helpers;

import com.badlogic.gdx.InputProcessor;
import com.mygdx.gameobjects.Bird;

public class InputHandler implements InputProcessor {

	private Bird myBird;
	
	public InputHandler(Bird bird){
		myBird = bird;
	}//end InputHandler constructor
	
	@Override
	public boolean keyDown(int keycode) {
		myBird.onClick();
		return true; //Return true to say we handled the touch
		
		// TODO Auto-generated method stub
		//return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
