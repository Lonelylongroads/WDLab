interface Stack {
    int SIZE = 5; // Interface variables are static final
    void push(int element);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack {
    private int[] stackArray = new int[SIZE];
    private int top = -1;

    public boolean overflow() { return top == SIZE - 1; }
    public boolean underflow() { return top == -1; }

    public void push(int element) {
        if (overflow()) System.out.println("Stack Overflow!");
        else stackArray[++top] = element;
    }

    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stackArray[top--];
    }

    public void display() {
        if (underflow()) System.out.println("Stack is empty.");
        else {
            for (int i = 0; i <= top; i++) System.out.print(stackArray[i] + " ");
            System.out.println();
        }
    }
}