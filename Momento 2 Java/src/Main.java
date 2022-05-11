import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        List<Watchman> Watchmans = new ArrayList();
        List<CleaningStaff> Cleaningstaffs = new ArrayList();
        List<Accountant> Accountants = new ArrayList();
        List<Admin> Admins = new ArrayList();
        String j = "yes";

        while (j.equals("yes") || j.equals("YES") ) {

            System.out.println("Type the profession you want to enter: 1.Watchman 2.CleaningStaff 3.Accountant 4.Admin");
            n = Integer.parseInt(scanner.nextLine());

            if (n == 1) {


                Watchman Watchman = new Watchman();
                System.out.println("Type the name of the Watchman:");
                Watchman.setName(scanner.nextLine());
                System.out.println("Type de ID of the Watchman:");
                Watchman.setIdentification(scanner.nextLine());
                System.out.println(" Type the age of the Watchman:");
                Watchman.setAge(scanner.nextLine());
                System.out.println(" Enter the type of weapon that he use:");
                Watchman.setWeapon(scanner.nextLine());
                System.out.println("Type the work day:");
                Watchman.setWorkday(scanner.nextLine());
                Watchmans.add(Watchman);
            } else {
                if (n == 2) {

                    CleaningStaff Cleaningstaff = new CleaningStaff();
                    System.out.println("Type the name of the CleaningStaff");
                    Cleaningstaff.setName(scanner.nextLine());
                    System.out.println("Type de ID of the CleaningStaff");
                    Cleaningstaff.setIdentification(scanner.nextLine());
                    System.out.println("Type the age of the CleaningStaff");
                    Cleaningstaff.setAge(scanner.nextLine());
                    System.out.println("Type the rest day");
                    Cleaningstaff.setDayoff(scanner.nextLine());
                    Cleaningstaffs.add(Cleaningstaff);
                } else {
                    if (n == 3) {

                        Accountant Accountant = new Accountant();
                        System.out.println(" Type the name of the Accountant");
                        Accountant.setName(scanner.nextLine());
                        System.out.println("Type de ID of the Accountant");
                        Accountant.setIdentification(scanner.nextLine());
                        System.out.println("Type the age of the Accountant");
                        Accountant.setAge(scanner.nextLine());
                        System.out.println("Enter the name of the chief accountant");
                        Accountant.setLeader(scanner.nextLine());
                        System.out.println("Enter the counter parking lot");
                        Accountant.setParking(scanner.nextLine());
                        Accountants.add(Accountant);
                    } else {
                        if (n == 4) {

                            Admin Admin = new Admin();
                            System.out.println(" Type the name of the Admin");
                            Admin.setName(scanner.nextLine());
                            System.out.println(" Type de ID of the Admin");
                            Admin.setIdentification(scanner.nextLine());
                            System.out.println("Type the age of the Admin ");
                            Admin.setAge(scanner.nextLine());
                            System.out.println("Enter the name of the chief Admin ");
                            Admin.setLeader(scanner.nextLine());
                            System.out.println("Enter manager's parking lot");
                            Admin.setParking(scanner.nextLine());
                            Admins.add(Admin);
                        }
                    }
                }
            }
            System.out.println("Do you want to enter another profession?");
            String stop = scanner.nextLine();
            if (stop.equals("no") || stop.equals("NO")) {
                break;
            }



        }

        System.out.println("What is the profession you want to consult? 1.Watchman 2.CleaningStaff  3.Accountant 4.Admin ");
        n = Integer.parseInt(scanner.nextLine());
        switch (n)
        {

            case 1:
                for ( int a= 0; a< Watchmans.size();a++){
                    System.out.println("For the Watchman is: " + Watchmans.get(a).Watchman());
                }
                break;

            case 2:
                for ( int b= 0; b<Cleaningstaffs.size();b++){
                    System.out.println("For the CleaningStaff is: " + Cleaningstaffs.get(b).Cleaningstaff());
                }
                break;


            case 3:
                for ( int c= 0; c<Accountants.size();c++){
                    System.out.println("The name of the Accountant is: " + Accountants.get(c).Accountant());
                }
                break;

            case 4:
                for ( int d= 0; d<Admins.size();d++){
                    System.out.println("The name of the Admin is: " + Admins.get(d).Admin());
                }
                break;

        }

    }
}
