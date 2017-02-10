package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.AnimationDemo;
import com.mygdx.game.CameraDemo;
import com.mygdx.game.InputDemo;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.SceneDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//new LwjglApplication(new MyGdxGame(), config);
		//new LwjglApplication(new AnimationDemo(), config);
		//new LwjglApplication(new InputDemo(), config);
		config.title = "camera";
		config.width = 1280; //This changes the resolution of the game screen
		config.height = 720;
		
		//new LwjglApplication(new CameraDemo(), config);
		new LwjglApplication(new SceneDemo(), config);
	}
}
