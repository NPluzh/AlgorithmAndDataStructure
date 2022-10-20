package homework5;

import java.util.List;

public class BagProblem {//не сделал
    public static void main(String[] args) {
       Thing.generateThings(10);
       Thing.showThings();

    }

    public static ThingCollection getOptimalSet(){
        return Thing.getCurrentThings();
    }
}
