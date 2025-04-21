import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bullets extends Actor
{
    public void act()
    {
        move(-10);
        if(getX() <= 0 )
        {
            resetBullets();
        }
        if(isTouching(Character.class))
        {
            Gg face = new Gg();
            getWorld().addObject(face, 300, 200);
            getWorld().removeObject(this); 
        }
    }
    public void resetBullets()
    {
        int num = Greenfoot.getRandomNumber(3);
        if(num == 0)
        {
            setLocation(600,100);
        }
        else
        {
            setLocation(600,300);
        }
    }
}
