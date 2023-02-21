package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
    HashSet<String> combinationWithTree = new HashSet<>();
        combinationWithTree.addAll(thirdSet);
        combinationWithTree.addAll(firstSet);
        combinationWithTree.addAll(secondSet);
        combinationWithTree.removeAll(secondSet);
        combinationWithTree.removeAll(firstSet);
        Set<String> combination = new HashSet<>();
        combination.addAll(firstSet);
        combination.addAll(secondSet);
        combination.addAll(thirdSet);
        combination.removeAll(thirdSet);
        combination.retainAll(secondSet);
        combination.retainAll(firstSet);
        combination.addAll(combinationWithTree);



        return combination;
    }
}
