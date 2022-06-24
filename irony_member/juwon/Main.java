package com.exmaple.untitled1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(230);
        Car car2 = new Car(210);

        car1.run();
        car2.run();
    }
}

class Car {
    int maxSpeed;

    Car(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    void run(){
        String txt = String.format("자동차가 최고속력 %dkm로 달립니다.", this.maxSpeed);
        System.out.println(txt);
    }
}