/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Golem extends Card  
{
    
    public Golem()
    {
        
        
       elixirCost = 8;
       amountOfTroops = 1;
       spawnTime = 3;
	   id = 28;
       hp = 4256;
       damage = 259;
       range = 1;
       attackCooldown = 3;
       splashRange = 0;
    
       speed = Speed.SLOW;
    

       TargetType tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
       TargetType mTType = TargetType.BUILDINGS;  // my t type, what the troop prefers to target

        
    }

    public void spawn() {

    }
    
    
   
}
