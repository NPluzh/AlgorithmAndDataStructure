package homework5;

public class Thing {
    private static ThingCollection things = new ThingCollection();
    private int weight;
    private int coast;

    public Thing(int weight, int coast) {
        this.weight = weight;
        this.coast = coast;
        things.add(this);
    }

    public int getWeight() {
        return weight;
    }

    public int getCoast() {
        return coast;
    }

    public static void showThings() {
        for (Thing thing: things.getList()) {
            System.out.printf("[p = %d, q = %d] ", thing.weight, thing.coast);
        }
    }

    public static int randWeight(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int randCoast(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void generateThings(int num) {
        for (int i = 0; i < num; i++) {
            new Thing(randWeight(1, 5), randCoast(1, 3));//генерация новой вещи
        }
    }

    public static int getWeightSum() {
        int sum = 0;
        for (Thing thing:things.getList()) {
            sum+=thing.weight;
        }
        return sum;
    }

    public static int getCoastSum() {
        int sum = 0;
        for (Thing thing:things.getList()) {
            sum+=thing.coast;
        }
        return sum;
    }

    public static ThingCollection getCurrentThings(){
        return things;
    }


}
