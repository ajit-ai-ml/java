#include<stdio.h>
void selectionsort(int arr[],int n){
    for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        if(min!=i){
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}


void display(int arr[] ,int n){
    for(int i=0;i<n;i++){
        printf("index %d : %d\n",i,arr[i]);
    }
}

 

int main(){
    int arr[]={2,3,1,8,4};
    int n= sizeof(arr)/sizeof(arr[1]);
    selectionsort (arr ,n);
    display(arr,n);
    // printf("%d",n);
   return 0;
}