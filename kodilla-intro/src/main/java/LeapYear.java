import jdk.internal.module.SystemModuleFinders;

public class LeapYear {
    int year;
    boolean isTrue;

    public static void main(String[] args) {

        LeapYear thisYear = new LeapYear(2020);
        LeapYear olderYear = new LeapYear(2015);
        LeapYear youngerYear = new LeapYear(2021);
        System.out.println(thisYear.main());
        System.out.println(olderYear.main());
        System.out.println(youngerYear.main());
    }

    public LeapYear (int year){
        this.year = year;
    }

    public boolean main() {
        if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0) {
            return isTrue = true;
        } else {
            return  isTrue= false;
        }
    }
}

