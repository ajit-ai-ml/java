#include<stdio.h>
#include"mymodule.h"

int main(){

    int arr[]={2,3,1,3,54};
    int n=sizeof(arr)/sizeof(arr[1]);
    bubble_sort(arr,n);
    display(arr,n);

    return 0;
}