/*[ ] Find missing values between the minimum and maximum elements
Input: arr = [4, 2, 7, 3]
Output: [5, 6]*/

class Array12 {
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 3};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        boolean seen[] = new boolean[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            seen[arr[i]] = true;
        }

        for (int i = smallest; i <= largest; i++) {
            if (!seen[i]) {
                System.out.println(i);
            }
        }
    }
}