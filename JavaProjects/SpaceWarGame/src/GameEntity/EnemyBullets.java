package GameEntity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class EnemyBullets{
	
	
		private double x;
		private double y;
		private BufferedImage EBullet;
		private double UFX;
		private double UFY;
		
		
		
		public EnemyBullets(String s , double x, double y,double hype,double Mx ,double My){
			this.x = x;
			this.y = y;
			UFX = (Mx-x)/hype ;
			UFY = (My-y)/hype ;
			try{
				EBullet = ImageIO.read(getClass().getResourceAsStream(s));
			}catch(Exception e){
				e.printStackTrace();
				
			}
		}
			
		public void update(){
			y += UFY*8;
			x += UFX*8;
			
		}
		public void draw(Graphics2D g){
			
				g.drawImage(EBullet, (int)x ,(int)y , null);
		}
	}

