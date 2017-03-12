package GameState;



	import java.awt.Color;
	import java.awt.Font;
	import java.awt.Graphics2D;
	import java.awt.event.KeyEvent;
	import java.awt.event.MouseEvent;

	import GameMap.BackGround;

	public class WinState extends GameState {
		
		private BackGround BackG ; 
		private int CurrentChoice = 0 ;
		private String[] options = {"Quit"};
		private Color titleColor;
		private Font titleFont;
		private Font font;
		
		
		public WinState(GameStateManager GSM){
			this.GSM= GSM;
			try{
				BackG = new BackGround("/win.jpg",1);
				
				titleColor = new Color(120 ,0,0);
				titleFont = new Font("Century Gothic",Font.PLAIN,100);
				font = new Font("Arial",Font.PLAIN,50);
				
			}catch(Exception e ){
				e.printStackTrace();
			}
		}

		@Override
		public void init() {
			// TODO Auto-generated method stub

		}

		@Override
		public void update() {
			BackG.update();

		}

		@Override
		public void draw(Graphics2D g) {
			BackG.draw(g);
			
			g.setColor(titleColor);
			g.setFont(titleFont);
			g.drawString("You Win", 450 , 300);
	        
			g.setFont(font);
			for(int i = 0 ; i < options.length ; i++){
				if(i == CurrentChoice){
					g.setColor(Color.WHITE);
				}else{
					g.setColor(Color.RED);
				}
				g.drawString(options[i], 1180/2 , 400 + i * 100);
			}
		}
	     public void select(){
	        if(CurrentChoice == 0 ){
	        	System.exit(0);
	    		 
	    	 }
	     }
		@Override
		public void keyPressed(int k) {
			if(k==KeyEvent.VK_ENTER){
				select();
			}
			if(k==KeyEvent.VK_UP){
				CurrentChoice--;
				if(CurrentChoice == -1){
					CurrentChoice = options.length -1 ; 
				}
			}
			if(k==KeyEvent.VK_DOWN){
				CurrentChoice++;
				if(CurrentChoice == options.length){
					CurrentChoice=0;
				}
			}
		}

		@Override
		public void keyReleased(int k) {
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
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
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

	}

	