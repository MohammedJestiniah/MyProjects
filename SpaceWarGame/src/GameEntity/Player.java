package GameEntity;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import javax.imageio.ImageIO;



public class Player {
	
	private double x = 0 ;
	private double y = 0 ;
	
	
	private double vx = 0 ;
	private double vy = 0 ;
	
	private double DirX =0;
	private double DirY = 0 ;
	
	public int playerHealth = 1 ;
	
	private BufferedImage player;
	Bullets TeBullet ;
	
	private LinkedList<Bullets> bullet = new LinkedList<Bullets>();
	

	
	
	
	

	public Player(String s , double x , double y){
		this.x = x;
		this.y = y;
		try{
			player = ImageIO.read(getClass().getResourceAsStream(s));
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	public void update(){
		x+=vx ;
		y+=vy ;
		
		if(x<= 0)
			x = 0;
		if(x >= 1280-64)
			x = 1280-64;
		if(y < 20)
			y = 20;
		if(y > 960 -64)
			y = 960 -64;
		
		for(int i =0 ; i < bullet.size(); i++ ){
			TeBullet = bullet.get(i);
			
			TeBullet.update();
		}
		}
	public void draw(Graphics g){
		 AffineTransform at = ((Graphics2D) g).getTransform();
		at.setToIdentity();
		
		at.rotate(DirX,DirY,x + player.getWidth()/2 , y + player.getHeight()/2 );
		at.rotate(Math.PI/2,x+player.getWidth()/2,y+player.getHeight()/2);
		at.translate(x,y);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(player, at, null);
		
		
		
		
		
    	//g.drawImage(player , (int)x ,(int)y , null);
    	
    	for(int i = 0;i< bullet.size(); i++){
    		TeBullet = bullet.get(i);
    		TeBullet.draw((Graphics2D) g);
    	}
	}
    public void addBullet(Bullets block){
    	bullet.add(block);
    }
    public void removeBullet(Bullets block){
    	bullet.remove(block);
    }
    
    
    	
    
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getVx() {
		return vx;
	}
	public void setVx(double vx) {
		this.vx = vx;
	}
	public double getVy() {
		return vy;
	}
	public void setVy(double vy) {
		this.vy = vy;
	}
	public double getDirX() {
		return DirX;
	}
	public void setDirX(double dirX) {
		DirX = dirX;
	}
	public double getDirY() {
		return DirY;
	}
	public void setDirY(double dirY) {
		DirY = dirY;
	}
	public LinkedList<Bullets> getBullet() {
		return bullet;
	}
	public void LinkedList(LinkedList<Bullets> bullet) {
		this.bullet = bullet;
	}
	
	
	}
