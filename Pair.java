

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jack Rosen
 * @param <X>
 * @param <Y>
 */
public class Pair <X extends Comparable <X>,Y extends Comparable <Y>> implements Comparable<Pair<X,Y>>{
    public X first;
    public Y second;
    public Pair (X first, Y second){
        this.first = first;
        this.second = second;
    }
    /**
     * Prints out the info
     */
    public void printOut(){
        System.out.println(first + ", " + second);
    }
    /**
     * Compares two Pairs
     * Compares the first ones and then the second if the first are the same
     * @param other The Pair object to test with
     * @return Integer based on the comparison
     */
    @Override
    public int compareTo(Pair<X, Y> other){
        int c = this.first.compareTo(other.first);
        return c != 0 ? c : this.second.compareTo(other.second);
    }
    /**
     * Compare the two pairs
     * @param other The Pair object to test with
     * @return A boolean if they are equal
     */
    public boolean equals(Pair<X,Y> other){
        return first.equals(other.first) && second.equals(other.second);
    }
    /**
     * Swaps the values to return the second value first
     * @return A swapped pair
     */
    public Pair<Y,X> swap() {
        return new Pair<>(second, first);
    }
}
