/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinionHorde extends Card  
{
    MinionHorde() {
        
         elixirCost = 5;
         amountOfTroops = 6;
        
         spawnTime = -1;


	     id = 39;
         hp = 190;
         damage = 84;
         range = 40;
         attackCooldown = 1;
         splashRange = 0;
    
         Speed speed = Speed.FAST;
    
         DamageType dType;
         TargetType tType = TargetType.AIR;   // the type of the troop, eg: this is a building or this is a flying or ground
         TargetType mTType = TargetType.ALL;  // my t type, what the troop prefers to target

         int attackTime;
    }

    public void spawn() {

    }
    
    
}
