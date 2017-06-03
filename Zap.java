/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zap extends Card  
{
    public Zap()
    {
       elixirCost = 2;
     amountOfTroops = 0;
   
     spawnTime = 0;


	 id = -1;
     hp = 0;
     damage = 159;
     range = 80000;
     attackCooldown = 0;
     splashRange = 60;
    
     speed = Speed.HYPER;
    

     tType = TargetType.AIR;   // the type of the troop, eg: this is a building or this is a flying or ground
     MTType = TargetType.ALL;  // my t type, what the troop prefers to target

    
    }
    public void spawn() {

    }
    
   
}
