# Generics
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
## Type erasure
Механизм, необходимый для обратной совместимости
```java
ArrayList<String> list1 = new ArrayList<>();
// Как видит JVM: ArrayList list1 = new ArrayList();
String o = list1.get(0);
// Как видит JVM: String o = (String)list1.get(0);
```
`String o =(String)list1.get(0)` тут сперва возвращается Object потом он кастится до
String и присваивается переменной
### Проблема overloading'а
```java
class Info<T> {
    public void abc(Info<String> info) {
        // ...
    }
    
    public void abc(Info<Integer> info) {
        // ...
    }
}
```

Ошибка, поскольку JVM видит два метода с одинаковой сигнатурой
`abc(Info info)`
### Проблема overriding'a 
```java
class Parent {
    public void abc(Info<String> info) {
        // ...
    }
}

class Child {
    public void abc(Info<Integer> info) {
        // ...
    }
}
```
Тоже будет ошибка, потому что при кастинге в подклассе могут возникнуть проблемы

### Пример type erasure с классом
```java
class X<T> {
    T value;

    public X(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
```
Теперь как видит JVM:
```java
class X {
    Object value;

    public X(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }
}
```
Пример с Subtyping:
```java
class X<T extends Number> {
    T value;

    public X(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
```
Как видит JVM:
```java
class X {
    Number value;

    public X(Number value) {
        this.value = value;
    }

    public Number getValue() {
        return this.value;
    }
}
```














