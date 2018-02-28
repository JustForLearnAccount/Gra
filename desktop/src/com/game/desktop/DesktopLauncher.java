package com.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.game.MainGameClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = MainGameClass.GAME_NAME;
		config.width = MainGameClass.WIDTH;
		config.height = MainGameClass.HEIGHT;
		config.resizable = false;

		new LwjglApplication(new MainGameClass(), config);
	}
}
