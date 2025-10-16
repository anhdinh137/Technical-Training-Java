public class primitive {
    public static void main(String[] args) {
        // Primitive: directly store the data in the variable
        // Stored on the stack
        // Typically 1 byte: true/false
        boolean boo = true;

        // Can use bytes/ short if memory is a constraint
        // 1 Byte, from -128 to 127
        byte by = 24;

        //2 Byte, from -32,768 to 32,767
        short sho = 1000;

        // 4 Byte -2,147,483,648 to 2,147,483,647
        int i = 2455;

        // Unicode character
        char ch = 'a';

        // 8 Bytes, used for very long number
        long lo  = 255;

        // 4 Bytes ~6-7 significant decimal digits, use 'f' as suffix
        float fl= 2342.3f;

        // 8 Bytes ~15-16 significant decimal digits
        double dou = 23.5433213124;

        System.out.println(boo);
        System.out.println(by);
        System.out.println(sho);
        System.out.println(i);
        System.out.println(ch);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(dou);

    }
}
