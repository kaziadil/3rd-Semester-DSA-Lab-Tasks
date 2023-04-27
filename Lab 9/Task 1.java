/*
Task#01
Question:
To develop stack using Array (using generic class) 
a)Implement the isEmpty() method in the Stack 
b) Implement the getSize() method in the Stack 
c) Implement the search() method in the Stack to check whether the element exists in the stack or not. d) Implement the push() method in the Stack and then Push 10 values. 
e) Implement the pop() method in the Stack and print the stack using pop. 
f) Display the all stack data using display() method..
Code:  */
package LAB.lab9;
class ArrayStack<T>{
    private Object[] a;
    private int size=0;
    public ArrayStack(int capacity){
        a=new Object[capacity];
    }
    private void resize(){
        Object[] aa=a;
        a=new Object[size*2];
        System.arraycopy(aa,0,a,0,size);
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int search(T target){
        for(int i=0;i<a.length;i++)if(a[i].equals(target))return i+1;
        return -1;
    }
    public void display(){
        for(Object obj:a) System.out.println(obj);
    }
    public void push(T t){
        if(a.length==size)resize();
        a[size++]=t;
    }
    public Object pop(){
        Object obj=a[--size];
        a[size]=null;
        return obj;
    }
}
public class Task1 {
    public static void main(String[] args) {
        ArrayStack<Integer> stack=new ArrayStack<>(10);
        System.out.println("Calling isEmpty method "+stack.isEmpty());
        System.out.println("Pushing values ");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(0);
        System.out.println("Calling getSize method "+stack.getSize());
        System.out.println("Calling display method ");
        stack.display();
        System.out.println("Searching 10 from stack");
        int position=stack.search(10);
        if(position>=0) System.out.println("Target found at "+position);
        else System.out.println("Target not found");
        System.out.println("Calling pop method "+stack.pop());
        System.out.println("Size of stack after calling pop method "+stack.getSize());

    }

}
