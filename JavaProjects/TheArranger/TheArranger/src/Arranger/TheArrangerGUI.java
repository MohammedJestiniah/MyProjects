package Arranger;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import javax.swing.JInternalFrame;

import org.apache.commons.io.IOUtils;

import java.awt.Panel;
import java.awt.CardLayout;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class TheArrangerGUI implements ActionListener,ChangeListener{
	private boolean ChangeListenerON = false;
	JFrame frmThearranger;

	/**
	 * Launch the application.
	 */
	
	int count = 1;
	private JTextField titleField;
	private JTextField catagoryField;
	private List list_1 = new List();
	private JLabel pathBox;
	private JButton btnSave;
	private JTextArea NoteTextArea;
	private JTextField txtEnterSearchWord;
	private List CatList = new List();
	private JButton btnNewButton;
	private ButtonGroup bg;
	private JRadioButton rdbtnByRefrence;
	private JRadioButton rdbtnByWord;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTabbedPane tabbedPane;
	private JTabbedPane sourceTabbedPane;
	private JInternalFrame internalFrame;
	private Panel panel_4;
	final ImageIcon imageIcon = new ImageIcon("tan-index-card-hi.png");
	ImageIcon image = new ImageIcon("sss.png");
	private  int txtSize;
	FileOutputStream fileOutputStrem;
	PrintWriter printWriter;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	
	

	/**
	 * Create the application.
	 */
	public TheArrangerGUI() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		frmThearranger = new JFrame();
		frmThearranger.setForeground(Color.WHITE);
		frmThearranger.setBackground(Color.BLACK);
		frmThearranger.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmThearranger.setFont(new Font("Axure Handwriting", Font.BOLD, 14));
		frmThearranger.setTitle("TheArranger");
		frmThearranger.setBounds(100, 100, 957, 570);
		frmThearranger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon("Cinema-Avengers-icon.PNG");
		frmThearranger.setIconImage(img.getImage());
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(0, 0, 102));
		tabbedPane.setBackground(UIManager.getColor("ToolBar.dockingForeground"));
		frmThearranger.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		//...............................
		
	
		
		
		//........................................................................................<<<panel_1
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("menu"));
		tabbedPane.addTab("Directory", null, panel, null);
		
//--------------------------------------------------------------------------------------------------------
    	
		
		
