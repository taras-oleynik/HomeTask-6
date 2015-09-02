/**
 * Created by Taras_Oliinyk on 8/28/2015.
 */
public class Fish extends  Pet{

    int currentDepth = 0;


    public int dive (int howDeep){

        currentDepth = currentDepth + howDeep;

        if (currentDepth > 100){

            System.out.println("I am a little fish " + "and I can not dive deeper then 100 m");
            currentDepth = currentDepth - howDeep;
        }else{

            System.out.println( "Dive to " + howDeep + " m");
            System.out.println("I am on depth " + currentDepth + "m" );
        }


        return currentDepth;
    }


    public String say (String something){
        System.out.println("Do you know how fish talks? " + something);
        return "Do you know how fish talks?";


    }
}
