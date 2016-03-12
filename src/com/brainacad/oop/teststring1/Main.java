package com.brainacad.oop.teststring1;

public class Main {
    public static void main(String[] args) {
       //2.9.1
        String Str = new String("abracadabra1");
        System.out.println(Str.indexOf("ra"));
        System.out.println(Str.lastIndexOf("ra"));
        System.out.println(Str.substring(3, 7));
        System.out.println(reverseString(Str));//method is described lower


        //2.9.2
        String str1 = "Cartoon";
        String str2 = "Tomcat";
        char [] array = str1.toCharArray();
        for (char N: array ) {
         if(str2.indexOf(N)==-1 ){System.out.print(N);}}
    }

    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        char[] arr2 = new char[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[arr.length - i - 1] = arr[i]; }
        return new String(arr2); }}