//---------------------------------------------------------------------------------------------
		
		
		panel.setBounds(146, 225, 691, 79);
		panel.setLayout(null);
		pathBox = new JLabel("Your Papers Path");
		pathBox.setForeground(new Color(0, 0, 102));
		pathBox.setHorizontalAlignment(SwingConstants.CENTER);
		pathBox.setBounds(195, 252, 448, 28);
		Border border3 = BorderFactory.createLineBorder(Color.BLACK, 1);
		
		pathBox.setBorder(border3);
			
					panel.add(pathBox);
					JButton btnNewButton_1 = new JButton("Browse");
					btnNewButton_1.setBackground(SystemColor.menu);
					btnNewButton_1.setForeground(new Color(0, 0, 102));
					btnNewButton_1.setBounds(642, 252, 89, 28);
					panel.add(btnNewButton_1);
					
					JLabel lblNewLabel_4 = new JLabel("", image, JLabel.CENTER);
					lblNewLabel_4.setBounds(105, 22, 713, 219);
					panel.add(lblNewLabel_4);
		//.........................................................................................
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		tabbedPane.addTab("Writing", null, panel_1, null);
		panel_1.setLayout(null);
		//..........
		NoteTextArea = new JTextArea() {
		      Image image = imageIcon.getImage();

		      
		      {
		        setOpaque(false);
		      }

		      public void paint(Graphics g) {
		        g.drawImage(image, 0, 0, this);
		        super.paint(g);
		      }
		    };
		NoteTextArea.setFont(new Font("Segoe Script", Font.PLAIN, 26));
		
		NoteTextArea.setBounds(233, 114, 519, 245);
		panel_1.add(NoteTextArea);
		list_1.setBackground(SystemColor.inactiveCaptionBorder);
		
		list_1.setBounds(0, 0, 200, 483);
		panel_1.add(list_1);
		//.........
		catagoryField = new JTextField();
    		catagoryField.setBackground(SystemColor.inactiveCaptionBorder);
    		catagoryField.setBounds(559, 89, 116, 22);
    		panel_1.add(catagoryField);
    		catagoryField.setColumns(10);
	    //...............
		JLabel lblNewLabel = new JLabel("Title");
		lblNewLabel.setForeground(new Color(0, 0, 153));
		lblNewLabel.setBounds(256, 89, 66, 16);
		panel_1.add(lblNewLabel);
		//..........
		JLabel lblCatagory = new JLabel("Catagory");
		lblCatagory.setForeground(new Color(0, 0, 153));
		lblCatagory.setBounds(492, 89, 56, 16);
		panel_1.add(lblCatagory);
		//.........
		
		btnSave = new JButton("save");
		btnSave.setBounds(808, 455, 97, 25);
		panel_1.add(btnSave);
		btnSave.addActionListener(this);
		//.....
		titleField = new JTextField();
		titleField.setForeground(Color.DARK_GRAY);
		titleField.setBackground(SystemColor.info);
		titleField.setBounds(292, 89, 180, 22);
		panel_1.add(titleField);
		titleField.setColumns(10);
		titleField.setEnabled(false);
		
		lblNewLabel_2 = new JLabel("Enter a Catagory!");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(573, 71, 150, 16);

		
		lblNewLabel_3 = new JLabel("Enter An Index Card!");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(429, 359, 161, 22);
		
		//.....<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<end panel_1
		
		if(!ChangeListenerON){
			tabbedPane.addChangeListener(this);
			ChangeListenerON=true;
		}
		//.............................................................................................................
		panel_2 = new JPanel();
		tabbedPane.addTab("Reading", null, panel_2, null);
		panel_2.setLayout(null);
		txtEnterSearchWord = new JTextField();
		txtEnterSearchWord.setBackground(SystemColor.info);
    	txtEnterSearchWord.setText("      ");
    	txtEnterSearchWord.setBounds(680, 0, 156, 22);
    	panel_2.add(txtEnterSearchWord);
    	txtEnterSearchWord.setColumns(10);
    	CatList.setBackground(SystemColor.inactiveCaptionBorder);
    	CatList.setBounds(0, 0, 200, 483);
    	panel_2.add(CatList);
		
		panel_4 = new Panel();
		panel_4.setBackground(SystemColor.activeCaptionBorder);
		panel_4.setBounds(202, 53, 732, 430);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		
		
		panel_3 = new JPanel();
		tabbedPane.addTab("Relation Diagram", null, panel_3, null);
		
