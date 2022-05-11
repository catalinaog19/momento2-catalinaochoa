public class Admin extends  Person {

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


    public String Admin(){

        return
                this.getName()  +  " " + this.getAge()  +  " " + this.getIdentification()  +  " " +  this.getLeader()  +  " " + this.getParking();
    }



}
