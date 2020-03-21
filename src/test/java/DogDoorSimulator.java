public class DogDoorSimulator {

    public static void main(String[] args) {

        DogDoor door = new DogDoor();
//        Remote remote = new Remote(door);
        BarkRecognizer recognizer = new BarkRecognizer(door);

        System.out.println("Fido barks to go outside...");

        System.out.println("door bark recognizer in action");
        recognizer.recognize("woof");
//        remote.pressButton();

        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido’s all done...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("problem with timer");
        }

        System.out.println("...but he's stuck outside!");
        System.out.println("door bark recognizer in action again ");
        recognizer.recognize("woof woof");

//        System.out.println("...so Todd grabs the remote control.");
//        remote.pressButton();


        System.out.println("\nFido’s back inside...");
//        remote.pressButton();

    }

}
