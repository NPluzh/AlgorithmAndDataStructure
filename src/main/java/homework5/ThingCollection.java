package homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThingCollection {
    private static List<Thing> things = new ArrayList<Thing>();

    public void add(Thing thing){
        things.add(thing);
    }


    public List<Thing> getList (){
        return things;
    }
}
