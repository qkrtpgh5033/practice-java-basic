package lionStudy.lionStudy.repository;

class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        a사람인력관리소.add사람("가나다", 100);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        a사람인력관리소.add사람("박범서", 25);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.

        사람 a사람4  = a사람인력관리소.get사람(4);
        a사람4.자기소개();

        사람 a사람5  = a사람인력관리소.get사람(5);
        a사람5.자기소개();
    }
}

class 사람인력관리소 {
    int cnt;
    사람 a사람;
    사람 head사람;

    public void add사람(String name, int age){
        cnt++;
        사람 add사람;
        if(cnt == 1){
            head사람 = new 사람(name, age, cnt);
            a사람 = head사람;

        }
        else if (cnt >= 2){
            a사람 = head사람;
            사람 r사람 = new 사람(name, age, cnt);

            while(a사람.next사람 != null){
                a사람 = a사람.next사람;
            }

            a사람.next사람 = r사람;
        }
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        System.out.println("나이가 " + age+"살인 " +cnt+"번째 사람("+name+")이 추가되었습니다.");
    }

    public 사람 get사람(int primaryNumber){
        a사람 = head사람;
        while(a사람.primaryNumber != primaryNumber){
            a사람 = a사람.next사람;
        }
        return a사람;
    }

}
class 사람 {
    사람 next사람;
    int primaryNumber;
    String name;
    int age;
    public 사람(String name, int age, int primaryNumber){
        this.name = name;
        this.age = age;
        this.primaryNumber = primaryNumber;
    }

    public void 자기소개(){
        System.out.println("저는 " + primaryNumber +"번, " + name +", " + age+"살 입니다.");
        // 저는 1번, 홍길순, 33살 입니다.
    }

}