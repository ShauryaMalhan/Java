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
        //-ve of a number in binary form:
        //  1) first bit represent the sign of the number
        //  2) to calculate -ve of a binary number we calculate two's compliment.
        //  Range of binary number is from -128 to 127
        
        int a = 10;
        System.out.println(a << 1);
    }
}