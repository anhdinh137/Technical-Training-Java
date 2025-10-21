public class singletonClass {
    // A Java singleton class is a class that can only have one object(an instance of the class) at a time
    private static singletonClass singleton = new singletonClass();
    // the singleton instance is static, so it is shared among its instances
    private singletonClass(){};

    public static synchronized singletonClass getInstance(){
        if (singleton == null){
            singleton = new singletonClass();
        }
        return singleton;
    }


}
