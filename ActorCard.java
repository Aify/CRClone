import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ActorCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ActorCard extends Actor
{
    String cardName;
    
    public ActorCard(String cardName)
    {
        this.cardName = cardName;
        setImage("images/Cards/"+cardName+"Card.png");
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            try
            {
                GameManager.lastSelected = (Card)Class.forName(cardName).getConstructor().newInstance();
                GameManager.lastSelectedCard = this;
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }    
}
