import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class awan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class awan extends Actor
{
    /**
     * Act - do whatever the awan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-2);
        if(getX() <= 0)
        setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));

    }
}
