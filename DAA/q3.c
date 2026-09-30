//binary search

#include<stdio.h>
int main(){
    int arr[5],se;
    printf("Enter 5 elements in sorted order:");
    for(int i=0;i<5;i++){
        scanf("%d",&arr[i]);
    }
    printf("Enter the element to search: ");
    scanf("%d",&se);

    int low = 0, high = sizeof(arr) / sizeof(arr[0]) - 1, mid;
    while(mid=-1){
        mid = (low + high) / 2;

        if (arr[mid] == se) {
            printf("Element found at index %d\n  element is: %d", mid, arr[mid]);
            break;
        }
        else if (arr[mid] < se) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }
}