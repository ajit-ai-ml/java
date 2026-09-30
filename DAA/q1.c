
//liner search in c language

#include<stdio.h>
int main(){
    int arr[5],se;

    // Input elements of the array
    printf("Enter elements of array:\n");
    for(int i=0;i<5;i++){
        scanf("%d",&arr[i]);

    }

    // Input the element to search
    printf("Enter the elements that you want to search ..... :  ");
    scanf("%d",&se);

    // Search for the element in the array
    for(int i=0;i<5;i++){
        if(arr[i]==se){
            printf("The element %d is found at index %d\n",se,i);
            break;
        }
    }

    return 0;
}