package Week_02;

import java.util.HashMap;
import java.util.Map;

public class TypeInference_varType {
    public static void main(String[] args) {
        // 일반적으로 데이터 타입을 선언한 변수
        String str1 = "Good Bye, Java 9";

        // 데이터 타입을 선언하지 않은 var 타입 변수
        var str2 = "Hello, Java 10";
        System.out.println("str1은 문자열 타입 데이터인가? = " + str1 instanceof String);
        System.out.println("str1 = " + str1);
        System.out.println("str2은 문자열 타입 데이터인가? = " + str2 instanceof String);
        System.out.println("str2 = " + str2);

        // 일반적은 HashMap 선언
        Map<Integer, String> map1 = new HashMap<>();
        // var를 이용한 HashMap 선언
        var map2 = new HashMap<Integer, String>();
        map1.put(1, "신짱구");
        map2.put(1, "신짱아");

        System.out.println("map1 = " + map1.get(1));
        System.out.println("map2 = " + map2.get(1));
        int a = 10;
        int b = 3;
        double result = (double)a / b;
        System.out.println(result);
    }
}
