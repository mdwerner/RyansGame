package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.AnimationDemo;
import com.mygdx.game.InputDemo;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		//new LwjglApplication(new MyGdxGame(), config);
		//new LwjglApplication(new AnimationDemo(), config);
		new LwjglApplication(new InputDemo(), config);
	}
}
