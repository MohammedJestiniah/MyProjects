import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
	private List<String> GroupNumber = new ArrayList<String>(); // Adding number of students in array to pass into the drop down list
	ArrayList<String> NamesList = new ArrayList<String>();		// Array Stores name of the student
	static ArrayList<Student> StuObjectArr = new ArrayList<Student>();  // Array of objects of students
	static ArrayList<Group> TableObjectArr = new ArrayList<Group>();    // Array of objects of students
	DropDownList list ;
	Student student;
	static Group group;
	static ChooseButton ChooseBt = new ChooseButton();
	static GenerateButton GenerateBt = new GenerateButton();
	int Student_XPos = 30;
	int Student_YPos = 700;
	int Group_XPos = 130;
	int Group_YPos = 140;
	int stuLoc=1;


	/**
	 * Constructor for objects of class MyWorld.
	 * @throws InterruptedException 
	 * 
	 */
	public MyWorld()
	{    
		// Create a new world with 1280x720 cells with a cell size of 1x1 pixels.
		// Read file and stores names in arraylist
		super(1280, 720, 1); 
		NamesList = readFile();
		prepare();






	}

	/**
	 * Prepare the world for the start of the program.
	 * That is: create the initial objects and add them to the world.
	 */
	public void prepare()
	{
		addObject(ChooseBt,340 , 18);
		addDropList();
	}
	/*
	 * (non-Javadoc)
	 * @see greenfoot.World#act()
	 * wait for select button to be pressed 
	 * if pressed , clear objects , reset variables and add all objects again
	 */
	
	public void act(){
		if(ChooseBt.ChooseBTClicked){
			reset();
			addTable();
			addStu();
			addObject(GenerateBt,1200 , 680);
			ChooseBt.ChooseBTClicked = false;
		}
	}

	/*
	 * add dropDownList and retrieve data from array of names
	 */
	public void addDropList(){
		getBackground().setColor(Color.BLACK);
		getBackground().setFont(new Font("Arial", Font.BOLD, 20));
		getBackground().drawString("Choose Number of groups", 10,  25);
		GroupNumber = new ArrayList<String>();
		for(int i = 0;i<=NamesList.size();i++){
			if(i != 0 && i !=1)
				GroupNumber.add(""+i);
		}
		list = new DropDownList(GroupNumber, 0);
		addObject(list, 280, 18); 
	}

    /*
     * add table objects after choosing their number from dropDownList 
     */
	public void addTable(){
		TableObjectArr = new ArrayList<Group>();
		int groupNum = list.getSelected()+2;
		for(int i = 0; i < groupNum ;i++){
			group = new Group(i+1);
			if(Group_XPos > 1200){
				Group_XPos = 130 ;
				Group_YPos = Group_YPos + 200;
			}
			addObject(group,Group_XPos,Group_YPos);
			TableObjectArr.add(group);
			Group_XPos = Group_XPos + 250;
		}
	}
	
	/*
     * add Student objects
     */
	public void addStu(){
		StuObjectArr = new ArrayList<Student>(); 
		for(int i = 0;i<NamesList.size();i++){
			student = new Student(NamesList.get(i));
			student.setRotation(270);
			if(Student_XPos > 800){
				Student_XPos = 30 ;
				Student_YPos = Student_YPos - 60;
			}
			addObject(student,Student_XPos,Student_YPos);
			StuObjectArr.add(student);
			Student_XPos = Student_XPos + 90;

		}
		distributeStu(); // call distribution function to randomize students
	}


	/*
	 * Read txt file and return array of students names
	 */
	public ArrayList<String> readFile()
	{
		ArrayList<String> NamesList = new ArrayList<String>(); 
		try (BufferedReader br = new BufferedReader(new FileReader("Students.txt")))
		{

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				sCurrentLine = sCurrentLine.replace(" ", "\n");
				NamesList.add(sCurrentLine);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return NamesList;
	}
	
	/*
	 * Remove objects and reset values 
	 */
	public void reset(){
		GenerateBt.GenerateBTClicked = false;
		removeObjects(getObjects(Student.class));
		removeObjects(getObjects(Group.class));
		Student_XPos = 30;
		Student_YPos = 700;
		Group_XPos = 130;
		Group_YPos = 140;
	}
	
	/*
	 * randomize students and distribute them to their table and give them locations around table
	 */
	public void distributeStu(){

		Collections.shuffle(StuObjectArr);
		int TableNum = 0;
		stuLoc=1;
		for(int i =0;i<StuObjectArr.size();i++ , TableNum++){

			if(TableNum == TableObjectArr.size()){
				TableNum=0;

				stuLoc ++;


			}

			StuObjectArr.get(i).GroupNum = TableNum;
			StuObjectArr.get(i).StuLoc = stuLoc;

		}
	}

}

