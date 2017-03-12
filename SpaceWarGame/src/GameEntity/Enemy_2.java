package GameEntity;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;




import javax.imageio.ImageIO;



public class Enemy_2 {
	private double x = Math.random() * 620 + 1 ;
	private double y = Math.random() * 420 + 1;
	private	double speed;
	
	private double Lx  ;
	private double Ly  ;
	
	private double vx = 0 ;
	private double vy = 0 ;
	
	private double UVX =0;
	private double UVY = 0 ;
	
	
	private BufferedImage Enemy2;
	

	
	
	
	

	public Enemy_2(String s , double x , double y){
		this.x = x;
		this.y = y;
		try{
			Enemy2 = ImageIO.read(getClass().getResourceAsStream(s));
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	public void update(){
		
		x+=UVX*speed ;
		y+=UVY*speed ;
		if(x<= 0)
			x = 0;
		if(x >= 1280-32)
			x = 1280-32;
		if(y < 15)
			y = 15;
		if(y > 960 -32)
			y = 960 -32;
		
		}
	public void draw(Graphics g){
		 AffineTransform at = ((Graphics2D) g).getTransform();
		 at.setToIdentity();
			
		 at.rotate(Lx,Ly,x + Enemy2.getWidth()/2 , y + Enemy2.getHeight()/2 );
		 at.rotate(Math.PI/2,x+64/2,y+64/2);
		 at.translate(x,y);
		 Graphics2D g2d = (Graphics2D) g;
		 g2d.drawImage(Enemy2, at, null);
    	
    	
    	}
	
    public void Follow(double Px , double Py,double speed){
    	this.speed =speed;
    	double hype =  Math.sqrt((Px-x)*(Px-x) +(Py-y)*(Py-y));
    	UVX = (Px-x)/hype ;
		UVY = (Py-y)/hype ;
		
    }
    
    	
    
	public double getLx() {
		return Lx;
	}
	public void setLx(double lx) {
		Lx = lx;
	}
	public double getLy() {
		return Ly;
	}
	public void setLy(double ly) {
		Ly = ly;
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
	
	
	}


