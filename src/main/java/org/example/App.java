package org.example;

import org.example.connectivity.QuickFind;
import org.example.connectivity.QuickUnion;
import org.example.connectivity.WeightedPathCompressionQuickUnion;
import org.example.connectivity.WeightedQuickUnion;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        WeightedPathCompressionQuickUnion qu = new WeightedPathCompressionQuickUnion(10);
        qu.union(3,5);
        System.out.println(Arrays.toString(qu.getComponents()));
        System.out.println(qu.connected(3,5));
    }
}
