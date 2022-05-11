public class Accountant extends Person {
    private  String Leader;
    private  String Parking;

    public String getLeader() {
        return Leader;
    }

    public void setLeader(String leader) {
        Leader = leader;
    }

    public String getParking() {
        return Parking;
    }

    public void setParking(String parking) {
        Parking = parking;
    }

    public String Accountant(){

        return
               this.getName()  +  " " + this.getAge()  +  " " + this.getIdentification()  +  " " + this.getLeader()  +  " " + this.getParking();
    }




}
