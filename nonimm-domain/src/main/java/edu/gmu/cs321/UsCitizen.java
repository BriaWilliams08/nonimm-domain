package edu.gmu.cs321;
import java.util.ArrayList;
import java.util.List;

public class UsCitizen { 
    String name;
    boolean citizenshipStatus;
    List<String> existingNonImm;

    public UsCitizen(String name, boolean citizenshipStatus) {
        this.name = name;
        this.citizenshipStatus = citizenshipStatus;
        this.existingNonImm = new ArrayList<>();
    }
    
    public boolean requestEntry(String nonImmInfo){ //only us citizens can input, no duplicate nonimmigrants
        if(citizenshipStatus == false){
            return false;
        }
        if(existingNonImm.contains(nonImmInfo)){
            return false;
        }
        existingNonImm.add(nonImmInfo);
        return true;
    }

    public boolean getResponse(){
        return true;
    }
}
