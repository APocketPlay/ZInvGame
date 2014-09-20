package de.appg.Screen;

import GameWorld.GameRenderer;
import GameWorld.GameWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import de.appg.Manager.InputHandler;
import de.appg.ZInvGame.ZInvGame;

public class GameScreen implements Screen {

	// Game //
	private ZInvGame zInvGame;
	
	private GameWorld world;
	private GameRenderer renderer;
	private float runTime;
	
	public GameScreen(ZInvGame zInvGame) {
		this.zInvGame = zInvGame;
		
		// Dimension of the Gamescreen //
		float screenWidth = Gdx.graphics.getWidth();
		float screenHeight = Gdx.graphics.getHeight();
				
		float gameWidth = 480;
		float gameHeight = 320;
		
		// Gameworld, Input and Renderer //
		world = new GameWorld(zInvGame);
		Gdx.input.setInputProcessor(new InputHandler(zInvGame, world, screenWidth, screenHeight, gameWidth, gameHeight));
		renderer = new GameRenderer(world, gameWidth, gameHeight);
	}
	
	@Override
	public void render(float delta) {
		runTime += delta;	
		world.update(delta);
		renderer.render(delta, runTime);		
	}

	@Override
	public void resize(int width, int height) {
		// Resize of the Gamescreen //
		float screenWidth = Gdx.graphics.getWidth();
		float screenHeight = Gdx.graphics.getHeight();
		
		float gameWidth = 480;
		float gameHeight = 320;
		
		world = new GameWorld(zInvGame);
		Gdx.input.setInputProcessor(new InputHandler(zInvGame, world, screenWidth, screenHeight, gameWidth, gameHeight));
		renderer = new GameRenderer(world, gameWidth, gameHeight);
		world.setRenderer(renderer);	
	}

	@Override
	public void show() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		
	}

}
