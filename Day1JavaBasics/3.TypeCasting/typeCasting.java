public class typeCasting {
    public static void main(String[] args) {
        // There are 2 type of casting: Widening Casting and Narrowing Casting

        // Widening casting(Happening automaticall): byte -> short -> char -> int -> long -> float -> double
        int num1 = 0;
        long num2 = num1;
        System.out.println("Num 1:" + num1 + ", Num 2: "+ num2);

        // Narrowing Casting(Has to be done manually): double -> float -> long -> int -> char -> short -> byte
    }
}
