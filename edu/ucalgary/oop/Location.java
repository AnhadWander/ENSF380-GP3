package edu.calgary.oop;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private String address;
    private List<DisasterVictim> occupants;
    private List<Supply> supplies;

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.occupants = new ArrayList<>();
        this.supplies = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public List<DisasterVictim> getOccupants() { return occupants; }
    public void setOccupants(List<DisasterVictim> occupants) { this.occupants = occupants; }
    public List<Supply> getSupplies() { return supplies; }
    public void setSupplies(List<Supply> supplies) { this.supplies = supplies; }
    
    public void addOccupant(DisasterVictim occupant) { occupants.add(occupant); }
    public void removeOccupant(DisasterVictim occupant) { occupants.remove(occupant); }
    public void addSupply(Supply supply) { supplies.add(supply); }
    public void removeSupply(Supply supply) { supplies.remove(supply); }
}
