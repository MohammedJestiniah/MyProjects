import java.awt.Color;
import java.awt.Font;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GenerateButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenerateButton extends Actor
{
	static boolean GenerateBTClicked = false;

	public GenerateButton()
	{
		GreenfootImage image = getImage();
		image.scale(150, 70);
		image.setColor(Color.WHITE);
		image.setFont(new Font("Arial", Font.BOLD, 20));
		getImage().drawString("Generate!", 25, 40);
		setImage(image);
	}
	/**
	 * Act - do whatever the GenerateButton wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() 
	{
		if (Greenfoot.mouseClicked(this)) {
			GenerateBTClicked = true;
		}    
	}
}
