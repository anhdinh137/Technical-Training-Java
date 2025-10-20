public class enums {
    // Enumerations (enums) are a special type used to define a group of named constants
    enum weekDay{
        MONDAY {
            // You can add method to each constants in enums
            public int getInt(){
                return 1;
            }
        }, TUESDAY{
            public int getInt(){
                return 1;
            }
        }, WEDNESDAY{
            public int getInt(){
                return 1;
            }
        }, THURSDAY{
            public int getInt(){
                return 1;
            }
        }, FRIDAY{
            public int getInt(){
                return 1;
            }
        }, SATURDAY{
            public int getInt(){
                return 1;
            }
        }, SUNDAY{public int getInt(){
                return 1;
            }};
        
        private weekDay(){
            System.out.println("Current day: "+ this);
        }

        public void output(){
            System.out.println("the day is "+ this);
        }
        // Enums can declare abstract methods that each constant must implement.
        public abstract int getInt();
    }
    // Class Type: Internally implemented as a class.
    // Enum Constants: Each constant is an object of the enum type.
    // Switch Support: Can be used in switch statements.
    // Implicit Modifiers: Constants are public static final.
    // Inheritance: Enums cannot extend classes but can implement interfaces.
    public static void main(String[] args) {
        weekDay w1 = weekDay.FRIDAY;
        
        w1.output();

        for (weekDay wd: weekDay.values()){
            System.out.println(wd);
        }
    }
}
