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
    //push function adds the value to the top of the stack. the requried arguments are: array, value, index. The index keeps track of the position of the top value and is updated each a time the function is called.
    index = push(stack, 5, index);
    index = push(stack, 14, index);
    printf ("Final arary after pushing: \n");   
    int x=0;
    for(x=0;x<index;x++){
        printf("%d ",stack[x]);
    }
    printf ("\n");
    
    //pop function removes the value at the top of the stack. the requried arguments is: index. instead of "deleting"the value, it reduces the size of the array by one, this ignoring the value at the far end of the array. This function also updates the index
    index = pop(index);
    
        for(x=0;x<index;x++){
        printf("\n%d\n",stack[x]);
    }
    
    //pop function removes the value at the top of the stack. the requried arguments is: index. instead of "deleting"the value, it reduces the size of the array by one, this ignoring the value at the far end of the array. This function also updates the index
    top(stack, index-1);
    
}