package GameWorld;

import de.appg.ZInvGame.ZInvGame;

public class GameWorld {

	private ZInvGame zInvGame;
	
	private GameRenderer gameRenderer;
	private GameState currentState;
	
	public enum GameState {
		MENU, HELP, RUNNING, PAUSE, SCORE
	}
	
	public GameWorld(ZInvGame zInvGame) {
		this.zInvGame = zInvGame;
		
		// Menu //
		currentState = GameState.MENU;
	}
	
	// Update the Gameworld //
	public void update(float delta) {
		switch(currentState){
			case MENU:
				updateMenu(delta);
				break;
			case HELP:
				// TODO: HELP
				break;
			case RUNNING:
				updateRunning(delta);
				break;
			case PAUSE:
				// TODO: PAUSE
				break;
			case SCORE:
				// TODO: HIGHSCORE
				break;
			default:
				break;
		}
	}
	
	private void updateMenu(float delta) {
		
	}
	
	private void updateRunning(float delta) {
		if (delta > .15f) {
			delta = .15f;
		}
		
		// TODO: Update Game
	}

/////////////////////////////
///// SETTER AND GETTER /////
/////////////////////////////
	public void setRenderer(GameRenderer gameRenderer) {
		this.gameRenderer = gameRenderer;
	}
}
