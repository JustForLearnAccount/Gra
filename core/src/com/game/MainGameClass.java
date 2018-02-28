package com.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import screens.SplashScreen;

public class MainGameClass extends Game {

    public final static String GAME_NAME = "Simple Game";

	public final static int WIDTH = 480;
	public final static int HEIGHT = 720;

	private boolean gamePaused;



	@Override
	public void create () {
        this.setScreen(new SplashScreen(this));
	}


    /**
     * -----------------------
     *  getters and setters
     *  ----------------------
     */

    public boolean isGamePaused() {
        return gamePaused;
    }

    public void setGamePaused(boolean gamePaused) {
        this.gamePaused = gamePaused;
    }
}
