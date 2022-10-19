package homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BinaryTreeDemo {

    public static void main(String[] args) {
        //binaryTreeDemo();
        //javaSet();
        task();

    }

    private static void task() {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.add(8);
        tree.add(3);
        tree.add(1);
        tree.add(6);
        tree.add(4);
        tree.add(7);
        tree.add(10);
        tree.add(14);
        tree.add(13);

        BinaryTree<Integer> tree1 = new BinaryTree<>();


       tree1.add(2);
       tree1.add(1);
       tree1.add(3);

        System.out.println(tree.isBalanced());
        System.out.println(tree1.isBalanced());
    }

    private static void binaryTreeDemo() {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.add(8);
        tree.add(3);
        tree.add(1);
        tree.add(6);
        tree.add(4);
        tree.add(7);
        tree.add(10);
        tree.add(14);
        tree.add(13);

        tree.dfs(System.out::println);

        List<Integer> integers = new ArrayList<>();
        tree.dfs(integers::add);
        System.out.println(integers);
    }

    static void javaSet() {
        TreeSet<MyClass> set = new TreeSet<>((a1, a2) -> Integer.compare(a1.hashCode(), a2.hashCode()));
//        TreeSet<MyClass> set = new TreeSet<>();
        set.add(new MyClass());
    }

    private static class MyClass {

    }


}
