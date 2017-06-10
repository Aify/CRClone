/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bowler extends Card  
{
    public Bowler()
    {
       elixirCost = 5;
     amountOfTroops = 1;
   
     spawnTime = 1;


	 id = -1;
     hp = 1596;
     damage = 239;
     range = 100;
     attackCooldown = 3;
     splashRange = 20;
    
     speed = Speed.SLOW;
    

     tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
     MTType = TargetType.GROUND;  // my t type, what the troop prefers to target

    
    }
    public void spawn() {

    }
    
   
}
