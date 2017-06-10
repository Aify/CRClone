/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Freeze extends Card  
{
	public Freeze()
	{
		elixirCost = 4;
		amountOfTroops = 0;
		spawnTime = 0;


		id = 21;
		hp = 0;
		damage = 0;
		range = 800000;
		attackCooldown = 0;
		splashRange = 60;
			
		speed = Speed.HYPER;
		tType = TargetType.AIR;   // the type of the troop, eg: this is a building or this is a flying or ground
		MTType = TargetType.ALL;  // my t type, what the troop prefers to target
	}
	
    


    public void spawn() {

    }

}
