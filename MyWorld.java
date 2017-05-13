import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static ArrayList<Troop> allTroops = new ArrayList<Troop>();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 900, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        /*
        Troop troop = new Troop();
        addObject(troop,320,482);
        Troop troop2 = new Troop();
        addObject(troop2,200,150);
        troop.setLocation(466,617);

        troop.setSpeed(Speed.SLOW);
        troop2.setSpeed(Speed.SLOW);
        troop.active = true;

        troop.setRange(10);
        allTroops.add(troop2);
        troop2.setLocation(174,196);
         */
    }
}
