package dstructures;

import model.Afkomst;

public class Stack {
  
  private int stackSize;
    private Afkomst[] stackArr;
    private int top;

    public Stack() {
        this.stackArr = new Afkomst[100];
        this.top = -1;
    }

    public void push(Afkomst entry){
        if(this.isStackFull()){
            System.out.println(("Stack is full. Increasing the capacity."));
            this.increaseStackCapacity();
        }
        System.out.println("Adding: "+entry);
        this.stackArr[++top] = entry;
    }

    public Afkomst pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        Afkomst entry = this.stackArr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }

    public Afkomst peek() {
        return stackArr[top];
    }
 
    private void increaseStackCapacity(){
        Afkomst[] newStack = new Afkomst[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize*2;
    }

    public boolean isStackEmpty() {
        return (top == -1);
    }

    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
}
