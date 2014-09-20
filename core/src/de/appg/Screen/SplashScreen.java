package de.appg.Screen;

import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.TweenEquations;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.appg.Manager.AssetLoader;
import de.appg.TweenAccessor.SpriteAccessor;
import de.appg.ZInvGame.ZInvGame;

public class SplashScreen implements Screen {

	// SplashScreen blendet das Logo ein, dafür wird
	// der TweenManager genutzt.
	
	// TweenManager //
	private TweenManager tweenManager;
	private SpriteBatch spriteBatcher;
	private Sprite sprite = new Sprite(AssetLoader.logo);
	
	// Game //
	private ZInvGame zInvGame;
	
	public SplashScreen(ZInvGame zInvGame) {
		// Constructor //
		this.zInvGame = zInvGame;
	}

	@Override
	public void render(float delta) {		
		tweenManager.update(delta);
		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
		
		spriteBatcher.begin();
		sprite.draw(spriteBatcher);
		spriteBatcher.end();
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void show() {
		sprite.setColor(1, 1, 1, 0);
		
		// Resize logo compared to width and height of screen //
		float width = Gdx.graphics.getWidth();
		float height = Gdx.graphics.getWidth();
		float desiredWidth = width * 0.7f;
		float scale = desiredWidth / sprite.getWidth();
		
		sprite.setSize(sprite.getWidth() * scale, sprite.getHeight() * scale);
		sprite.setPosition((width / 2) - (sprite.getWidth() / 2), (height / 2) - (sprite.getHeight() / 2));
		
		setupTween();
		
		spriteBatcher = new SpriteBatch();
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
	
	private void setupTween() {		
		Tween.registerAccessor(Sprite.class, new SpriteAccessor());
		tweenManager = new TweenManager();
		
		TweenCallback callback = new TweenCallback() {
			@Override
			public void onEvent(int type, BaseTween<?> source) {
				// TODO: GAMESCREEN
				// ZInvGame.setScreen(new GameScreen(zInvGame));
			}
		};
		
		Tween.to(sprite, SpriteAccessor.ALPHA, 1.6f).target(1)
		.ease(TweenEquations.easeInOutQuad).repeatYoyo(1, .4f)
		.setCallback(callback).setCallbackTriggers(TweenCallback.COMPLETE)
		.start(tweenManager);		
	}
}
