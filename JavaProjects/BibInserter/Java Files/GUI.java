package BibInserter;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.List;
import java.awt.Choice;

import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GUI extends JFrame  implements DocumentListener , ItemListener , KeyListener {

	//****************************************************************************
	private JPanel MainWindow;
	private JTextField SearchField;
	private List BibList;
	private JLabel lblEnterbibkeytitleauthor;
	private JPanel MainPanel;
	private JLabel BibInfoKey;
	private JLabel BibInfoAuthor;
	private JLabel BibInfoTitle;
	private JLabel BibInfoYear;
	private int MatchedBibCounter = 0;
	//****************************************************************************	
	ArrayList<BibObject> bibItemsArray = new ArrayList<BibObject>();
	Keyboard kb = new Keyboard();


	//****************************************************************************
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 494);
		MainWindow = new JPanel();
		MainWindow.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainWindow);
		MainWindow.setLayout(null);
		bibItemsArray = BibReader.getList();


		SearchField = new JTextField();
		SearchField.setBounds(0, 0, 246, 34);
		MainWindow.add(SearchField);
		SearchField.setColumns(10);
		SearchField.getDocument().addDocumentListener(this);

		JLabel label = new JLabel("<- Enter Your search term here (shortcut : \\)");
		label.setBounds(257, 0, 368, 16);
		MainWindow.add(label);

		lblEnterbibkeytitleauthor = new JLabel("Enter:BibKey 1-Title 2-Author  3- title-author-year");
		lblEnterbibkeytitleauthor.setBounds(267, 18, 311, 16);
		MainWindow.add(lblEnterbibkeytitleauthor);

		MainPanel = new JPanel();
		MainPanel.setBounds(0, 73, 751, 281);
		MainWindow.add(MainPanel);
		MainPanel.setLayout(null);

		JPanel BibInfoPanel = new JPanel();
		BibInfoPanel.setBounds(189, 13, 550, 268);
		MainPanel.add(BibInfoPanel);
		BibInfoPanel.setLayout(null);

		BibList = new List();
		BibList.setBounds(12, 25, 171, 243);
		MainPanel.add(BibList);
		BibList.addItemListener(this);
		BibList.addKeyListener(this);

		BibInfoKey = new JLabel();
		BibInfoKey.setForeground(Color.BLUE);
		BibInfoKey.setBounds(12, 26, 530, 27);
		BibInfoPanel.add(BibInfoKey);

		BibInfoAuthor = new JLabel();
		BibInfoAuthor.setForeground(Color.BLUE);
		BibInfoAuthor.setBounds(12, 54, 530, 27);
		BibInfoPanel.add(BibInfoAuthor);

		BibInfoTitle = new JLabel();
		BibInfoTitle.setForeground(Color.BLUE);
		BibInfoTitle.setBounds(12, 101, 530, 27);
		BibInfoPanel.add(BibInfoTitle);

		BibInfoYear = new JLabel();
		BibInfoYear.setForeground(Color.BLUE);
		BibInfoYear.setBounds(12, 141, 530, 27);
		BibInfoPanel.add(BibInfoYear);



		JPanel DirectoryPanel = new JPanel();
		DirectoryPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		DirectoryPanel.setBounds(0, 422, 775, 25);
		MainWindow.add(DirectoryPanel);
		DirectoryPanel.setLayout(null);

		JLabel DirectoryLabel = new JLabel(BibReader.getPath()+ "  || Bib Entries : " + BibReader.getBibItemCounter());
		DirectoryLabel.setAlignmentX(0.5f);
		DirectoryLabel.setBounds(5, 0, 775, 29);
		DirectoryPanel.add(DirectoryLabel);




	}
	//********************************************************************************
	/*
	 * Method detects changees in list and calls Search 
	 * @see javax.swing.event.DocumentListener#changedUpdate(javax.swing.event.DocumentEvent)
	 */
	@Override
	public void changedUpdate(DocumentEvent e) {
		Search();

	}
	/*
	 * Method detects changees in list and calls Search  
	 * @see javax.swing.event.DocumentListener#insertUpdate(javax.swing.event.DocumentEvent)
	 */

	@Override
	public void insertUpdate(DocumentEvent e) {
		Search();

	}
	/*
	 * Method detects changees in list and calls Search  
	 * @see javax.swing.event.DocumentListener#removeUpdate(javax.swing.event.DocumentEvent)
	 */
	@Override
	public void removeUpdate(DocumentEvent e) {
		Search();

	}
	//**************************************************************************************************		
	/*
	 * Search get text from search field and searchs for matches in arraylist of bibObject andd matches to BibList
	 */
	public void Search(){
		BibList.removeAll();
		MatchedBibCounter = 0;

		for(int i = 0; i< bibItemsArray.size();i++){
			if(bibItemsArray.get(i).BibKey != null && (bibItemsArray.get(i).BibKey).contains(SearchField.getText())){
				BibList.add(bibItemsArray.get(i).BibKey.replaceFirst(("\\@.*?\\{ ?"), ""));
				MatchedBibCounter++;
			}
			else if(bibItemsArray.get(i).Author != null && (bibItemsArray.get(i).Author).contains(SearchField.getText())){
				BibList.add(bibItemsArray.get(i).BibKey.replaceFirst(("\\@.*?\\{ ?"), ""));
				MatchedBibCounter++;
			}
			else if(bibItemsArray.get(i).Title != null && (bibItemsArray.get(i).Title).contains(SearchField.getText())){
				BibList.add(bibItemsArray.get(i).BibKey.replaceFirst(("\\@.*?\\{ ?"), ""));
				MatchedBibCounter++;
			}
			else if(bibItemsArray.get(i).Year != null && (bibItemsArray.get(i).Year).contains(SearchField.getText())){
				BibList.add(bibItemsArray.get(i).BibKey.replaceFirst(("\\@.*?\\{ ?"), ""));
				MatchedBibCounter++;
			}
		}
		MainPanel.setBorder(new TitledBorder(null, "Matched Bib Item : " + MatchedBibCounter, TitledBorder.LEADING, TitledBorder.TOP, null, null));

	}
	//********************************************************************************************************************************************************
	/*
	 * Method detects selected item of Biblist and displays its info in labels
	 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
	 */
	public void itemStateChanged(ItemEvent e) {
		String SelectedItem = BibList.getSelectedItem();
		for(int i = 0;i< bibItemsArray.size()-1;i++){
			if(bibItemsArray.get(i).BibKey.contains(SelectedItem)){
				BibInfoKey.setText(bibItemsArray.get(i).BibKey);
				BibInfoAuthor.setText("Author : " + bibItemsArray.get(i).Author);
				BibInfoTitle.setText("Title : " + bibItemsArray.get(i).Title);
				BibInfoYear.setText("Year : " + bibItemsArray.get(i).Year);
			}
		}
	}
	//********************************************************************************************************************************************************
	/*
	 * Detects User input and do action depends on his input
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent key) {
		String SelectedItem = BibList.getSelectedItem();
		switch(key.getKeyCode()){
		case KeyEvent.VK_ENTER:
			for(int i = 0;i< bibItemsArray.size()-1;i++){
				if(bibItemsArray.get(i).BibKey.contains(SelectedItem)){
					String str = bibItemsArray.get(i).BibKey;
					kb.switchFocus();
					kb.type(str);
				}}
			break;

		case KeyEvent.VK_1:
			for(int i = 0;i< bibItemsArray.size()-1;i++){
				if(bibItemsArray.get(i).BibKey.contains(SelectedItem)){
					String str = bibItemsArray.get(i).Title;
					kb.switchFocus();
					kb.type(str);
				}}
			break;

		case KeyEvent.VK_2:
			for(int i = 0;i< bibItemsArray.size()-1;i++){
				if(bibItemsArray.get(i).BibKey.contains(SelectedItem)){
					String str = bibItemsArray.get(i).Author;
					kb.switchFocus();
					kb.type(str);
				}}
			break;

		case KeyEvent.VK_3:
			for(int i = 0;i< bibItemsArray.size()-1;i++){
				if(bibItemsArray.get(i).BibKey.contains(SelectedItem)){
					String str = "0" + "-" + bibItemsArray.get(i).Title + "-" + bibItemsArray.get(i).Author + "-" + bibItemsArray.get(i).Year;
					kb.switchFocus();
					System.out.println("hi");
					System.out.println(bibItemsArray.get(i).BibKey);
					System.out.println(bibItemsArray.get(i).Author);
					System.out.println(bibItemsArray.get(i).Title);
					System.out.println(bibItemsArray.get(i).Year);
					kb.type(str);
				}}
			break;
		}

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
