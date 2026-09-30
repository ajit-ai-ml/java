#include<stdio.h>
int binarysearch(int arr[],int low ,int high,int se);

 int main(){
    int arr[5],se,i;
    printf("Enter 5 elements in sorted order:");
    for(i=0;i<5;i++){
        scanf("%d",&arr[i]);
    }
    printf("Enter the element to search: ");
    scanf("%d",&se);
    int low=0,high=sizeof(arr)/sizeof(arr[0])-1;
    int result=binarysearch(arr,low,high,se);
    if(result==-1){
        printf("Element not found");
    }   

    return 0;

 }
 int binarysearch(int arr[],int low ,int high,int se){

    if(low<=high){
        int mid =low+(high-low)/2;

        if(arr[mid]==se){
            printf("elements found at index %d elemnts is %d", mid ,arr[mid]);
            return mid;
        }
        else if(arr[mid]<se){
            return binarysearch(arr,mid+1,high,se);
        }
        else{
            return binarysearch(arr,low,mid-1,se);

        }
       
    }
     return -1;
}

