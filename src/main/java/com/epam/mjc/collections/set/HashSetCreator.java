package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet <Integer> vivod = new HashSet<>();
        for (int s: sourceList){
            if(s%2==0){
                vivod.add(s);
                int s1 = s/2;

                while (s1%2==0){
                    int s2= s1;
                    vivod.add(s2);
                    vivod.add(s2/2);
                    s1=s2/2;}}
                else if (s%2!=0){
                    vivod.add(s);
                    vivod.add(s*2);}
}
        return vivod;
    }}
