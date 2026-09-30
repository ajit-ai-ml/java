#include<stdio.h>

int main(){
    int a[5],i,se;
    printf("Enter the elements of array");

    for(i=0;i<5;i++){
        scanf("%d",&a[i]);

    }
    printf("you array elements are: ");
    for(i=0;i<5;i++){
        printf("%d  ",a[i]);
        
    }

    printf("emter the elements you want to search: ");
    scanf("%d",&se);

    int low=0,high=sizeof(a)/sizeof(a[0])-1;
    int ai=0;

    while(low<=high){
        int mid=low+(high-low)/2;

        if(a[mid]==se){
            printf("element found at index %d elemnts is %d", mid ,a[mid]);
            ai=1;
            break;
        }
        else if(a[mid]<se){
            low=mid+1;}

            else{high=mid-1;

        } 


        

        
    }
    if(ai==0)
        printf("Element not found");

    // for(i=0;i<5;i++){
    //     if(a[i]==se){
    //         printf("Element found at index %d\n elements is %d",i,a[i]);
 
    //     }}
    
    // if(i==5)
    //     printf("Element not found");
    
    return 0;
}