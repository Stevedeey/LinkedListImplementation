package com.tosin.firstImplementation;

public class Maskify {
    public static void main(String[] args) {
        String str = "1234567890";
        String four = "1234";
        System.out.println( maskify2(str));


    }

    public static String maskify(String str){
        String data = "";
        for (int i = 0; i < str.length() - 4; i++) {
            data+=str.charAt(i);
        }
        if(str.length() <=4) return str;
        String repeat = "#".repeat(data.length());
        String fourL = str.substring(data.length());
        return  repeat+fourL;
    }

    
    public static String maskify2(String str){
        if(str.length() <=4 )return str;
        return "#".repeat(str.length()-4)+str.substring(str.length()-4);

    }
}
