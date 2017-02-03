package newFolder;

import java.util.Scanner;

/**
 * Created by jack.forman on 03/02/2017.
 */
public class User {

    private String name;
    private int counter;
    Scanner user_input = new Scanner(System.in);


    public void setName(String message){
        System.out.println(message);
        this.name = user_input.next();
    }

    public void setCounter(String message){
        System.out.println(message);
        this.counter = user_input.nextInt();
    }

    public String getName (){
        return name;
    }

    public int getCounter (){
        return counter;
    }


}
