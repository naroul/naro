package cal;

public class MyStack {  
    
    //ջ�ĵײ㷢���ݽṹҲ������. ��Ҫ������  push pop peek �ж�stackΪ��  �ж�ջ��  
    private long[] arr;  
    private int top;  
      
    public MyStack(){  
        arr = new long[10];  
        top = -1;  
    }  
      
    public MyStack(int maxsize){  
        arr= new long[maxsize];  
        top = -1;  
    }  
      

    public void push(long value){  
        arr[++top] = value;  
    }  
       
    public long pop(){  
        return arr[top--];  
    }  
      

    public long peek(){  
        return arr[top];  
    }  
      
    public boolean isEmpty(){  
        return top == -1;  
    }  
      
    public boolean isFull(){  
        return top == arr.length - 1;  
    }  
}  

