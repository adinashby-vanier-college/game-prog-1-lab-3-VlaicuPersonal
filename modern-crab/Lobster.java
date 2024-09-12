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
        startingDirection();
        moveAround();
        removeWormAddLobster();
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
        Actor worm = getOneIntersectingObject(Worm.class);
        if (worm != null) {
            World world = getWorld();
            int locationX = worm.getX();
            int locationY = worm.getY();
            Actor lobster =  new  Lobster();
            world.removeObject(worm);
            world.addObject(lobster, locationX, locationY);
        }
    }
}
