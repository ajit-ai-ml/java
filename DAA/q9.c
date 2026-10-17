#include<stdio.h>
void merge(int arr[],int st,int mid, int last){
    int i=st,j=mid+1,k=0;
    int temp[100];

    while(i<=mid && j <=last){
        if(arr[i]<=arr[j]){
        temp[k++]=arr[i++];
        }else{
            temp[k++]=arr[j++];
        }
    }

    while(i<=mid){
        temp[k++]=arr[i++];
    }

    while(j<last){
        temp[k++]=arr[j++];
    }

    for(int i=0;i<k;i++){
        arr[st+i]=temp[i];
    }
}



void merge_sort(int arr[],int st,int last){
    int mid=st+(last-st)/2;
    if(st>=last){
        return;
    }
    merge_sort(arr,st,mid);
    merge_sort(arr,mid+1,last);
    merge(arr,st,mid,last);
    
}
void display(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("index %d: %d\n", i ,arr[i]);
    }
}



int main(){

    int arr[]={6,1,7,2,3,4,6,9};
    int n=sizeof(arr)/sizeof(arr[1]);
    printf("%d",n);
    merge_sort(arr,0,n-1);
    display(arr,n);



    return 0;
}