import java.awt.Color;
import java.awt.Font;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChooseButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChooseButton extends Actor
{

	static boolean ChooseBTClicked = false;
	public ChooseButton()
	{
		GreenfootImage image = getImage();
		image.scale(80, 30);
		image.setColor(Color.WHITE);
		image.setFont(new Font("Arial", Font.BOLD, 15));
		getImage().drawString("SELECT", 10, 21);
		setImage(image);
	}
	/**
	 * Act - do whatever the ChooseButton wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() 
	{
		if (Greenfoot.mouseClicked(this)) {
			ChooseBTClicked = true;
		}    
	}
}