public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2021);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        Notebook oldNotebook = new Notebook(1600, 500, 2018);
        Notebook cheapNotebook = new Notebook(1700, 1400, 2022);
        Notebook cheapAndNewNotebook = new Notebook(1000, 600, 2022);

        notebookParameters(notebook);
        notebookParameters(heavyNotebook);
        notebookParameters(oldNotebook);
        notebookParameters(cheapNotebook);
        notebookParameters(cheapAndNewNotebook);

        Book book = new Book("gggg", "hkj");
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.drawNumbers();
    }

    private static void notebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
    }
}