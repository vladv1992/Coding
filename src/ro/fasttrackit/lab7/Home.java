package ro.fasttrackit.lab7;

public class Home {
    public static void main(String[] args) {
        Door myFrontdoor = new Door(true, "front");
        Door kichenDoor = new Door(false, "kichen");

        printDoor(myFrontdoor);
        printDoor(kichenDoor);
    }
   public static void printDoor(Door door){
        if(door.isOpen()){
            System.out.println("the door " + door.getPurpose() + " is open");
        }else{
            System.out.println("the door " + door.getPurpose() + " is closed");
        }
   }
}

