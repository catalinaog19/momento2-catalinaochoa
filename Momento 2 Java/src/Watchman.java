public class Watchman extends Person {

    private  String Weapon;
    private  String Workday;

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public String getWorkday() {
        return Workday;
    }

    public void setWorkday(String workday) {
        Workday = workday;
    }
    public String Watchman(){

        return
                this.getName() + " " +  this.getAge() +  " " +  this.getIdentification()  +  " " +this.getWeapon()  +  " " +this.getWorkday() ;
    }
}
