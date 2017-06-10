/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bats extends Card  
{
    public Bats()
    {
       elixirCost = 2;
     amountOfTroops = 4;
   
     spawnTime = 1;


	 id = -1;
     hp = 67;
     damage = 67;
     range = 0;
     attackCooldown = 1;
     splashRange = 0;
    
     speed = Speed.FAST;
    

     tType = TargetType.AIR;   // the type of the troop, eg: this is a building or this is a flying or ground
     MTType = TargetType.ALL;  // my t type, what the troop prefers to target

    
    }
    public void spawn() {

    }
    
   
}
