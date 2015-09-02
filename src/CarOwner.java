/**
 * Created by Taras_Oliinyk on 8/28/2015.
 */
public class CarOwner {
    public static void main(String[] args) {

        Car myCar = new Car();
        Car bond = new JamesBond();
        myCar.start();
        myCar.stop();
        System.out.println(myCar.drive(20));
        System.out.println(bond.drive(20));

    }

}
