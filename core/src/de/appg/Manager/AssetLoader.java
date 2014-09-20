package de.appg.Manager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {

	// Diese Klasse lädt Dateien des Spiels, dazu gehören unter anderem
	// Spritesheets, Sounds, Speicherstände 
	
	// Example: Logo //
	public static Texture logoTexture;
	public static TextureRegion logo;
	
	// Files will be loaded from Android/Assets //
	public static void load() {
		// Load Logo //
		logoTexture = new Texture(Gdx.files.internal("data/logo.png"));
		logoTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		logo = new TextureRegion(logoTexture, 0, 0, 512, 114);
	}
	
	public static void dispose() {
		// Dispose every Texture //
		logoTexture.dispose();
	}
	
}
