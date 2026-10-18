#include<stdio.h>
#include"mymodule.h"

int main(){
    int arr[]={5,4,36,777,554,66,999,100};
    int n=sizeof(arr)/sizeof(arr[1]);
    bubble_sort(arr,n);
    display(arr,n);




    return 0;
}