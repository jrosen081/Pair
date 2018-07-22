# Pair
This is a Java library in which you can do a Pair matching. This is similar to a 2-sized Tuple. This can be used for many reasons, such as filtering through paired data.

# How to use:

```java
  List<Pair<Integer,String>> list = new ArrayList();
  list.add(new Pair<>(7, "Test 1"));
  list.add(new Pair<>(3, "Test 2"));
  list.stream().filter(pair -> pair.first == 3); //Pair<>(3, "Test 2")
  list.stream().map(pair -> pair.first + " " + pair.second).forEach(System.out::println); //Prints out all of the pairs
  list.stream().sorted(); //Pair<>(3, "Test 2"), Pair<>(7, "Test 1")
  ```
 
## Features:
1. Comparable
2. Defined value for both
3. Can put it into a list, unlike Mapped Elements
4. Usable with Stream API within a List
5. Inferred Type After the first declaration
6. Can use any type for it since it uses generics
