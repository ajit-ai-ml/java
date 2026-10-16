#include<stdio.h>
void insertion(int arr[],int n){

    for(int i=1;i<n;i++){
        int key=arr[i];
        int prev=i-1;
        while(prev>=0 && arr[prev]>key){
            arr[prev+1]=arr[prev];
            prev--;
        }
           arr[prev+1]=key;
    }
 
} 
void display(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("index %d : %d\n",i,arr[i]);
    }
}

int main(){
    int arr[]={3,4,5,6,7};
    int n=5;
    insertion(arr,n);
    display(arr,n);

    return 0;





}