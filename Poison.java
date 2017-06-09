/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poison extends Card  
{
    public Poison(){
     elixirCost = 4;
    amountOfTroops = 0;
   
    spawnTime = 1;


	id = 48;
     hp = 0;
     damage = 75;
   range = 80000;
     attackCooldown = 1;
   splashRange = 70;
    
    speed = Speed.HYPER;
    
    
     tType = TargetType.AIR;   // the type of the troop, eg: this is a building or this is a flying or ground
  MTType = TargetType.ALL;  // my t type, what the troop prefers to target

}

    public void spawn() {

    }
   
}
