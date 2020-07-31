package com.neusoft;

public class Main {

//    public static void main(String[] args) {
//	// write your code here
//        short s1 = 1;
//        s1 += 1;
//        System.out.println(s1);
//    }
public static void main(String[] args) {
    int i = 0,total = 0;
  do {
      i = i+2;
      System.out.println(i);
      total = total +(i++)*2;
  }while (i<12);
        System.out.println(total);
    }

}
