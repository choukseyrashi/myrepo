/*
Collections
Problem Statement:
B. Design a generic MyArrayList class with add() and grow(). grow increases the internal size by 1.5 times. grow() should be called within the add() when the size is exhausted.Declare grow() as private.

 */

public class ColDemo{
    public static void main(String args[]){
        myArrayList<String> alist=new myArrayList<String>();
        alist.add("hi");
        alist.add("rashi");
        alist.add("yes");
        alist.add("no");
        alist.add("java");
        alist.add("A");
        alist.add("B");
        alist.display();
    }
}
class myArrayList<T>{
    final int max=5;
    int pos=0;
    T arr[]=(T[])new Object[max];
    void add(T x){
        if(pos<max){
            arr[pos]=x;
            pos=pos+1;
        }
        else{
            grow();
            arr[pos]=x;
            pos=pos+1;
        }
    }
    private void grow(){
        T temp[]=(T[]) new Object[(int)(max*1.5)];
        for(int i=0;i<pos;i++){
            temp[i]=arr[i];
        }
        arr=temp;
         
    }
    void display(){
        for(int i=0;i<pos;i++)
            System.out.println(arr[i]);
    }
    
}

/*OUTPUT
run:
hi
rashi
yes
no
java
A
B

*/