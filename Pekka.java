/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pekka extends Card  
{
	public Pekka()
	{
		elixirCost = 7;
		amountOfTroops = 1;
		spawnTime = 1;


		id = 45;
		hp = 3458;
		damage = 678;
		range = 1;
		attackCooldown = 2;
		splashRange = 0;
		
		speed = Speed.SLOW;

		tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
		MTType = TargetType.GROUND;
	}


    public void spawn() {

    }
}
