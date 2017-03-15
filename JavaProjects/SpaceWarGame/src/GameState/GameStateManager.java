package GameState;

import java.awt.event.*;
import java.util.ArrayList;

public class GameStateManager {
	
    private ArrayList<GameState> GameStates;
    private int currentState;
    public static final int MENUSTATE = 0 ;
    public static final int PLAYSTATE = 1 ;
    public static final int WINSTATE = 2 ;
    public static final int LOSESTATE = 3 ;
    public static final int HELPSTATE = 4 ;
    
    public GameStateManager(){
    	GameStates = new ArrayList<GameState>();
    	currentState = MENUSTATE ;
    	GameStates.add(new MenuState(this));
    	GameStates.add(new PlayState(this));
    	GameStates.add(new WinState(this));
    	GameStates.add(new loseState(this));
    	GameStates.add(new HelpState(this));
    	
    	
    }
    public void setState(int state){
    	currentState = state;
    	GameStates.get(currentState).init();	
    }
    public void update(){
    	GameStates.get(currentState).update();
    }
    public void draw(java.awt.Graphics2D g){
    	GameStates.get(currentState).draw(g);
	
    }
    public void keyPressed(int k){
    	GameStates.get(currentState).keyPressed(k);
    }
    public void keyReleased(int k){
    	GameStates.get(currentState).keyReleased(k);
    }
    
	public void mouseClicked(MouseEvent key) {
		GameStates.get(currentState).mouseClicked(key);
		
	}
	
	public void mouseMoved(MouseEvent e) {
		GameStates.get(currentState).mouseMoved(e);
		
	}
    
}
