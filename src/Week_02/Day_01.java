package Week_02;

public class Day_01 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 100;

        int result = num1 + num2;
        System.out.println("num1 + num2 = " + result);

        // 클래스 생성자 정의
        Test test = new Test();

        // Setter 메소드를 이용해 Test 클래스의 num1 멤버 변수 초기화
        test.setNum(1);
        System.out.println("test.getNum() = " + test.getNum());

        // Test 클래스의 지역 변수(상수) talk을 return하는 method2 호출
        System.out.println("test.method2() = " + test.method2());

        // Day_01 클래스의 num1 변수 초기화
        num1 = 0;
        // Test 클래스의 메소드 정의
        boolean check = test.method1(num1);
        System.out.println("test.method1(" + num1 + ") = " + check);


    }

    // 클래스 선언
    public static class Test {
        private int num;
        public boolean check;
        final private String talk = "hello world";

        public boolean method1(int num) {
            if (num == 0)
                check = true;
            return check;
        }

        public String method2() {
            return talk;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getTalk() {
            return talk;
        }
    }
}
