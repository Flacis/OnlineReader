public class Book {
    String name;
    Author author;
    int releaseDate;
    int pages;
    int maxPagesNumbers;

    public Book(String name, Author author, int releaseDate, int pages) {
        this.name = name;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        maxPagesNumbers = Math.max(maxPagesNumbers, pages);
    }

    public String toString() {
        return "Название: " + name + "\n" +
                "Автор: " + "\n" + author + "\n" +
                "Релиз: " + releaseDate + "\n" +
                "Число страниц: " + pages + "\n";
    }

    public String compareBook(Book book1) {
        if (pages > book1.pages) {
            return "В первой книге страниц больше";
        } else if (pages < book1.pages) {
            return "Во второй книге страниц больше";
        } else {
            return "Книги равны";
        }
    }
}
