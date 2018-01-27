public class MyMaths {

    public static int abs(int value) {

        int result = Math.abs(value);

        return result;
    }

    public static long factorial(int number) {

        if (number == 0) {
            return 1;
        }else {
            return (number * factorial(number-1));
        }
    }

    public static long fib(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }else {
            return (fib(n-1) + fib(n-2));
        }
    }

    public static String sumInList(int[] list, int num) {

        int leftIndex = 0;
        int rightIndex = list.length-1;

        for (int i = leftIndex; i < rightIndex;) {

            int sum = list[leftIndex] + list[rightIndex];

            if (sum > num) {
                rightIndex--;
            }else if (sum < num) {
                leftIndex++;
            }else if (sum == num) {
                return "Yes the numbers are - " + list[leftIndex] + " and " + list[rightIndex];
            }else {
                return "Nothing found";
            }

        }
        return "Wtf";

    }


    public static void main (String[] args) {

        System.out.println(MyMaths.abs(-10));

        System.out.println(MyMaths.factorial(10));

        System.out.println(MyMaths.fib(10));

        int[] list = {1,3,2,5,4,7,6,9,8};

        System.out.println(list);

        System.out.println(MyMaths.sumInList(list, 5));

    }
}
