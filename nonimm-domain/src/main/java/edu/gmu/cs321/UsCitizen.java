package edu.gmu.cs321;
import java.util.ArrayList;
import java.util.List;

public class UsCitizen { 
    String name;
    boolean citizenshipStatus;
    List<String> existingNonImm;

    /*
     * UsCitizen constructor.
     * name - the UsCitizen's name
     * citizenshipStatus - the UsCitizen's status
     * existingNonImm - an arraylist to hold who has been added already
     */
    public UsCitizen(String name, boolean citizenshipStatus) {
        this.name = name;
        this.citizenshipStatus = citizenshipStatus;
        this.existingNonImm = new ArrayList<>();
    }
    
    /*
     * a method to request the entry of a nonimmigrant worker.
     * nonImmInfo - holds the name of the worker to be added
     */
    public boolean requestEntry(String nonImmInfo){ //only us citizens can input, no duplicate nonimmigrants
        if(citizenshipStatus == false){ //if the input is not from a US citizen, deny
            return false;
        }
        if(existingNonImm.contains(nonImmInfo)){ //if nonimmigrant worker has already been requested, deny
            return false;
        }
        existingNonImm.add(nonImmInfo); //adds new input nonimmigrant worker to list
        return true;
    }

    public boolean getResponse(){
        return true; //for sake of testing, true
    }
}
