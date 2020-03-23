public class DogDoorSimulator {

    public static void main(String[] args) {

        DogDoor door = new DogDoor();

        door.addAllowedBark(new Bark("rowlf"));
        door.addAllowedBark(new Bark("rooowlf"));
        door.addAllowedBark(new Bark("rawlf"));
        door.addAllowedBark(new Bark("woof"));
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        // Simulate the hardware hearing a bark
        System.out.println("Bruce starts barking.");
        recognizer.recognize(new Bark("rowlf"));

        System.out.println("Bruce has gone outside...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("problem with timer");
        }

        System.out.println("Bruce’s all done...");
        System.out.println("...but he's stuck outside!");

        // Simulate the hardware hearing a bark (not Bruce!)
        Bark smallDogBark = new Bark("yip");
        System.out.println("A small dog starts barking.");
        recognizer.recognize(smallDogBark);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("problem with timer");
        }

        // Simulate the hardware hearing a bark again
        System.out.println("Bruce starts barking.");
        recognizer.recognize(new Bark("rooowlf"));

        System.out.println("Bruce’s back inside...");

    }

}
