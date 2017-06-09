/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleRam extends Card  
{
    public BattleRam(){
   elixirCost = 4;
    amountOfTroops = 1;
 
    spawnTime = 1;


	id = 10;
    hp = 756;
     damage = 492;
    range = 1;
     attackCooldown = 0;
   splashRange = 0;
    
    speed = Speed.MEDIUM;
    
   
   tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
  MTType = TargetType.BUILDINGS;  // my t type, what the troop prefers to target
}

    public void spawn() {

    }
    
   
}
