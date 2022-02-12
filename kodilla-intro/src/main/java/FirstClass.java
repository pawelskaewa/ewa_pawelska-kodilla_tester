public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2021);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2018);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        Notebook cheapNotebook = new Notebook(1700, 1400, 2022);
        System.out.println(cheapNotebook.weight + " " + cheapNotebook.price + " " + cheapNotebook.year);
        cheapNotebook.checkPrice();
        cheapNotebook.checkWeight();
        cheapNotebook.checkYear();

        Notebook cheapAndNewNotebook = new Notebook(1000, 600, 2022);
        System.out.println(cheapAndNewNotebook.weight + " " + cheapAndNewNotebook.price + " " + cheapAndNewNotebook.year);
        cheapAndNewNotebook.checkPrice();
        cheapAndNewNotebook.checkWeight();
        cheapAndNewNotebook.checkYear();

    }
}