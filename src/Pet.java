/**
 * Created by Taras_Oliinyk on 8/28/2015.
 */
public class Pet {

    int age;
    float weigth;
    float height;
    String color;


    public void sleep(){
        System.out.println("See you");
    }

    public void eat(){
        System.out.println("let's eat ");
    }


    public String say(String aword){

        String petResponce = "OK " + aword;
        return petResponce;
    }

}

