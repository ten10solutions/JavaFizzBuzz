package newFolder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.*;


/**
 * Created by jack.forman on 27/01/2017.
 */
public class App {


    /**
     * This is a program which does xyz
     * @param args
     */
    public static void main (String args[]){

//        Calendar rightNow = Calendar.getInstance();
//        System.out.println(rightNow.getFirstDayOfWeek());


        User player = new User();
        Game newGame = new Game();

        player.setName("Please enter your name");
        player.setCounter("How high should I count - fizz buzz style");

        newGame.playGame(player);




    }
}
