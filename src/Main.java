public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("[Война и Мир]", new Author("[Лев]", "[Толстой]", 1812), 1867, 960);
        Book book2 = new Book("[Робинзон Крузо]", new Author("[Даниель]", "[Дефо]", 1695), 1719, 230);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.compareBook(book2));
    }
}