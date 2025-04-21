import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Character extends Actor
{
    public void act()
    {
       if(Greenfoot.mouseClicked(null))
       {
            move(2);
       }
    }
}
