package GameEntity;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.image.BufferedImage;

import java.util.LinkedList;

import javax.imageio.ImageIO;



public class Enemy_1 {
	private double x = Math.random() * 1280 + 1 ;
	private double y = Math.random() * 960 + 1;
	
	
	
	private double vx = 0 ;
	private double vy = 0 ;
	
	private double DirX =0;
	private double DirY = 0 ;
	
	private BufferedImage Enemy1;
	Bullets TeBullet ;
	
	private LinkedList<Bullets> bullet = new LinkedList<Bullets>();
	

	
	
	
	

	public LinkedList<Bullets> getBullet() {
		return bullet;
	}
	
	public Enemy_1(String s , double x , double y){
		this.x = x;
		this.y = y;
		try{
			Enemy1 = ImageIO.read(getClass().getResourceAsStream(s));
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	public void update(){
		x+=vx ;
		y+=vy ;
		
		if(x<= 0)
			x = 0;
		if(x >= 1280-32)
			x = 1280-32;
		if(y < 15)
			y = 15;
		if(y > 960 -32)
			y = 960 -32;
		
		for(int i =0 ; i < bullet.size(); i++ ){
			TeBullet = bullet.get(i);
			
			TeBullet.update();
		}
		}
	public void draw(Graphics g){
		
		
		
    	g.drawImage(Enemy1 , (int)x ,(int)y , null);
    	
    	for(int i = 0;i< bullet.size(); i+=100){
    		
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
	
	
	}


