#include <stdio.h>


void merge(int arr[],int str,int mid,int last){
    int temp[100];
    int i=str, j=mid+1, k=0;
    while(i<=mid && j<=last){
        if(arr[i]<arr[j]){
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

    for(int i=str,k=0;i<=last;i++,k++){
        arr[i]=temp[k];

    }

}

void merge_sort(int arr[],int str,int last){
    if (str < last) {
         int mid=(str+last)/2;
        merge_sort(arr,str,mid);
        merge_sort(arr,mid+1,last);
         merge(arr,str,mid,last);
}

}

int main(){
    int arr[]={2,3,1,4,5,6};
    
    merge_sort(arr,0,5);

    for(int i=0;i<=5;i++){
        printf("index %d : %d\n",i,arr[i]);

    }



    return 0;
}