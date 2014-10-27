/**
*
* Description of the program goes here Create Unit1\Lab02.java with “maze” map at size 8x8.  
Instantiate one athlete object and direct it to escape the maze.  
Leave a trail of beepers to mark the path.  
By default, athletes begin with an infinite number of beepers. // provide a brief description
*
* @author <Manu Gualandri>  // replace <...> with your name
* @version <27/10/2014> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02 {

     public static void main(String[] args) {
     Display.openWorld("maps/maze.map");
     Display.setSize(8, 8);
     Display.setSpeed(3);
     Athlete manu = new Athlete();
     manu.putBeeper();
     manu.move();
     manu.putBeeper();
     manu.turnRight();
     manu.move();
     manu.putBeeper();
     manu.turnRight();
     manu.move();
     manu.putBeeper();
     manu.turnLeft();
     manu.move();
     manu.putBeeper();
     manu.turnLeft();
     manu.move();
     manu.putBeeper();
     manu.turnRight();
     manu.move();
     manu.putBeeper();
     manu.move();
     manu.putBeeper();
     manu.turnRight();
     manu.move();
     manu.putBeeper();
     manu.turnLeft();
     manu.move();
     manu.putBeeper();
     manu.turnLeft();
     manu.move();
     manu.putBeeper();
     manu.move();
     manu.putBeeper();
     manu.move();
     manu.putBeeper();
     manu.move();
     manu.putBeeper();
     manu.turnRight();
     manu.move();
     manu.putBeeper();
     manu.move();
     }
}
