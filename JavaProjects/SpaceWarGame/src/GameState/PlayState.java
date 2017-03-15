package GameState;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


import GameEntity.Bullets;
import GameEntity.Enemy_1;
import GameEntity.Enemy_2;
import GameEntity.Player;
import GameMain.GameFrame;
import GameMap.BackGround;

	public class PlayState extends GameState {
	
		private BackGround BackG;
		private Player PL ;
		private Enemy_1 En1;
		private Enemy_1 En2;
		private Enemy_1 En3;
		private Enemy_2 En4;
		private Enemy_2 En5;
		private Enemy_2 En6;
		private double Px ; 
		private double Py ; 
	   
		ArrayList<Enemy_1> Enemy1List = new ArrayList<Enemy_1>();
		ArrayList<Enemy_2> Enemy2List = new ArrayList<Enemy_2>();
		
	
	
	public PlayState(GameStateManager GSM ){
		this.GSM = GSM ;
		En1 = new Enemy_1("/Enemy2.png",Math.random() * 1240+1,Math.random() * 920+1 ) ;
		En2 = new Enemy_1("/Enemy2.png",Math.random() * 1240+1,Math.random() * 920+1 ) ;
		En3 = new Enemy_1("/Enemy2.png",Math.random() * 1240+1,Math.random() * 920+1 ) ;
		En4 = new Enemy_2("/Enemy1.png",Math.random() * 1240+1,Math.random() * 920+1 ) ;
		En5 = new Enemy_2("/Enemy1.png",Math.random() * 1240+1,Math.random() * 920+1 ) ;
		En6 = new Enemy_2("/Enemy1.png",Math.random() * 1240+1,Math.random() * 920+1 ) ;
		
		Enemy1List.add(En1);
		Enemy1List.add(En2);
		Enemy1List.add(En3);
		Enemy2List.add(En4);
		Enemy2List.add(En5);
		Enemy2List.add(En6);
		
		init();
		}	
		@Override
		public void init() {
		try{
			BackG = new BackGround("/Space.jpg",1);
			PL = new Player("/Player.png",1280/2,960/2);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		}

		
		@Override
		public void update() {
			BackG.update();
			PL.update();
		
		
			for(int i = 0; i<Enemy1List.size();i++){
				Enemy_1 enemy1 = Enemy1List.get(i);
				enemy1.update();
				double hypo = Math.sqrt((PL.getX()-enemy1.getX())*(PL.getX()-enemy1.getX())+(PL.getY()-enemy1.getY())*(PL.getY()-enemy1.getY()));
				Enemy1List.get(i).addBullet(new Bullets("/EnemyBullet.png",enemy1.getX()+30,enemy1.getY(),hypo,PL.getX(),PL.getY(), 5));
			
			
			
					if(Math.abs(PL.getX() - Enemy1List.get(i).getX())< 50 && Math.abs(PL.getY() - Enemy1List.get(i).getY())<50){
						Enemy1List.remove(enemy1);
						PL.playerHealth--;
				
		}
			
			for(int j = 0 ; j<PL.getBullet().size();j++){
				Bullets bullet = PL.getBullet().get(j);
				double hypo2 = Math.sqrt((enemy1.getX()-bullet.getX())*(enemy1.getX()-bullet.getX())+(enemy1.getY()-bullet.getY())*(enemy1.getY()-bullet.getY()));
					if(hypo2 <= 50){
						PL.getBullet().remove(bullet);
						Enemy1List.remove(enemy1);
					
		}
				
			
		}/*this method for enemy bullet that hit the player 
			for(int m = 0 ; m < Enemy1List.get(i).getBullet().size();m++){
				
				Bullets b = enemy1.getBullet().get(m);
				//double hypo4 = Math.sqrt((b.getX()-PL.getX())*(b.getX()-PL.getX())+(b.getY()-PL.getY())*(b.getY()-PL.getY()));
				if(Math.abs(b.getX() - PL.getX()) < 5 && Math.abs(b.getY() - PL.getY())<5){
					enemy1.getBullet().remove(m);
					PL.playerHealth--;
					System.out.println("blaaah "+PL.playerHealth);
					
				}
				}*/
				
			
		}
		
		
		
		
			for(int i = 0 ;i< Enemy2List.size() ;i++ ){
			
				Enemy2List.get(i).update();
				Enemy2List.get(i).setLy(PL.getY()-Enemy2List.get(i).getY());
				Enemy2List.get(i).setLx(PL.getX()-Enemy2List.get(i).getX());
				
			
				if(Math.abs(PL.getX() - Enemy2List.get(i).getX())< 50 && Math.abs(PL.getY() - Enemy2List.get(i).getY())<50){
					Enemy2List.remove(Enemy2List.get(i));
					PL.playerHealth--;
				
				}
			for(int j = 0 ; j<PL.getBullet().size();j++){
				Bullets bullet2 = PL.getBullet().get(j);
				double hypo2 = Math.sqrt((Enemy2List.get(i).getX()-bullet2.getX())*(Enemy2List.get(i).getX()-bullet2.getX())+(Enemy2List.get(i).getY()-bullet2.getY())*(Enemy2List.get(i).getY()-bullet2.getY()));
				if(hypo2 <= 50){
					PL.getBullet().remove(bullet2);
					Enemy2List.remove(Enemy2List.get(i));
					 
					
			}
			
			
			}
		}	
			if(PL.playerHealth==0){
			GSM.setState(GameStateManager.LOSESTATE);
		}	
			if(Enemy1List.isEmpty() == true && Enemy2List.isEmpty() == true)
			GSM.setState(GameStateManager.WINSTATE);
		
		
		}


	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, GameFrame.WIDTH, GameFrame.HEIGHT);
		
		BackG.draw(g);
		PL.draw(g);
			for(int i = 0 ;i< Enemy2List.size() ;i++ ){
				Enemy2List.get(i).draw(g);
			}
			for(int i = 0 ;i< Enemy1List.size() ;i++ ){
				Enemy1List.get(i).draw(g);
		
			}
		
		
		
	}

	@Override
	public void keyPressed(int KP) {
		if(KP == KeyEvent.VK_W){
			PL.setVy(-15);
			for(int i =0;i<Enemy2List.size();i++)
				Enemy2List.get(i).Follow(PL.getX(), PL.getY(), 2);
			
		} else if(KP == KeyEvent.VK_D){
			PL.setVx(15);
			for(int i =0;i<Enemy2List.size();i++)
				Enemy2List.get(i).Follow(PL.getX(), PL.getY(), 2);
		
		} else if(KP == KeyEvent.VK_A){
			PL.setVx(-15);
			for(int i =0;i<Enemy2List.size();i++)
				Enemy2List.get(i).Follow(PL.getX(), PL.getY(), 2);
			
		} else if(KP == KeyEvent.VK_S){
			PL.setVy(15);
			for(int i =0;i<Enemy2List.size();i++)
				Enemy2List.get(i).Follow(PL.getX(), PL.getY(), 2);
		
				
		}
		
	}

	@Override
	public void keyReleased(int KR) {
		if(KR == KeyEvent.VK_W){
			PL.setVy(0);
		} else if(KR == KeyEvent.VK_D){
			PL.setVx(0);
		} else if(KR == KeyEvent.VK_A){
			PL.setVx(0);
		} else if(KR == KeyEvent.VK_S){
			PL.setVy(0);
		}
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		double Mx = e.getX();
		double My = e.getY();
		double hype = Math.sqrt((PL.getX()-Mx)*(PL.getX()-Mx) +(PL.getY()-My)*(PL.getY()-My));
		PL.addBullet(new Bullets("/Bullet.png",PL.getX()+30,PL.getY()+30,hype,Mx,My,20));
		for(int i =0;i<Enemy2List.size();i++)
			Enemy2List.get(i).Follow(PL.getX(), PL.getY(), 2);
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		Px = e.getX();
		Py = e.getY();
		PL.setDirX(Px-PL.getX());
		PL.setDirY(Py-PL.getY());
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
