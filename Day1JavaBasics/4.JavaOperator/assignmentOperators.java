public class assignmentOperators {
    public static void main(String[] args) {
        // Arithmatic assignment operators: +=, -=, *=, /=, %=, =
        int i = 5;
        System.out.println(i);
        i += 3;
        System.out.println(i);
        i -= 4;
        System.out.println(i);
        i *= 2;
        System.out.println(i);
        i /= 3;
        System.out.println(i);
        i %= 2;
        System.out.println(i);
        System.out.println();
        // Bitwise operators: &=, |=, ^=,
        int o = 6; // 110
        int a = 3; // 011
        System.out.println(o&=a); // 010 -> 2
        o = 6;
        System.out.println(o|=a); // 111 -> 7
        o = 6;
        System.out.println(o^=a); // 101 -> 5
        o = 6;
        // Shift operators >>=, <<=
        System.out.println(o>>=a); // 000 -> 3
        o =6;
        System.out.println( o<<=a); // 110000 -> 48
        // Bitwise and operators is normally not used very much, at least according to my experience
    }
}
