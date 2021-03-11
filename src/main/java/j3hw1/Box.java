package j3hw1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {

    private ArrayList<T> list;

    public Box(T... fruits) {
       this.list= new ArrayList<T>(Arrays.asList(fruits));
    }

    public void addFruit(T fruits) {
        list.add(fruits);
    }

    public float getBoxWeight () {
        float w=0.0f;
        if (list.size()>0) {
            w=list.size()*list.get(0).getWeight();
                 } else {
          System.out.println("Ящик пуст");
        }
        return w;
    }

    public boolean compare (Box<?> another) {
        return Math.abs(this.getBoxWeight()-another.getBoxWeight()) <0.000001f;
    }

    public void transfer (Box<? super T> anotherBox) {
        anotherBox.list.addAll(this.list);
        this.list.clear();
    }
}
