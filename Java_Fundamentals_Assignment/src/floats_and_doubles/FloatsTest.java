package floats_and_doubles;

public class FloatsTest {
    public static void main(String[] args) {
        float fTest = 14f;
        System.out.println(fTest);

        fTest = Float.MAX_VALUE;
        System.out.println(fTest);

        fTest = Float.MIN_VALUE;
        System.out.println(fTest);

        fTest = 0.1234567899f;
        System.out.println(fTest);
        // as you can see, the float rounds to the 8th decimal in this case

        /*
        -The reason why the double excludes after 7-8 spaces is that it is a 32-bit data type, after which it loses precision
        -According to my reading, one bit is stored for the sign
        -8 bits are stored for the exponent
        -23 bits are stored for the mantissa
         */
    }
}
