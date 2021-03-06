/*
 * Created on Jul 8, 2007
 *
 * Copyright (c) 2007, The JUNG Authors 
 *
 * All rights reserved.
 *
 * This software is open-source under the BSD license; see either
 * "license.txt" or
 * https://github.com/jrtom/jung/blob/master/LICENSE for a description.
 */
package edu.uci.ics.jung.algorithms.scoring.util;

/**
 * Convenience class for associating a vertex and an edge.  Used, for example,
 * in contexts in which it is necessary to know the origin for an edge traversal
 * (that is, the direction in which an (undirected) edge is being traversed).
 *
 * @param <V> the vertex type
 * @param <E> the edge type
 */
public class VEPair<V, E>
{
    private V v;
    private E e;
    
    /**
     * Creates an instance with the specified vertex and edge
     * @param v the vertex to add
     * @param e the edge to add
     */
    public VEPair(V v, E e)
    {
        if (v == null || e == null)
            throw new IllegalArgumentException("elements must be non-null");
        
        this.v = v;
        this.e = e;
    }
    
    /**
     * @return the vertex of this pair
     */
    public V getV()
    {
        return v;
    }
    
    /**
     * @return the edge of this pair
     */
    public E getE()
    {
        return e;
    }
}
