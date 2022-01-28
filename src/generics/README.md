```java
package generics;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Claim");
        list.add("John");
        list.add("Dutch");
        list.add("Micah");
        list.add(123);

        for (String n : list) {} // Так нельзя, ведь тип может быть не только String

        for (Object o : list) {
            System.out.println(o + ", length: " + ((String)o).length()); // Exception
        }
        
    }
}
```
Поэтому нужны Generics
```java
public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Claim");
        list.add("John");
        list.add("Dutch");
        list.add("Micah");

        for (String n : list) {
            System.out.println(n);
        }

    }
}
```