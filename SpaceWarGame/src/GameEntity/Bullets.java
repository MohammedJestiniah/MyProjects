package GameEntity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Bullets {
	private double x;
	private double y;
	private BufferedImage Bullet;
	private double UVX;
	private double UVY;
	private double Vel;
	
	
	
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

	public Bullets(String s , double x, double y,double hype,double Mx ,double My,double Vel){
		this.x = x;
		this.y = y;
		this.Vel = Vel;
		UVX = (Mx-x)/hype ;
		UVY = (My-y)/hype ;
		try{
			Bullet = ImageIO.read(getClass().getResourceAsStream(s));
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
		
	public void update(){
		y += UVY*Vel;
		x += UVX*Vel;
		
	}
	public void draw(Graphics2D g){
		
			g.drawImage(Bullet, (int)x ,(int)y , null);
	}
}
