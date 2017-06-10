
public class IceSprit extends Card  
{
    public IceSprit()
    {
       elixirCost = 1;
     amountOfTroops = 1;
   
     spawnTime = 1;


	 id = -1;
     hp = 190;
     damage = 95;
     range = 50;
     attackCooldown = 0;
     splashRange = 50;
    
     speed = Speed.HYPER;
    

     tType = TargetType.GROUND;   // the type of the troop, eg: this is a building or this is a flying or ground
     MTType = TargetType.ALL;  // my t type, what the troop prefers to target

    
    }
    public void spawn() {

    }
    
   
}
