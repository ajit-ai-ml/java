 #include<stdio.h>

 void selection(int arr[],int n){
    for(int i=0;i<n-1;i++){
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
 void display(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("index %d : %d\n",i ,arr[i]);
    }
 }


 int main(){
    int arr[]={35,6,7,85,4,6};
    selection(arr,6);
    display(arr,6);






    return 0;
 }