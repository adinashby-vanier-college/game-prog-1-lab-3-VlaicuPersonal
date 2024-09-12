// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        startingDirection();
        removeWormAddLobster();
    }

    /**
     * 
     */
    public void addObject(Actor Lobster, int x, int y)
    {
        addObject(Lobster, locationX, locationY);
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
        if (isTouching(Crab.class)) {
            removeTouching(Crab.class);
            Greenfoot.playSound("scary.wav");
        }
    }

    /**
     * 
     */
    public void startingDirection()
    {
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(360));
        }
    }

    /**
     * 
     */
    public void removeWormAddLobster()
    {
        Actor worm2 = getOneIntersectingObject(Worm.class);
        if (worm2 != null) {
            getX();
            getY();
            World world2 = getWorld();
            world2.removeObject(worm2);
            int locationX = getX;
            int locationY = getY;
        }
    }
}
