
public class PetMaster {

    public static void main(String[] args) {
        String PetReaction;
        Pet myPet = new Pet();
        myPet.eat();
        PetReaction = myPet.say("Hi there");
        System.out.println(PetReaction);
        myPet.sleep();

    }
}
