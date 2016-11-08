package com.mygdx.game.myclasses;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/*
További tartalmak:
.
.
.
*/

public class MyGdxGame extends Game {

	SpriteBatch batch;



	@Override
	public void create () {
        Assets.prepare();
		setScreen(new LoadingScreen(this));
	}

    @Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void setScreen(Screen screen) {
		super.setScreen(screen);
	}

	@Override
	public void dispose () {
		super.dispose();
	}

}
