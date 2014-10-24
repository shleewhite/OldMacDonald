import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OldMacDonald extends PApplet {

Farm[] yayFarm;
public void setup()
{
	yayFarm = new Farm[1];
	yayFarm[0] = new Farm();
  yayFarm[0].animalSounds();
}
public void draw()
{
	
}
interface Animal
{
	public String getSound();        
  public String getType(); 
}
class Cow implements Animal 
{     
  protected String myType;     
  protected String mySound;      
  public Cow(String type, String sound)    
  {         
     myType = type;         
     mySound = sound;
  }     
  public Cow()    
  {         
     myType = "unknown";         
     mySound = "unknown";     
  }      
  public String getSound(){return mySound;}     
  public String getType(){return myType;} 
}
class Pig implements Animal
{
  private String myType;     
  private String mySound;      
  public Pig(String type, String sound)    
  {         
     myType = type;         
     mySound = sound;
  }     
  public Pig()    
  {         
     myType = "unknown";         
     mySound = "unknown";     
  }      
  public String getSound(){return mySound;}     
  public String getType(){return myType;} 
}
class Chick implements Animal
{
  private String myType;     
  private String mySound;      
  public Chick(String type, String sound, String sound2)    
  {         
     myType = type;   

     if (Math.random()<0.5f)
     {
      mySound = sound2;
     }
     else
     {
      mySound = sound;
     }
  }     
  public Chick()    
  {         
     myType = "unknown";         
     mySound = "unknown";     
  }      
  public String getSound(){return mySound;}     
  public String getType(){return myType;}  
}
class Farm  
{     
  private Animal[] aBunchOfAnimals = new Animal[3];    
  public Farm()     
  {       
    aBunchOfAnimals[0] = new NamedCow("cow","moo", "Betty");           
    aBunchOfAnimals[1] = new Chick("chick","cluck", "chirp");       
    aBunchOfAnimals[2] = new Pig("pig","oink");    
  }         
  public void animalSounds()    
  {       
    for (int nI=0; nI < aBunchOfAnimals.length; nI++)      
    {          
     System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
    }  
    System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() );  
  } 
}
class NamedCow extends Cow
{
    private String cowName, myType, mySound;
    public NamedCow(String type, String sound, String name)
    {
      cowName = name;
      myType = type;
      mySound = sound;
    }
    public String getName(){return cowName;}
    public String getSound(){return mySound;}     
  public String getType(){return myType;} 
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OldMacDonald" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
