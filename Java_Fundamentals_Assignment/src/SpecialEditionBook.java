/*
Create a class Book with the data members bno,bname,price.

Create a class SpecialEditionBook which is subclass of Book and with a data member

discount. Create a class BookTest with main() to test the above classes

Note

- Use constructors to give the values to the data members

- create a method display() in Book class which displays bno,bname and price

and override the same display() of Book class in SpecialEditionBook which displays

bno,bname,price using super.display() and display the value of discount.
 */
public class SpecialEditionBook extends Book{
    private int bno;
    private String bname;
    private int price;
    private int discount;

    public SpecialEditionBook(int bno, String bname, int price) {
        super(bno,bname,price);
    }

    public SpecialEditionBook(int bno, String bname, int price,int discount) {
        super(bno,bname,price);
        this.discount = discount;
    }

    public void display(){
        super.display();
        System.out.println("discount: "+discount);
    }
}
