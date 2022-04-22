package ro.fasttrackit.lab7;

public class Door {
     boolean open;
    private String purpose;

     Door(boolean instanceState) {
          open = instanceState;
     }

     Door(boolean instancesState, String initialPurpose){
          open = instancesState;
          purpose = initialPurpose;
     }
     boolean isOpen(){
          return open;
     }
     boolean isClous(){
          return !open;
     }
     String getPurpose(){
          return purpose;
     }
     }

