/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Excutioner extends Card  
{
    public Excutioner()
    {
       elixirCost = 5;
     amountOfTroops = 1;
   
     spawnTime = 1;


	 id = -1;
     hp = 1010;
     damage = 140;
     range = 90;
     attackCooldown = 2;
     splashRange = 40;
    
     speed = Speed.MEDIUM;
    

     tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
     MTType = TargetType.ALL;  // my t type, what the troop prefers to target

    
    }
    public void spawn() {

    }
    
   
}
