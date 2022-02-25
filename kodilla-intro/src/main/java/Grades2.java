public class Grades2 {
    public static void main(String[] args) {

        Grades gradesAdam = new Grades ();
        gradesAdam.add(1);
        gradesAdam.add(5);
        gradesAdam.add(5);
        gradesAdam.add(4);
        gradesAdam.add(1);
        gradesAdam.add(2);
        gradesAdam.add(1);
        gradesAdam.add(5);
        gradesAdam.add(4);
        gradesAdam.add(5);

        int lastGrade = gradesAdam.getLastGrade();
        System.out.println(lastGrade);

        double averageGrade = gradesAdam.getAverage();
        System.out.println(averageGrade);
    }
}