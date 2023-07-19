package mathsfordsa;

public class bitmanupilation {
    public static void main(String[] args) {
        //When you and any number with 1, digits remain the same.
        //when you or any number with 0, digits remain the same.
        //XOR == ^
        //Any a ^ 1 == `(a)
        //Complement == ~
        //Left Shift Operator == <<
        //IMPORTANT NOTE: left shift by 1 will double the operator and so on or if a << b == a*2^b;
        //Right Shift Operator == >>
        //IMPORTANT NOTE: Right shift by 1 will half the operator and so on or if a >> b == a/2^b;
        int a = 10;
        System.out.println(a << 1);
    }
}