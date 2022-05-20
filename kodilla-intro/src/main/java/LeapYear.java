public class LeapYear {

    public static void main(String[] args) {
        int yearInQuestion = 1900;
        int reminderOfDivision4 = yearInQuestion%4;
        int reminderOfDivision100 = yearInQuestion%100;
        int reminderOfDivision400 = yearInQuestion%400;
        boolean result;

        System.out.println(yearInQuestion);
        System.out.println(reminderOfDivision4);
        System.out.println(reminderOfDivision100);
        System.out.println(reminderOfDivision400);


        if (reminderOfDivision4 != 0){
            result = false;
        } else if (reminderOfDivision4 == 0 && reminderOfDivision100 != 0) {
            result = true;
        } else if (reminderOfDivision4 == 0 && reminderOfDivision100 == 0 && reminderOfDivision400 ==0) {
            result = true;
        } else {
            result = false;
        }

        System.out.println(result);

    }
}