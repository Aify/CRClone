/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HogRider extends Card  
{
    HogRider(){
       elixirCost = 4;
       amountOfTroops = 1;
     
       spawnTime = 1;


	   id = -1;
       hp = 1408;
       damage = 264;
       range = 1;
       attackCooldown = 1;
       splashRange = 0;
       speed = Speed.HYPER;
    
       TargetType tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
       TargetType mTType = TargetType.BUILDINGS;  // my t type, what the troop prefers to target


    }

    public void spawn() {

    }
    
    
}
