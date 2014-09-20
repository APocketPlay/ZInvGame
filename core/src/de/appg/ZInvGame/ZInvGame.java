package de.appg.ZInvGame;

import com.badlogic.gdx.Game;

import de.appg.Manager.AssetLoader;
import de.appg.Screen.SplashScreen;

public class ZInvGame extends Game {
		
	// - - Main - - //
	public ZInvGame() {
		
	}
	
	@Override
	public void create () {
		// Create AssetLoader //
		AssetLoader.load();
		// Set Screen //
		setScreen(new SplashScreen(this));
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}	
}