//---------------------------------------------------------------------------------------------

    	btnNewButton = new JButton("Search");
    	btnNewButton.setBackground(SystemColor.menu);
    	btnNewButton.setForeground(new Color(0, 0, 153));
    	btnNewButton.setBounds(837, 0, 97, 22);
    	panel_2.add(btnNewButton);

    	bg = new ButtonGroup();

    	rdbtnByRefrence = new JRadioButton("By Reference");
    	rdbtnByRefrence.setForeground(new Color(51, 102, 153));
    	rdbtnByRefrence.setBounds(778, 22, 103, 25);
    	panel_2.add(rdbtnByRefrence);
    	bg.add(rdbtnByRefrence);

    	rdbtnByWord = new JRadioButton("By Word");
    	rdbtnByWord.setBackground(SystemColor.menu);
    	rdbtnByWord.setForeground(new Color(51, 102, 153));
    	rdbtnByWord.setBounds(680, 22, 83, 25);
    	panel_2.add(rdbtnByWord);
    	bg.add(rdbtnByWord);
    	
    	rdbtnByRefrence.setSelected(true);
    	
    	btnNewButton.addActionListener(this);
    	rdbtnByRefrence.addActionListener(this);
    	rdbtnByWord.addActionListener(this);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		
		JLabel lblNewLabel_1 = new JLabel("Your PDF Files are renamed ... Please go to the Writing Mode");
		lblNewLabel_1.setBounds(285, 288, 350, 42);
		
		File file = new File("pdfSource.txt");
		FileInputStream fis = null;

		//......................................................................................... check the pdfSource which contain the saved directory if it size 0 or more	   
			try {
				fis = new FileInputStream(file);
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}

			try {
				System.out.println("Total file size to read (in bytes) : "
						+ fis.available());
				txtSize = fis.available();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			 
		
		if(txtSize == 0){
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
			
				
				final JFileChooser fileChooser =  new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int response = fileChooser.showOpenDialog(btnNewButton_1);
				if(response == JFileChooser.APPROVE_OPTION){
					try {
						Main.paperManager(pathBox, fileChooser);
						panel.add(lblNewLabel_1);
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}				
					}else{
						pathBox.setText("Canceled");		
				}

			}
		});
		}else{
			try {
				Main.paperManager( );
				panel.add(lblNewLabel_1);
				pathBox.setText(Main.theString);
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0){
					
						
						final JFileChooser fileChooser =  new JFileChooser();
						fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
						int response = fileChooser.showOpenDialog(btnNewButton_1);
						if(response == JFileChooser.APPROVE_OPTION){
							try {
								
								Main.paperManager(pathBox, fileChooser);
								
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}				
							}else{
								pathBox.setText("Canceled");		
						}

					}
				});
			
			} catch (IOException x) {
				// TODO Auto-generated catch block
				x.printStackTrace();
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnSave){
			panel_1.remove(lblNewLabel_2);
			panel_1.updateUI();
			panel_1.remove(lblNewLabel_3);
        	panel_1.updateUI();
			if(NoteTextArea.getText().isEmpty()||catagoryField.getText().isEmpty()|NoteTextArea.getText().isEmpty()&&catagoryField.getText().isEmpty()){
				if(NoteTextArea.getText().isEmpty() ){
					panel_1.add(lblNewLabel_3);
					
				}
				
			if(catagoryField.getText().isEmpty() ){
            	panel_1.add(lblNewLabel_2);
            	
			}	
			
		
			}else{	
						String StringNote = NoteTextArea.getText();
						String noteTitle = titleField.getText();
						String noteCatagory = catagoryField.getText();
						NoteTextArea.setText("");
						catagoryField.setText("");
						Main.addNotes(noteCatagory, noteTitle, StringNote);

			}
		}
			
			
		
			
	
		
		
		if(e.getSource() == btnNewButton){
			String dummySearch = txtEnterSearchWord.getText();
			if(rdbtnByRefrence.isSelected()){
				
				panel_4.removeAll();
				panel_2.remove(panel_4);
				panel_2.add(panel_4);
				
				for (int x=0 ; x<Main.IndexCards.size();x++){
					if(Main.IndexCards.get(x).getNoteTitle().contains(dummySearch)){
						
						String dummyNoteTitle = Main.IndexCards.get(x).getNoteTitle();
		        		String dummyNoteCat = Main.IndexCards.get(x).getCategory();
		        		String dummyStringNote = Main.IndexCards.get(x).getStringNote();
						JTextArea TextArea = new JTextArea(){
			      		      Image image = imageIcon.getImage();
			      		    

			     		     
			     		      {
			     		        setOpaque(false);
			     		      }

			     		      public void paint(Graphics g) {
			     		       g.drawImage(image, 0, 0, this);
			     		      //  g.drawImage(image, 0, 0,700, 700, this);
			     		        super.paint(g);
			     		      }
			     		    };
			     		   
			        		TextArea.setText(dummyStringNote);
			        		TextArea.setFont(new Font("Segoe Script", Font.PLAIN, 26));
			        		TextArea.setEditable(false);
			        		JLabel noteLabel = new JLabel();
			        		noteLabel.setText(dummyNoteTitle);
			        		internalFrame = new JInternalFrame(dummyNoteCat+"-"+dummyNoteTitle);
			        		internalFrame.setBounds((int)(Math.random()*100),(int)(Math.random()*200), 273, 172);
			        		panel_4.add(internalFrame);
			        		internalFrame.setVisible(true);
			        		internalFrame.getContentPane().add(TextArea);
			        		internalFrame.setResizable(true);
			        		internalFrame.setMaximizable(true);
			        		internalFrame.setEnabled(false);
						
						
					}
					
				}
				
				
				
			}else if(rdbtnByWord.isSelected()){
				
				
				panel_4.removeAll();
				panel_2.remove(panel_4);
				panel_2.add(panel_4);
				
				
				
				for (int x=0 ; x<Main.IndexCards.size();x++){
					
					if(Main.IndexCards.get(x).getStringNote().contains(dummySearch)){
						
						String dummyNoteTitle = Main.IndexCards.get(x).getNoteTitle();
		        		String dummyNoteCat = Main.IndexCards.get(x).getCategory();
		        		String dummyStringNote = Main.IndexCards.get(x).getStringNote();
						JTextArea TextArea = new JTextArea(){
			      		      Image image = imageIcon.getImage();
			      		    

			     		     
			     		      {
			     		        setOpaque(false);
			     		      }

			     		      public void paint(Graphics g) {
			     		       g.drawImage(image, 0, 0, this);
			     		      //  g.drawImage(image, 0, 0,700, 700, this);
			     		        super.paint(g);
			     		      }
			     		    };
			     		   
			        		TextArea.setText(dummyStringNote);
			        		TextArea.setFont(new Font("Segoe Script", Font.PLAIN, 26));
			        		TextArea.setEditable(false);
			        		JLabel noteLabel = new JLabel();
			        		noteLabel.setText(dummyNoteTitle);
			        		internalFrame = new JInternalFrame(dummyNoteCat+"-"+dummyNoteTitle);
			        		internalFrame.setBounds((int)(Math.random()*100),(int)(Math.random()*200), 273, 172);
			        		panel_4.add(internalFrame);
			        		internalFrame.setVisible(true);
			        		internalFrame.getContentPane().add(TextArea);
			        		internalFrame.setResizable(true);
			        		internalFrame.setMaximizable(true);
			        		internalFrame.setEnabled(false);
						
						
					}
					
				}
				
				
				
			}
				
			
			
			
		}
		
		
	}

	@Override
	public void stateChanged(ChangeEvent changeEvent) {
		
		
        sourceTabbedPane = (JTabbedPane) changeEvent.getSource();
        int index = sourceTabbedPane.getSelectedIndex();


        
        if(sourceTabbedPane.getTitleAt(index).equalsIgnoreCase("writing")){
        	list_1.clear();
        	try {
    			fileOutputStrem = new FileOutputStream("Index cards.txt");
    		} catch (FileNotFoundException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		} // creating the txt file
    		printWriter = new PrintWriter(fileOutputStrem, true);
    		try{
        		
    			for(int i =0; i<Main.IndexCards.size();i++){
    				printWriter.println("$"+i+"$"+Main.IndexCards.get(i).getNoteTitle()+"%");
        			printWriter.println("*"+i+"*"+Main.IndexCards.get(i).getCategory()+"+");
        			printWriter.println("{"+i+"{"+Main.IndexCards.get(i).getStringNote()+i+"}");
    			}
        		
    			
    			
        		printWriter.close();
        		fileOutputStrem.close();
      		}catch(Exception ie){
      			System.out.println("Exception founded !");
      		}
    		
        	
        	
        	if(!ChangeListenerON){
    			tabbedPane.addChangeListener(this);
    			ChangeListenerON=true;
    		}
    		
    		
    		for(int i =0; i<Main.papers.size();i++){
    				list_1.add(Main.papers.get(i).getTitle(),i);
    				
    		}
    		
    		try{
    		titleField.setText(list_1.getItem(0));
    		}catch(ArrayIndexOutOfBoundsException e){
    			JOptionPane.showMessageDialog(null,"Please Put The PDF Files Path!");
    			sourceTabbedPane.setSelectedIndex(0);
    		}
    		list_1.addItemListener(new ItemListener(){
    			public void itemStateChanged(ItemEvent e){
    				titleField.setText(list_1.getSelectedItem());
    				
    			}
    			
    		});
    		
    		
    		
    		
    		
    		
    		
        }else if(sourceTabbedPane.getTitleAt(index).equalsIgnoreCase("reading")){
        	CatList.clear();
        	panel_4.removeAll();
        	panel_4.validate();
        	
        	
    			try {
					fileOutputStrem = new FileOutputStream("Index cards.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		
    		printWriter = new PrintWriter(fileOutputStrem, true);
    		
        		
    			for(int j =0; j<Main.IndexCards.size();j++){
    				printWriter.println("$"+j+"$"+Main.IndexCards.get(j).getNoteTitle()+"%");
        			printWriter.println("*"+j+"*"+Main.IndexCards.get(j).getCategory()+"+");
        			printWriter.println("{"+j+"{"+Main.IndexCards.get(j).getStringNote()+j+"}");
    			
        		
    			
    			
        		
      		
    			}
    			printWriter.close();
        		try {
					fileOutputStrem.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	
        	for(int i =0; i<Main.IndexCards.size();i++){
        		CatList.add(Main.IndexCards.get(i).getCategory(),i);
        		
        			
        		}
        		
        
        	for(int z = 0; z < CatList.getItemCount();z++){
        		String dummy = CatList.getItem(z);
        		for(int i = z + 1; i < CatList.getItemCount();i++){
        			if(dummy.equals(CatList.getItem(i))){
        				CatList.remove(i);
        				break;
        			}
        		}
        	}
        	
		
		try{
			txtEnterSearchWord.setText(CatList.getItem(0));
			txtEnterSearchWord.setText("");
		}catch(ArrayIndexOutOfBoundsException e){
			
			sourceTabbedPane.setSelectedIndex(1);
			JOptionPane.showMessageDialog(null,"Your library of index cards are empty please write an index cards");
			
		}
		
		
		
		CatList.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				titleField.setText(CatList.getSelectedItem());
				
			}
		});
		
		txtEnterSearchWord.setToolTipText("Enter Search Word or Title");
		


        	
        	
        	for(int x=0 ; x<Main.IndexCards.size();x++){
        		
        		String dummyNoteTitle = Main.IndexCards.get(x).getNoteTitle();
        		String dummyNoteCat = Main.IndexCards.get(x).getCategory();
        		String dummyStringNote = Main.IndexCards.get(x).getStringNote();
        		JTextArea TextArea = new JTextArea(){
      		      Image image = imageIcon.getImage();
      		    

     		     
     		      {
     		        setOpaque(false);
     		      }

     		      public void paint(Graphics g) {
     		       g.drawImage(image, 0, 0, this);
     		      //  g.drawImage(image, 0, 0,700, 700, this);
     		        super.paint(g);
     		      }
     		    };
     		   
        		TextArea.setText(dummyStringNote);
        		TextArea.setFont(new Font("Segoe Script", Font.PLAIN, 26));
        		TextArea.setEditable(false);
        		JLabel noteLabel = new JLabel();
        		noteLabel.setText(dummyNoteTitle);
        		internalFrame = new JInternalFrame(dummyNoteCat+"-"+dummyNoteTitle);
        		internalFrame.setBounds((int)(Math.random()*100),(int)(Math.random()*200), 273, 172);
        		panel_4.add(internalFrame);
        		internalFrame.setVisible(true);
        		internalFrame.getContentPane().add(TextArea);
        		internalFrame.setResizable(true);
        		internalFrame.setMaximizable(true);
        		internalFrame.setEnabled(false);
        		

        	}
        	
        	
        	CatList.addItemListener(new ItemListener(){
    			public void itemStateChanged(ItemEvent e){
    				String dummyNote = CatList.getSelectedItem();
    				
    				panel_4.removeAll();
					panel_2.remove(panel_4);
					panel_2.add(panel_4);
    				
    				for (int x=0 ; x<Main.IndexCards.size();x++){
    					if(dummyNote.equals(Main.IndexCards.get(x).getCategory())){
    						
    						String dummyNoteTitle = Main.IndexCards.get(x).getNoteTitle();
    		        		String dummyNoteCat = Main.IndexCards.get(x).getCategory();
    		        		String dummyStringNote = Main.IndexCards.get(x).getStringNote();
    						JTextArea TextArea = new JTextArea(){
    			      		      Image image = imageIcon.getImage();
    			      		    

    			     		     
    			     		      {
    			     		        setOpaque(false);
    			     		      }

    			     		      public void paint(Graphics g) {
    			     		       g.drawImage(image, 0, 0, this);
    			     		      //  g.drawImage(image, 0, 0,700, 700, this);
    			     		        super.paint(g);
    			     		      }
    			     		    };
    			     		   
    			        		TextArea.setText(dummyStringNote);
    			        		TextArea.setFont(new Font("Segoe Script", Font.PLAIN, 26));
    			        		TextArea.setEditable(false);
    			        		JLabel noteLabel = new JLabel();
    			        		noteLabel.setText(dummyNoteTitle);
    			        		internalFrame = new JInternalFrame(dummyNoteCat+"-"+dummyNoteTitle);
    			        		internalFrame.setBounds((int)(Math.random()*100),(int)(Math.random()*200), 273, 172);
    			        		panel_4.add(internalFrame);
    			        		internalFrame.setVisible(true);
    			        		internalFrame.getContentPane().add(TextArea);
    			        		internalFrame.setResizable(true);
    			        		internalFrame.setMaximizable(true);
    			        		internalFrame.setEnabled(false);
    						
    						
    					}
    					
    				}
    				
    			}
    			
    		});
        	
        	
        
        	
        }else if(sourceTabbedPane.getTitleAt(index).equalsIgnoreCase("relation diagram")){
Main.bubble_srt();
    		
    		
        	
    		mxGraph graph = new mxGraph();
    		Object parent = graph.getDefaultParent();
    		
    		graph.getModel().beginUpdate();
    		
    		try
    		{
    			int w = 1;
    			int h = 80;
    			
    		
    			graph.setEnabled(false);
    			String preYear = "";
    			for(int i=0; i < Main.papers.size(); i++){
    				
    				if(Main.papers.get(i).getPublishDate().equalsIgnoreCase(preYear)){
    					h+=60;
    					Object v2 = graph.insertVertex(parent, null, Main.papers.get(i).getTitle().substring(20, Main.papers.get(i).getTitle().length()) , (150*(w-1))+8 , h, 80, 40);
    				
        				 
    				}else{
    					h = 80;
    					Object v1 = graph.insertVertex(parent, null, Main.papers.get(i).getPublishDate() , 150*w , h, 100, 40);
    					
    					h+=60;
    					
        				Object v2 = graph.insertVertex(parent, null, Main.papers.get(i).getTitle().length() , (150*w)+8, h, 80, 40);
        				
        				
        				w+=1;
        				
        				
        				
    				}
    				preYear = Main.papers.get(i).getPublishDate();
    			}
    		}
    		finally
    		{
    			graph.getModel().endUpdate();
    		}
    		panel_3.setLayout(new BorderLayout(0, 0));

    		mxGraphComponent graphComponent = new mxGraphComponent(graph);
    		panel_3.add(graphComponent);
        	}
        
      }
}

