import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr22 = array(22);
        for (int i = 0; i < arr22.length; i++) {
            arr22[i] = i;
        }
        System.out.println(sumAll(arr22));
        System.out.println(sumAllRevers(arr22));
        System.out.println(Arrays.toString(OddsUndEvens(arr22)));
        System.out.println(FirstLast(arr22));
        System.out.println(Arrays.toString(Paint()));



    }

    public static int[] array(int a) {

        return new int[a];
    }

    public static int sumAll(int[] b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumAllRevers(int[] c) {
        int sum = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            sum += i;
        }
        return sum;
    }

    public static int[] OddsUndEvens(int[] d) {
        int[] oAe = array(2);
        int sumOdds = 0;
        int sumEvens = 0;
        for (int i = 0; i < d.length; i++) {
            if (i % 2 == 0) {
                sumEvens += i;
            } else {
                sumOdds += i;
            }
        }
        oAe[1] = sumOdds;
        oAe[0] = sumEvens;
        return oAe;

    }

    //{1,2,3,4,5,6,7}

    public static int FirstLast(int[] e) {
        int sum = 0;
        int length;
        if (e.length % 2 == 0) {
            length = e.length / 2;
        } else {
            length = e.length / 2 + 1;
        }
        for (int i = 0; i < length; i++) {
            if (i == e.length - i - 1) {
                sum += i;
            } else {
                sum += i + e.length - i - 1;
            }
        }
        return sum;
    }

    public static int[] Paint() {
        int[] array = array(22);
        Random random = new Random();
        array[0] = random.nextInt(20);
        array[1] = random.nextInt(40);
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1]+array[i-2];
        }
        return array;
    }
}