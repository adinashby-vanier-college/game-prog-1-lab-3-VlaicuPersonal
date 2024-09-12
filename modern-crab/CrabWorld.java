// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 235, 272);
        Worm worm =  new  Worm();
        addObject(worm, 540, 95);
        Worm worm2 =  new  Worm();
        addObject(worm2, 464, 310);
        Worm worm3 =  new  Worm();
        addObject(worm3, 135, 134);
        Worm worm4 =  new  Worm();
        addObject(worm4, 212, 375);
        Worm worm5 =  new  Worm();
        addObject(worm5, 83, 223);
        Worm worm6 =  new  Worm();
        addObject(worm6, 453, 470);
        Worm worm7 =  new  Worm();
        addObject(worm7, 251, 99);
        Worm worm8 =  new  Worm();
        addObject(worm8, 415, 216);
        removeObject(worm5);
        Worm worm9 =  new  Worm();
        addObject(worm9, 96, 482);
        Worm worm10 =  new  Worm();
        addObject(worm10, 50, 41);
    }
}
