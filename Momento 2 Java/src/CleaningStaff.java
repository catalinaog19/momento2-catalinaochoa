
public class CleaningStaff extends  Person {

    private  String dayoff;

    public String getDayoff() {
        return dayoff;
    }

    public void setDayoff(String dayoff) {
        this.dayoff = dayoff;
    }
    public  String Cleaningstaff(){

        return
             this.getName()  +  " " + this.getAge()  +  " " + this.getIdentification()  +  " " + this.getDayoff();
    }


}
