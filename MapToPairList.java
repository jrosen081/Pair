
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackrosen
 */
public class MapToPairList{

    /**
     * Changes a Map to a List of Pairs
     * @param <X> The first Generic type
     * @param <Y> The second Generic type
     * @param mapToChange The map that will be converted to a List of pairs
     * @return A list of Pair objects
     */
    public static <X extends Comparable<X>, Y extends Comparable<Y>> List<Pair<X,Y>> execute(Map<X,Y> mapToChange) {
        List<Pair<X,Y>> list = new ArrayList<>();
        mapToChange.keySet().forEach(key -> list.add(new Pair<>(key, mapToChange.get(key))));
        return list;
    }
}
