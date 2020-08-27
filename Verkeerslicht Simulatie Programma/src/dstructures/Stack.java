package dstructures;

public class Stack {
  
  private int stackSize;
    private Afkomst[] stackArr;
    private int top;
 
    /**
     * constructor to create stack with size
     * @param size
     */
    public Stack() {
        this.stackSize = size;
        this.stackArr = new Afkomst[100];
        this.top = -1;
    }
 
    /**
     * This method adds new entry to the top 
     * of the stack
     * @param entry
     * @throws Exception 
     */
    public void push(Afkomst entry){
        if(this.isStackFull()){
            System.out.println(("Stack is full. Increasing the capacity."));
            this.increaseStackCapacity();
        }
        System.out.println("Adding: "+entry);
        this.stackArr[++top] = entry;
    }
 
    /**
     * This method removes an entry from the 
     * top of the stack.
     * @return
     * @throws Exception 
     */
    public Afkomst pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        Afkomst entry = this.stackArr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }
     
    /**
     * This method returns top of the stack
     * without removing it.
     * @return
     */
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
     
    /**
     * This method returns true if the stack is 
     * empty
     * @return
     */
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
    /**
     * This method returns true if the stack is full
     * @return
     */
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
}
