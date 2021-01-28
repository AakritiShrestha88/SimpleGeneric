

import java.util.*;

class Container<T>  {

    T values;
    public Container(T values) {
        this.values = values;
    }

    public Container() {

    }

    public T getValues() {
        return values;
    }

    public void setValues(T values) {
        this.values = values;
    }


}
public class GenericDemo {
    public static void main(String[] args) {

        Container<Integer> value2 = new Container<Integer>();
        Container<String> value1 = new Container<String>();

        value1.setValues("Aakriti");
        value2.setValues(6);

        System.out.println(value1.getValues());
        System.out.println(value2.getValues());


    }
}
