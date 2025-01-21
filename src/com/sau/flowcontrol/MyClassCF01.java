package com.sau.flowcontrol;

public class MyClassCF01 {
    //Control Flow/Control Statement
    //group1 Selection/Condition (if , if-else , if-else-if , switch-case)
    public static void main(String[] args) {
        //พิสูจนครั่งเดียวจริงทำ เท็จไม่ทำ : if
        int a = 50;
        if (a > 35) {
            System.out.println("Hello...");
        }
        System.out.println("--------------");
        //พิสูจนครั่งเดียวจริงทำ เท็จก็กำ : if-else
        String b ="xyz";
        if (b.equals("SAU")){
            System.out.println("Southeast Asia University");
        }else{
            System.out.println("No no no....");
        }
        System.out.println("--------------");

    }
}
