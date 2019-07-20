/*
Dependency graph resolution.
    Given an array of dependencies:
    a -> [b,c]
    b -> [d]
    d -> [c]
    c -> []
    e -> []
    Print out in what order these dependencies will be resolved.
    Expected result:
    c, d, b, a,
    e
*/

package problems;

import java.util.*;

class DependencyResolution {

    void printDependencyOrder_Iterative(HashMap<Character, List<Character>> map) {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> visitedSet = new HashSet<>();

        for(Character key : map.keySet()) {
            stack.push(key);
            printDependencies_Iterative(map, stack, visitedSet);
        }
    }

    void printDependencies_Iterative(HashMap<Character, List<Character>> map, Stack<Character> stack, HashSet<Character> visitedSet) {

        while(!stack.isEmpty()) {
            char key = stack.peek();

            List<Character> dependencies = map.get(key);

            if(!dependencies.isEmpty() && !visitedSet.contains(key)) {
                for(Character dependency : dependencies) {
                    stack.push(dependency);
                }
                continue;
            }

            if(!visitedSet.contains(key)) {
                System.out.println(stack.pop());
                visitedSet.add(key);
            }
        }
    }

    void printDependencyOrder(HashMap<Character, List<Character>> map) {
        HashSet<Character> visitedSet = new HashSet<>();

        for(Character key : map.keySet()) {
            if(visitedSet.contains(key)){
                continue;
            }
            printDependencies(key, map, visitedSet);
            System.out.println();
        }
    }


    void printDependencies(Character key, HashMap<Character, List<Character>> map, HashSet<Character> visitedSet) {
        if(visitedSet.contains(key)){
            return;
        }

        visitedSet.add(key);
        List<Character> dependencies = map.get(key);

        for(Character dependency : dependencies) {
            printDependencies(dependency, map, visitedSet);
        }

        System.out.print(key);
        System.out.print(',');
    }

    public static void main(String[] args) {
        HashMap<Character, List<Character>> map = new HashMap<>();

        map.put('a', Arrays.asList('b', 'c'));
        map.put('b', Arrays.asList('d'));
        map.put('d', Arrays.asList('c'));
        map.put('c', Arrays.asList());
        map.put('e', Arrays.asList());

        DependencyResolution dr = new DependencyResolution();
//        dr.printDependencyOrder(map);
        dr.printDependencyOrder_Iterative(map);
    }
}


