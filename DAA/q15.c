#include<stdio.h>
#include"mymodule.h"

int main(){

    int arr[]={3,42,44,53,22,44,564,4444,456433};
    int s=sizeof(arr)/sizeof(arr[0]);
    insertion_sort(arr,s);
    // bubble_sort(arr,s);
    display(arr,s);



    return 0;
}