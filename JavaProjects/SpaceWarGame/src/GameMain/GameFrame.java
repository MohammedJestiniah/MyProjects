package GameMain;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.*;

import GameState.GameStateManager;


public class GameFrame extends JFrame implements Runnable , KeyListener , MouseListener ,MouseMotionListener  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 640;
	public static final int HEIGHT = 470;
	public static final int SCALE = 2;
	
	
	private Thread thread;
	private boolean running;
	private int FPS = 60;
	private long targetTime =1000/FPS;
	
	
	private BufferedImage image ; 
	private Graphics2D g ; 
	
	
	private GameStateManager GSM;
	
	public GameFrame(String s){
		super("Space Wars");
		setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		setFocusable(true);
		setLocation(250,50);
		requestFocus();	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
		
	}
	public void addNotify(){
		super.addNotify();
		if(thread == null){
			thread = new Thread(this);
			addKeyListener(this);
			addMouseListener(this);
			addMouseMotionListener(this);
			thread.start();
			
		}
	}
    private void init() {
		image = new BufferedImage(WIDTH*2 , HEIGHT*2 , BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) image.getGraphics() ;
		running = true ; 
		
		GSM = new GameStateManager();
		
	}
    public void run(){
	    init();
	    
	    long elapsed;
	    long start  ;
	    long wait;
	    
	  
	    while(running){
	    	update();
	    	draw();
	    	drawToScreen();
	    	start = System.nanoTime();
	    	elapsed = System.nanoTime() - start;
	    	wait = targetTime - elapsed / 1000000;
	    	try{
	    		Thread.sleep(wait);
	    		
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
	    	
	    	
	    }
   }
    
    private void update(){
    	GSM.update();
    }
    private void draw(){
    	GSM.draw(g);
    }
    private void drawToScreen(){
    	Graphics g2 = getGraphics();
    	g2.drawImage(image , 0 , 0 , WIDTH*SCALE ,HEIGHT *SCALE ,null);
    	g2.dispose();
    }
    
	public void keyTyped(KeyEvent key){
		
	}
    public void keyPressed(KeyEvent key){
    	GSM.keyPressed(key.getKeyCode());
    }

    public void keyReleased(KeyEvent key){
    	GSM.keyReleased(key.getKeyCode());
    }
    public void mouseClicked(MouseEvent key){
    	GSM.mouseClicked(key);
    }
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		if(GSM!=null)
		GSM.mouseMoved(e);
		
	}
    
    


}


