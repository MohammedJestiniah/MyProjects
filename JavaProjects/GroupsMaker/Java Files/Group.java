import java.awt.Color;
import java.awt.Font;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Group here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Group extends Actor
{
	public Group(int i)
	{
		GreenfootImage image = getImage();
		image.scale(120 , 110);
		image.setColor(Color.WHITE);
		image.setFont(new Font("Arial", Font.BOLD, 18));
		getImage().drawString("Group# "+i, 18, 60);
		setImage(image);
	}
	/**
	 * Act - do whatever the Group wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() 
	{
		// Add your action code here.
	}    
}
