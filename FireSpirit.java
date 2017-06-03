/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireSpirit extends Card  
{
       public FireSpirit()
    {
      elixirCost = 2;
      amountOfTroops = 3;
   
      spawnTime = 1;


	 id = -1;
     hp = 91;
     damage = 169;
     range = 40;
     attackCooldown = 1;
     splashRange = 40;
    
     speed = Speed.HYPER;
    
  
     tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
     MTType = TargetType.ALL;  // my t type, what the troop prefers to target
  }

    public void spawn() {

    }
    
   
}
