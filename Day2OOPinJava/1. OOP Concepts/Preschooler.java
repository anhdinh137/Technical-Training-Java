class Preschooler extends Student {
    // polymorphism allows the same method or object to behave differently based on the context,
    // specially on the project's actual runtime class.
    int behaviourScore;
    // This is method overloading: more than one method share the same name with different signature(Parameters) in a class.
    // The return type of these methods can or cannot be same.
    public Preschooler(int id, String name, float grade, int behaviourScore) {
        super(id, name, grade);
        this.behaviourScore = behaviourScore;
    }
    
    public Preschooler(int id, String name, float grade) {
        super(id, name, grade); 
    }


    public int getBehaviourScore() {
        return behaviourScore;
    }
    public void setBehaviourScore(int behaviourScore) {
        this.behaviourScore = behaviourScore;
    }

    public void myBehavior(){
        if (behaviourScore > 50){
            System.out.println("Good");
        }
        else if (behaviourScore <=50){
            System.out.println("bad");
        }
    }

    // Method overriding:  method in the child class has the same name, return-type and parameters as in parent class
    // The child class provides the implementation in the method already written.
    @Override
    public void status(){
        System.out.println("preschooler");
    }
    
}       
