public class loopControl {
    // There are 3 loop: While, for, Do...While
    // continue: continue running the loop, but skip the current iteration
    public static void main(String[] args) {
        for (int i = 0; i< 5; i++){
            if (i == 2) continue;
            System.out.println(i);
    }

    int i = 4;
    // break: break out of the loop completely
    while (true){
        if (i == 0) break;
        System.out.println("Not 10");
        i--;
    }
    }
}
