import java.util.*;

class MyStack {

  Queue<Integer> q1 = new LinkedList<>();
  Queue<Integer> q2 = new LinkedList<>();

  public MyStack() {
      
  }
  
  public void push(int y) {
    if(!q1.isEmpty())
    {
      q1.add(y);
    }else{
      q2.add(y);
    }
  }
  
  public int pop() {
  if(q1.isEmpty() && q2.isEmpty())
  {
      return -1;
  }
  int top = -1;
  if(!q1.isEmpty())
  {
    while(!q1.isEmpty())
    {
      top = q1.remove();
      if(q1.isEmpty())
      {
        break;
      }
      q2.add(top);
    }
  }else{
    while(!q2.isEmpty())
    {
      top = q2.remove();
      if(q2.isEmpty())
      {
        break;
      }
      q1.add(top);
    }
  }
  return top;
  }
  
  public int top() {
    if(q1.isEmpty() && q2.isEmpty())
    {
      return -1;
    }
    int top = -1;
    if(!q1.isEmpty())
    {
      while(!q1.isEmpty())
      {
        top = q1.remove();
        q2.add(top);
      }
    }else{
      while(!q2.isEmpty())
      {
        top = q2.remove();
        q1.add(top);
      }
    }
    return top;
  }
  
  public boolean empty() {
    return q1.isEmpty() && q2.isEmpty();
  }
}
