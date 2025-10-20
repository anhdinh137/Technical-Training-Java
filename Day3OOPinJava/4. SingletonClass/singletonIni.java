public class singletonIni {
    public static void main(String[] args) {
        // if we try to instantiate the Java Singleton classes, the new variable also points to the first instance created.
        singletonClass s1 = singletonClass.getInstance();
        singletonClass s2 = singletonClass.getInstance();
        singletonClass s3 = singletonClass.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        // print the same address in memory for all s1, s2, s3
    }
}
