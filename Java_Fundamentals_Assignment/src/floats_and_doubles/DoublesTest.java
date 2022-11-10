package floats_and_doubles;

public class DoublesTest {
    public static void main(String[] args) {
        double dTest = 14d;
        System.out.println(dTest);

        dTest = Double.MAX_VALUE;
        System.out.println(dTest);

        dTest = Double.MIN_VALUE;
        System.out.println(dTest);

        dTest = 1.7976931348623157828d;
        System.out.println(dTest);

        /*
        -The reason why the double excludes after 15-16 spaces is that it is a 64-bit data type, after which it loses precision
        -According to my reading, one bit is stored for the sign
        -11 bits are stored for the exponent
        -52 bits are stored for the mantissa
         */

    }
}
