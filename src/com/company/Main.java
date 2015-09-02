package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Tree<Integer> tree=new Tree<Integer>();
        Random rnd=new Random();
        for(int i=0;i<10;++i)
        {
            tree.Add(rnd.nextInt(100));
        }
        tree.printAll();
    }
}
