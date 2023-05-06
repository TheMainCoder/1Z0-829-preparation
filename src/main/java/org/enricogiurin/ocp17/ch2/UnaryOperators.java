package org.enricogiurin.ocp17.ch2;

public class UnaryOperators {
    public static void main(String[] args) {
        //new UnaryOperators().bitwise();
        new UnaryOperators().prePostIncrement();
    }

    void bitwise(){
        int x = 7; //binary 0111
        int bwX = ~x; //1000
        System.out.println(bwX);  //-8
        String bwXAsAsAString = Integer.toBinaryString(bwX);
        System.out.println(bwXAsAsAString); //11111111111111111111111111111000
    }

    void prePostIncrement(){
        int x = 7, y=10;
        System.out.println("pre: "+ ++x + " - post: "+ y++);  //8 - 10
    }
}