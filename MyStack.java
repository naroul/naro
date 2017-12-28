package cal;

public class MyStack {  
    
    //栈的底层发数据结构也是数组. 主要方法有  push pop peek 判断stack为空  判断栈满  
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

