class Main {
    public static void main(String[] args) {
        System.out.println(sumTo(100));
        System.out.println(formulaOfSumTo(100));

        System.out.println(isPrimeBruteForce(13));
        System.out.println(isPrimeBruteForce(10));

        System.out.println(isPrime(13));
        System.out.println(isPrime(10));

        System.out.println(sqrtBruteForce(100));
        System.out.println(sqrtBruteForce(16));
        System.out.println(sqrtBruteForce(17));

        System.out.println(binarySearchOnSqrt(100));
        System.out.println(binarySearchOnSqrt(16));
        System.out.println(binarySearchOnSqrt(17));
    }

    public static int sumTo(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static int formulaOfSumTo(int n) {
        return ((n * (n + 1)) / 2); 
    }

    public static boolean isPrimeBruteForce(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return (number > 1); // discarding 1 and any negative integer
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return (number > 1);
    }

    public static int sqrtBruteForce(int number) {
        int sqrt = 1;

        for (int i = 1; i * i <= number; i++) {
            sqrt = i;
        }

        return sqrt;
    }

    public static int binarySearchOnSqrt(int number) {
        int sqrt = 1;
        int low = 1;
        int high = number;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (mid * mid == number)
                return mid;
            else if (mid * mid < number) {
                sqrt = mid;
                low = mid + 1;
            }
            else
                high = mid - 1;
        }

        return sqrt;
    }
}
