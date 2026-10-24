#include <stdio.h>


void merge(int arr[],int st,int mid ,int last){
    int temp[100];
    int i=st,j=mid+1,k=0;
    while(i<=mid && j<=last){
        if(arr[i]<=arr[j]){
            temp[k++]=arr[i++];
        }else{
            temp[k++]=arr[j++];
        }
    }
    while(i<=mid){
        temp[k++]=arr[i++];

    }
    while(j<=last){
        temp[k++]=arr[j++];
    }
 
    for(int i=0;i<k;i++){
        arr[i+st]=temp[i];
    }


}

void display(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("index %d : %d\n",i,arr[i]);
    }
}



void merge_sort(int arr[],int st,int last){
    int mid=st+(last-st)/2;
    if(st>=last){
        return;}
        merge_sort(arr,st,mid);
        merge_sort(arr,mid+1,last);
        merge(arr,st,mid,last);
    }





int main(){
    int arr[]={2,1,3,6,4,7,8,5};
    int n=sizeof(arr)/sizeof(arr[0]);
    merge_sort(arr,0,n-1);
    display(arr,n);




    return 0;
}