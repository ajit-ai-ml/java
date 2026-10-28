#include<stdio.h>


void merge(int arr[],int st,int mid,int last){

    int i=st,j=mid+1,k=0;
    
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


int main(){








    return 0;
}