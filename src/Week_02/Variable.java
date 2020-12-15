package Week_02;

public class Day_01 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 100;

        int result = num1 + num2;
        System.out.println("num1 + num2 = " + result);

        // MemberVar 클래스 생성자 정의
        MemberVar test = new MemberVar();

        // Setter 메소드를 이용해 Test 클래스의 num1 멤버 변수 초기화
        test.setNum(1);
        System.out.println("test.getNum() = " + test.getNum());

        // Test 클래스의 지역 변수(상수) talk을 return하는 method2 호출
        System.out.println("test.method2() = " + test.talk);

        // Day_01 클래스의 num1 변수 초기화
        num1 = 0;
        // Test 클래스의 메소드 정의
        boolean check = test.method1(num1);
        System.out.println("test.method1(" + num1 + ") = " + check);

        // MethodVar 클래스 생성자 정의
        MethodVar test2 = new MethodVar();

        // 지역 변수 테스트
        int method1 = test2.method1();
        // static 변수 메소드 내에서 초기화 후 테스트
        int method2 = test2.method2();
        System.out.println("test2.method1() = " + method1);
        System.out.println("test2.method2() = " + method2);
    }

    // 클래스 선언
    public static class MemberVar {
        private int num;
        public boolean check;
        final private String talk = "hello world";

        public boolean method1(int num) {
            if (num == 0)
                check = true;
            return check;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }

    public static class MethodVar {
        public int num1;

        public int method1() {
            int num1 = 10;
            int num2 = 11;
            return num1 + num2;
        }

        public int method2() {
            num1 = 20; // 멤버 변수 초기화

            // num1을 같은 이름의 새로운 변수로 선언하면 새로 선언된 변수의 데이터가 반환된다.
//            int num1 = 10;
            return num1;
        }
    }
}
