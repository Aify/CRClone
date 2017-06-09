/**
 * Write a description of class Card here.
 * 
 * @author (David) 
 * @version (a version number or a date)
 */
public class WhiteWitch extends Card  
{
	public WhiteWitch()
	{
		elixirCost = 7;
		amountOfTroops = 1;
		spawnTime = 10;


		id = 62;
		hp = 220;
		damage = 320;
		range = 0;
		attackCooldown = 7;
		splashRange = 50;
			
		speed = Speed.MEDIUM;

		tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
		MTType = TargetType.ALL;  // my t type, what the troop prefers to target
	}


    public void spawn() {

    }

}
