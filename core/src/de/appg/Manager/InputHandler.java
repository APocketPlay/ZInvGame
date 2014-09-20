package de.appg.Manager;

import GameWorld.GameWorld;

import com.badlogic.gdx.InputProcessor;

import de.appg.ZInvGame.ZInvGame;

public class InputHandler implements InputProcessor {

	private ZInvGame zInvGame;
	private GameWorld world;
	
		// VARIABLES //
		private float screenWidth, screenHeight;
		private float gameWidth, gameHeight;
		
		private float scaleFactorX;
		private float scaleFactorY;
		
	public InputHandler(ZInvGame game, GameWorld world, float screenWidth, float screenHeight, float gameWidth, float gameHeight) {
		this.zInvGame = zInvGame;
		this.world = world;
		
		// Scale Mouseinput //
		this.scaleFactorX = screenWidth / gameWidth;
		this.scaleFactorY = screenHeight / gameHeight;
		
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		
		this.gameWidth = gameWidth;
		this.gameHeight = gameHeight;
	}
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
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

	// Scale Mouseinput //
	private int scaleX(int screenX) {
		return (int) (screenX / scaleFactorX);
	}

	private int scaleY(int screenY) {
		return (int) (screenY / scaleFactorY);
	}
}
