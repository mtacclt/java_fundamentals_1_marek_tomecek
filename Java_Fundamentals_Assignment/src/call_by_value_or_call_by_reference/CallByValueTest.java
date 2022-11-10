package call_by_value_or_call_by_reference;

public class CallByValueTest {
    int data=50;

    void change(int data){
        data=data+100;
    }

    public static void main(String[] args){
        CallByValueTest op=new CallByValueTest();

        System.out.println("before change "+op.data);
        op.change(500);
        System.out.println("after change "+op.data);

    }

    /*
    The short and long of this class is that we have created a variable called data with value 50
    this 50 is a value that has remained unchanged during the running of the code. You may notice we
    have used the method change() to change the data value, but it remains the same. The reason for this
    is that we pass a copy of the value into the method, instead of its reference to memory. What this means
    is that the original value is secured, and we work with the copy during the running of the change()
    method. This is referred to as call by value.
     */
}
