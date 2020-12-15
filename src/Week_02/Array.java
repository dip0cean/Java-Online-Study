package Week_02;

public class Array {
    public static void main(String[] args) {
        // 1차원 배열
        // 배열 길이만 선언 -> 데이터는 선언하지 않음
        int[] arr1_1 = new int[5];

        // 길이만 선언된 배열에 데이터 삽입
        for (int i = 0; i < arr1_1.length; i++) {
            arr1_1[i] = i;
        }

        // 각 인덱스에 들어갈 데이터 초기화와 동시에 배열 선언
        int[] arr1_2 = {0, 1, 2, 3, 4};

        // 2차원 배열
        // 행과 열의 길이만 선언 -> 데이터는 선언하지 않음
        int[][] arr2_1 = new int[5][5];

        // 행과 열의 틀만 선언된 배열에 데이터 삽입
        for (int i = 0; i < arr2_1.length; i++) {
            for (int j = 0; j < arr2_1[i].length; j++) {
                arr2_1[i][j] = j;
            }
        }

        // 각 행의 열에 데이터 초기화와 동시에 배열 선언
        int[][] arr2_2 = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14}, {15, 16, 17, 18, 19}, {20, 21, 22, 23, 24}};
    }
}
