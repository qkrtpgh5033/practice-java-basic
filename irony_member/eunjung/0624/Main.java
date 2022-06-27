// 문제 : 자동차 설계도를 만들어주세요.
// 문제 : 자동차 객체를 만들고 변수에 담아주세요.
// 문제 : 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.


public class Main {
    public static void main(String[] args) {
        // 구현시작
        Car a자동차1 = new Car();
        Car a자동차2 = new Car();

        a자동차1.maxSpeed = 230;
        a자동차2.maxSpeed = 210;
        // 구현끝

        a자동차1.달리다();
        // 출력 => 자동차가 최고속력 230km로 달립니다.

        a자동차2.달리다();
        // 출력 => 자동차가 최고속력 210km로 달립니다.
    }
}

class Car {
    int maxSpeed;

    void 달리다 () {
        System.out.println("자동차가 최고속력 " + this.maxSpeed + "km 로 달립니다.");
    }
}

