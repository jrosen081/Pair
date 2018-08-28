# Pair
This is a Java library in which you can do a Pair matching. This is similar to a 2-sized Tuple. This can be used for many reasons, such as filtering through paired data.

# How to use:

```java
  /* Usage of Pairs */
  List<Pair<Integer,String>> list = new ArrayList();
  list.add(new Pair<>(7, "Test 1"));
  list.add(new Pair<>(3, "Test 2"));
  list.stream().filter(pair -> pair.first == 3); //Pair<>(3, "Test 2")
  list.stream().map(pair -> pair.first + " " + pair.second).forEach(System.out::println); //Prints out all of the pairs
  list.stream().sorted(); //Pair<>(3, "Test 2"), Pair<>(7, "Test 1")
  Pair<Integer, String> swapPair = new Pair<>(12, "Swap");
  swapPair.swap().printOut(); //Prints out the pair, but with the String first
  
  /* Usage of Map To Pair */
  Map<Integer, String> testMap = new HashMap<>();
  testMap.put(7, "Test 1");
  testMap.put(3, "Test 2");
  MapToPairList.execute(testMap).forEach(Pair::printOut); //Converts the map to a list of pair objects
  ```
 
## Features:
1. Comparable
2. Defined value for both
3. Can put it into a list, unlike Mapped Elements
4. Usable with Stream API within a List
5. Inferred Type After the first declaration
6. Can use any type for it since it uses generics
7. Convertable from Map to List of Pairs
