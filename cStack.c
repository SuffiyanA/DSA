// Online C compiler to run C program online
#include <stdio.h>
//stack

int push(int arr[], int value, int index){
    if (index==5){
        printf("\n****Array overflow!****\n");
    } else {
    printf("%d being added on index %d\n",value ,index);
    arr[index] = value;
    index = index+1;
    printf("Next value will be added on index %d\n", index);
    }
    return index;
}

int pop(int index){
    if (index==0){
        printf("****End of Array Reached****" );
    } else {
        index = index-1;
        printf("Top element popped! remaining elements in stack: %d\n", index);
    }
        return index;
}

void top(int arr[], int index){
    printf("Value on top of the stack is: %d", arr[index] );
}


int main() {
    int index =0;
    int stack[5] ={} ;
    //index = push(stack, 5, index);
    // index = push(stack, 6, index);
    // index = push(stack, 9, index);
    // index = push(stack, 11, index);
    // index = push(stack, 14, index);
    //printf("This is index after push: %d\n", index);
    //index = push(stack, 17, index);
    

    int x=0;
    for(x=0;x<index;x++){
        printf("\n%d\n",stack[x]);
    }
    printf("This is after insertion\n");
    printf("This is index after push: %d\n", index-1);
    
    index = pop(index);
    //index = pop(index);
    
        for(x=0;x<index;x++){
        printf("\n%d\n",stack[x]);
    }
    
    printf("This is after POP\n");
    printf("This is index after POP: %d\n", index);
    
    top(stack, index-1);
    
}