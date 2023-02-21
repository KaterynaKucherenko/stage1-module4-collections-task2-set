package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
Set <Integer> firstSet = new TreeSet<>();
for (int s: sourceList){
    int square = s*s;
    if (square<=upperBound && square>=lowerBound){
    firstSet.add(s*s);}}



    return  firstSet;
}}
