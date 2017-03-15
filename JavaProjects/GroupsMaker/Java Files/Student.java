import java.awt.Font;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Actor
{
	static GenerateButton GenerateBt = new GenerateButton(); //Object of generate button 
	GreenfootImage image = getImage();
	int GroupNum = 0;
	int StuLoc = 1;
	private boolean arrive = false;
	
	public Student(String StuName)
	{


		image.scale(110, 90);
		image.setFont(new Font("Arial", Font.BOLD, 11));
		getImage().drawString(StuName, 25, 40);
		image.rotate(90);
		setImage(image);
	}


	/**
	 * Act - do whatever the Student wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() 
	{

		if(GenerateBt.GenerateBTClicked){

			turnTowards(MyWorld.TableObjectArr.get(GroupNum).getX(), MyWorld.TableObjectArr.get(GroupNum).getY()); //Direct Objects toward the table

			if(!intersects(MyWorld.TableObjectArr.get(GroupNum))){ //Move object until they intersect with the table 
				move(3); 
			} else{
				arrive= true;
			}
			/*
			 * The following determine the location of students around the table
			 */
			if(StuLoc==5&& arrive ){
				setLocation(MyWorld.TableObjectArr.get(GroupNum).getX()-70, MyWorld.TableObjectArr.get(GroupNum).getY()-70);
				turnTowards(MyWorld.TableObjectArr.get(GroupNum).getX(), MyWorld.TableObjectArr.get(GroupNum).getY());
			}
			if(StuLoc==6&& arrive ){
				setLocation(MyWorld.TableObjectArr.get(GroupNum).getX()+70, MyWorld.TableObjectArr.get(GroupNum).getY()+70);
				turnTowards(MyWorld.TableObjectArr.get(GroupNum).getX(), MyWorld.TableObjectArr.get(GroupNum).getY());
			}
			if(StuLoc==7&& arrive ){
				setLocation(MyWorld.TableObjectArr.get(GroupNum).getX()+70, MyWorld.TableObjectArr.get(GroupNum).getY()-70);
				turnTowards(MyWorld.TableObjectArr.get(GroupNum).getX(), MyWorld.TableObjectArr.get(GroupNum).getY());
			}
			if(StuLoc==8&& arrive ){
				setLocation(MyWorld.TableObjectArr.get(GroupNum).getX()-70, MyWorld.TableObjectArr.get(GroupNum).getY()+70);
				turnTowards(MyWorld.TableObjectArr.get(GroupNum).getX(), MyWorld.TableObjectArr.get(GroupNum).getY());
			}
			if(StuLoc==3&& arrive ){
				setLocation(MyWorld.TableObjectArr.get(GroupNum).getX()+0, MyWorld.TableObjectArr.get(GroupNum).getY()+100);
				turnTowards(MyWorld.TableObjectArr.get(GroupNum).getX(), MyWorld.TableObjectArr.get(GroupNum).getY());
			}
			if(StuLoc==4&& arrive ){
				setLocation(MyWorld.TableObjectArr.get(GroupNum).getX()+0, MyWorld.TableObjectArr.get(GroupNum).getY()-100);
				turnTowards(MyWorld.TableObjectArr.get(GroupNum).getX(), MyWorld.TableObjectArr.get(GroupNum).getY());
			}
			if(StuLoc==1&& arrive ){
				setLocation(MyWorld.TableObjectArr.get(GroupNum).getX()-100, MyWorld.TableObjectArr.get(GroupNum).getY()+5);
				turnTowards(MyWorld.TableObjectArr.get(GroupNum).getX(), MyWorld.TableObjectArr.get(GroupNum).getY());
			}
			if(StuLoc==2&& arrive ){
				setLocation(MyWorld.TableObjectArr.get(GroupNum).getX()+90, MyWorld.TableObjectArr.get(GroupNum).getY()+0);
				turnTowards(MyWorld.TableObjectArr.get(GroupNum).getX(), MyWorld.TableObjectArr.get(GroupNum).getY());
			}











		}



	}    
}
