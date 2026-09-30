#include<stdio.h>
int binarysearch(int arr[],int low,int high, int se) {
    if (high >= low) {
        int mid = low + (high - low) / 2;

         
        if (arr[mid] == se)
            return mid;

        
        if (arr[mid] > se)
            return binarysearch(arr, low, mid - 1, se);

       if (arr[mid] < se)
        return binarysearch(arr, mid + 1, high, se);
    }
  

    return -1;  
}


int main(){
    int arr[5],se;


    printf("Enter 5 elements in sorted order:");


    for(int i=0;i<5;i++){
        scanf("%d",&arr[i]);
    }
    printf("Enter the element to search: ");
    scanf("%d",&se);


    int result = binarysearch(arr, 0, 4, se);
    
    if(result != -1){
        printf("Element found at index %d\n  element is: %d", result, arr[result]);
    }
    else{
        printf("Element not found\n");
    }
    return 0;
}