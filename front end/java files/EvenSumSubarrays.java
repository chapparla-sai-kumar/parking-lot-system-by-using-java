
public class EvenSumSubarrays {
public static void main(String[] args) {
    int[] arr = {-3, 5, -1, 2, -8, -7};

int left = 0;
int right = 1;

while (right < arr.length) {

    if (arr[left] >= 0) {
        left++;
        right++;
    }
    else if (arr[right] < 0) {
        right++;
    }
    else {
        int temp = arr[right];

        int i = right;

        while (i > left) {
            arr[i] = arr[i - 1];
            i--;
        }

        arr[left] = temp;

        left++;
        right++;
    }
}

int i = 0;

while (i < arr.length) {
    System.out.print(arr[i] + " ");
    i++;
}
}
    
}