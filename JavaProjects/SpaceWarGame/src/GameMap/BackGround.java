package GameMap;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import GameMain.GameFrame;

public class BackGround {
	private BufferedImage image ;
	private double x;
	private double y;
	private double dx;
	private double dy;
	private double  moveScale;
	public BackGround(String s , double ms){
		try{
			image = ImageIO.read(getClass().getResourceAsStream(s));
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	public void setPosition(double x , double y){
		this.x = (x*moveScale)% GameFrame.WIDTH  ;
		this.y = (y*moveScale)% GameFrame.HEIGHT  ;
	}
	public void setVector(double dx , double dy){
		this.dx = dx ;
		this.dy = dy ;
	}
	public void update(){
		x += dx;
		y += dy;
	}
	public void draw(Graphics2D g){
		g.drawImage(image,(int)x,(int)y,null);
		if(x<0){
			g.drawImage(image,(int)x+ GameFrame.WIDTH,(int)y,null);
		}
		if(x>0){
			g.drawImage(image,(int)x - GameFrame.WIDTH,(int)y,null);
		}
		
	}
	
	

}
