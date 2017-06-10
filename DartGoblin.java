/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DartGoblin extends Card  
{
    public DartGoblin ()
    {
       elixirCost = 3;
     amountOfTroops = 1;
   
     spawnTime = 1;


	 id = -1;
     hp = 216;
     damage = 143;
     range = 130;
     attackCooldown = 1;
     splashRange = 0;
    
     speed = Speed.HYPER;
    

     tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
     MTType = TargetType.ALL;  // my t type, what the troop prefers to target

    
    }
    public void spawn() {

    }
    
   
}
