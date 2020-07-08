package models;
import java.util.ArrayList;

public class Squad {

    public int SqId;
    public String name_of_Squad;
    public int maximum_number;
    public String squadCause;

    private static ArrayList<models.Hero> squadIncludes= new ArrayList<>();
    public  static ArrayList<Squad> instances = new ArrayList<>();

    public Squad(String name_of_Squad ,int maximum_number, String cause){
        this.name_of_Squad = name_of_Squad;
        this.maximum_number = maximum_number;
        this.squadCause = cause;
        this.squadIncludes = new ArrayList<>();
        instances.add(this);
        this.SqId = instances.size();
    }

    public static Squad findBySqId(int id) {
        return instances.get(id-1);
    }
    public String getSquadName() {
        return name_of_Squad;
    }
    public int getSize() {
        return maximum_number;
    }
    public String getSqdCause() {
        return this.squadCause;
    }
    public static ArrayList<Squad> getInstances(){
        return instances;
    }
    public ArrayList<models.Hero> getSquadMembers(){
        return  squadIncludes;
    }
    public void setSquadMembers(models.Hero newMember) {
        squadIncludes.add(newMember);
    }
    public static void clearAllSquads(){
        instances.clear();
    }
    public void clearAllSquadMembers(){
        getSquadMembers().clear();
    }

    public static Squad setNewSquad(){
        return new Squad("Stylist Gang",5,"Fight for the weak");
    }
    public static Squad setUpNewSquad1(){
        return new Squad("The Annihilators",5,"Fight for riches");
    }
}
