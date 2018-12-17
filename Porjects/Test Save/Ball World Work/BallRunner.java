
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRunner
{
    // instance variables - replace the example below with your own
    public static void run(){
        BallWorld ballworld = new BallWorld (200,200);
        TGPoint start = new TGPoint (-15,80); 
        BallBot ballBot = new BallBot (ballworld,start,80.5,80);
        if(ballBot.canMoveForward(ballworld) ==true) {
            ballBot.moveForward();

        }

    }
}
