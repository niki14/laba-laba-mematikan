import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bayi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bayi extends Actor
{
    /**
     * Act - do whatever the bayi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if(Greenfoot.mouseMoved(null)){
          MouseInfo mouse=
      Greenfoot.getMouseInfo();
          setLocation(mouse.getX(),
      mouse.getY());
      
      bread a = (bread)getOneIntersectingObject(bread.class); // untuk bread dapat hilang ketika dimakan
        if(a!=null)
        {
            Greenfoot.playSound("pop.wav"); //untuk menambah suara
            getWorld().removeObject(a);
            return;
        }
    }
    }    
}
