/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wizard extends Card 
 
{
    public Wizard(){
    elixirCost = 5;
     amountOfTroops = 1;
    
  spawnTime = 1;


	 id = 64;
    hp = 598;
    damage = 228;
    range = 110;
     attackCooldown = 1;
    splashRange = 60;
    
   speed = Speed.MEDIUM;
    
   
    tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
   MTType = TargetType.ALL;  // my t type, what the troop prefers to target

   
}
    public void spawn() {

    }
    
   
}
