//bubble sort

#include<stdio.h>


void display(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
}
int main(){
       int a=0;
 int arr[5]={2,3,5,6,4};
  for(int i=0;i<5;i++){


    for(int j=0;j<5-i-1;j++){
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            a=1;
        }
    }

    if(a==0){
        printf("array is sorted\n");
        display(arr, 5);
        return 0;
    }
  }
  
  display(arr, 5);







    return 0;
}
