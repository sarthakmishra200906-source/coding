#include<stdio.h>
void countingSort(int arr[], int n) 
{ 
    int output[n]; // output array 
    int count[10] = {0}; // initialize count array with all zeros

    // Store count of each number
    for (int i = 0; i < n; i++) {
        count[arr[i]]++;
    }

    // Change count[i] so that it contains the actual position of this number in output[]
    for (int i = 1; i < 10; i++) {
        count[i] += count[i - 1];
    }

    // Build the output array
    for (int i = n - 1; i >= 0; i--) {
        output[count[arr[i]] - 1] = arr[i];
        count[arr[i]]--;
    }

    // Copy the output array to arr[], so that arr[] now contains sorted numbers
    for (int i = 0; i < n; i++) {
        arr[i] = output[i];
    }
}
int main() 
{ 
    int arr[] = {4, 2, 2, 8, 3, 3, 1}; 
    int n = sizeof(arr) / sizeof(arr[0]); 
    countingSort(arr, n); 
    printf("Sorted array: \n"); 
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    return 0; 
}