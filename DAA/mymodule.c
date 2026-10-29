#include<stdio.h>
#include"mymodule.h"
//bubble sort
void bubble_sort(int arr[],int n){


    for(int i=0;i<n;i++){

        for(int j=0;j<n-i-1;j++){
            if(arr[j]>=arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }
    }
}
//selection sort

void selection_sort(int arr[],int n){
    int min;
    for(int i=0;i<n;i++){

      int min=i;

     for(int j=i+1;j<n;j++){
        if(arr[j]<arr[min]){
            min=j;
         }
    }
     int temp=arr[i];
     arr[i]=arr[min];
     arr[min]=temp;
    }
}




//imsertion sort 
void insertion_sort(int arr[],int n){
    for(int i=1;i<n;i++){
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
              j--;

        }

        arr[j+1]=key;
    }
    


}
void merge(int arr[],int st,int mid, int last){
    int i=st,j=mid+1,temp[100],k=0;
    while(i<=mid && j<=last){
        if(arr[i]<arr[j]){
            temp[k++]=arr[i++];

        }
        else{
            temp[k++]=arr[j++];
        }
    }
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    while(j<=last){
        temp[k++]=arr[j++];
    }

    for(int m=0;m<k;m++){
         arr[st+m]=temp[m];
    }
}

// merge sort
void merge_sort(int arr[], int st , int last){
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
        printf(" index %d: %d\n",i,arr[i]);
    }
}


//quick sort




// int main(){
//     int arr[]={4,1,9,5,43,84,5676,467,45};
//     int n=sizeof(arr)/sizeof(arr[1]);
//     // bubble_sort(arr,n);
//     // selection_sort(arr,n);
//     // insertion_sort(arr,n);
//     merge_sort(arr,0,n-1);
//     display(arr,n);


// return 0;


// }