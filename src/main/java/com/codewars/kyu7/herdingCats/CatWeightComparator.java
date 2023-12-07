package com.codewars.kyu7.herdingCats;

import java.util.Comparator;

/**
 * In this kata, you will be creating a Java Comparator to sort cats by their weight.
 * <p>
 * The Cat class is preloaded for you., and its signature is given below:
 * <p>
 * public class Cat implements Comparable&lt;Cat&gt; {<br/>
 * public String name;<br/>
 * public double weight;<br/>
 * public Cat(String name, double weight);<br/>
 * <p>
 * &#64;Override public int compareTo(Cat c);<br/>
 * &#64;Override public boolean equals(Object o);<br/>
 * }
 * <p>
 * In the tests, an array of cats will be populated, and then sorted using Arrays.sort(). By default, this will sort
 * the cats by their names. Your job is to complete the implementation of CatWeightComparator so that the cats are
 * sorted by weight.
 * <p>
 * You may assume that no two cats have the same name.
 * <p>
 * For more information about Arrays, take a look at <a href="http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html">http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html</a>.
 * <p>
 * For more information about Comparable&lt;T&gt;, see <a href="http://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html">http://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html</a>.
 * <p>
 * For more information about Comparator&lt;T&gt;, <a href="http://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html">check out http://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html</a>.
 */
public class CatWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Double.compare(cat1.weight, cat2.weight);
    }
}
