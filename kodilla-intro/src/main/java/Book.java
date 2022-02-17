public class Book {
    private String author;
    private String title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public static Book of (String author, String title) {
        return new Book (author, title);
    }


}

//    W klasie Book powinna istnieć statyczna metoda of, która przyjmuje dwa Stringi.
//        Następnie, wewnątrz tej metody powinnaś utworzyć obiekt typu Book z wykorzystaniem przekazanych Stringów,
//        Na samym końcu zwróć utworzony obiekt