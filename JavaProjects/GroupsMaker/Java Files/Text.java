import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.List;

/**
 * A small piece of text that demonstrates the drop-down list.
 * 
 * @author imacat <imacat@mail.imacat.idv.tw>
 * @version 2014/02/12
 */
public class Text extends Actor {
    
    /** The currently-selected item. */
    private int selected = 0;
    
    /** The drop-down list. */
    private List<String> GroupList = null;
    
    /** The drop-down list. */
    private DropDownList GroupsDropDownList = null;
    
    /**
     * Creates a new piece of text.
     * 
     * @param list the drop-down list
     */
    public Text(List<String> Groups, DropDownList list) {
        drawText("");
        GroupList = Groups;
        GroupsDropDownList = list;
        selected = GroupsDropDownList.getSelected();
    }
    
    /**
     * Things to do for each turn.
     * 
     */
    public void act() {
        if (selected != GroupsDropDownList.getSelected()) {
            selected = GroupsDropDownList.getSelected();
            drawText("We are now at " + GroupList.get(selected) + ".");
        }
    }
    
    /**
     * Draws the text.
     * 
     * @param text the text to draw
     */
    private void drawText(String text) {
        GreenfootImage image = new GreenfootImage(text, 20, Color.BLACK, new Color(0, 0, 0, 0));
        setImage(image);
    }
}