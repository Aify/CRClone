/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tesla extends Card  
{
    Tesla(){
      elixirCost = 4;
      amountOfTroops = 2;
   
      spawnTime = 1;


	  id = 55;
      hp = 954;
      damage = 135;
      range = 110;
      attackCooldown = 1;
      splashRange = 0;
    
      speed = Speed.SLOW;
    
      DamageType dType;
      TargetType tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
      TargetType mTType = TargetType.ALL;  // my t type, what the troop prefers to target

      int attackTime;
    }

    public void spawn() {

    }
    
   
}
