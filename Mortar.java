/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mortar extends Card  
{
    public Mortar()
    {
        
       elixirCost = 4;
       amountOfTroops = 1;
       spawnTime = 4;
	   id = 1;
       hp = 1272;
       damage = 228;
       range = 220;
       attackCooldown = 1;
       splashRange = 80;
       speed = Speed.SLOW;
       tType = TargetType.BUILDINGS;  
       MTType = TargetType.GROUND;
    } 
    public void spawn() {
       
     
    }
    }

