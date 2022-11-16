public class Main {
    public static void main(String[] args) {
    Book book = new Book(123,"basicbook",100);
    book.display();
    System.out.printf("%n");
    SpecialEditionBook bookSE = new SpecialEditionBook(321,"specialbook",200,55);
    bookSE.display();
    }
}