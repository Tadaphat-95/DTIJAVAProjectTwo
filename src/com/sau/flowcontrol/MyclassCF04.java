package com.sau.flowcontrol;

public class MyclassCF04 {
    //break and continue in loop
    //break ใน loop ทำงานเมื่อไรจบเลย
    //continue ใน loop ทำงานเมื่อไหร่จบเลย แล้วไปรอบต่อไป
    public static void main(String[] args) {
        //break
        for (int k =1 ; k <= 5; k = k+1){
            if (k == 3){
                break;
            }
            System.out.println(k + " : Hoo...");
        }

        System.out.println("---------------");

        for (int k =1 ; k <= 5; k = k+1){
            if (k == 3){
                continue;
            }
            System.out.println(k + " : Hey...");
        }




    }
}
