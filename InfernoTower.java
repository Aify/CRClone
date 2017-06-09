/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfernoTower extends Card  
{
    public InfernoTower(){
     elixirCost = 5;
     amountOfTroops = 1;
     
     spawnTime = 1;


	  id = 30;
      hp = 1408;
      damage = 100;
      range = 120;
      attackCooldown = 1;
      splashRange = 0;
    
      speed = Speed.SLOW;
    
    
       tType = TargetType.BUILDINGS;   // the type of the troop, eg: this is a building or this is a flying or ground
       MTType = TargetType.ALL;  // my t type, what the troop prefers to target

   
    }
    public void spawn() {

    }
    
    
}
