public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {

        return this.grades[size - 1];
    }

    public double getAverage() {

        double result = 0;
        for (int i = 0; i < size; i++) {
            result += this.grades[i];
        }

        return result / size;
    }


}