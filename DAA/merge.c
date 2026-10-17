 
#include <stdio.h>

void merge(int arr[], int st, int mid, int last) {
    int temp[100];
    int i = st, j = mid + 1, k = 0;

    while (i <= mid && j <= last) {
        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }

    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    while (j <= last) {
        temp[k++] = arr[j++];
    }

    // Copy merged values back to the correct range
    for (i = 0; i < k; i++) {
        arr[st + i] = temp[i];
    }
}

void merge_sort(int arr[], int st, int last) {
    // Base case: zero or one element
    if (st >= last) {
    return;}
    

    int mid = st + (last - st) / 2;

    merge_sort(arr, st, mid);
    merge_sort(arr, mid + 1, last);
    merge(arr, st, mid, last);
}

void display(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("index %d : %d\n", i, arr[i]);
    }
}

int main(void) {
    int arr[] = {5,6,4,3,2,1};
    int n = sizeof(arr) / sizeof(arr[0]);

    merge_sort(arr, 0, n - 1);
    display(arr, n);

    return 0;
}
