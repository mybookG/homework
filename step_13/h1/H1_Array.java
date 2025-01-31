public class H1_Array {

    public static void main(String args[]) {
        Array_Pool arrp = new Array_Pool();
        int[][] ar1, ar2, ar3;
        ar1 = arrp.get_arr1();
        ar2 = arrp.get_arr2();
        ar3 = arrp.get_arr3();
        arrp.ini_arr(ar1);
        arrp.ini_arr(ar2);
        arrp.prt_arr(ar1);
        arrp.prt_arr(ar2);
        arrp.add_arr();
        arrp.prt_arr(ar3);
    }
}

class Array_Pool {
    private int[][] arr1, arr2, arr3;

    Array_Pool() {
        arr1 = new int[2][3];
        arr2 = new int[2][3];
        arr3 = new int[2][3];
    }

    int[][] get_arr1() {
        return arr1;
    }

    int[][] get_arr2() {
        return arr2;
    }

    int[][] get_arr3() {
        return arr3;
    }

    void add_arr() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }

    static void ini_arr(int[][] arr) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    static void prt_arr(int[][] arr) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d\t", arr[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.println("----------------------------------");
    }
}
