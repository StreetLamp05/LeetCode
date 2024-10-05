// 225. Implement Stack using Queues
// https://leetcode.com/problems/implement-stack-using-queues/description/

import java.util.Queue;
import java.util.LinkedList;

class MyStack {
   private Queue<Integer> q1;
   private Queue<Integer> q2;
   private int size;

   public MyStack() {
      this.q1 = new LinkedList<>();
      this.q2 = new LinkedList<>();
      this.size = 0;
   } // MyStack

   public void push(int x) {
      this.q1.add(x);
      this.size++;
      while (!this.q2.isEmpty()) {
         this.q1.add(this.q2.remove());
      } // while
      while (!this.q1.isEmpty()) {
         this.q2.add(this.q1.remove());
      } // while
   } // push

   public int pop() {
      size--;
      return this.q2.remove();
   } // pop

   public int top() {
      return this.q2.peek();
   } // top

   public boolean empty() {
      if (size == 0) {
         return true;
      } // if
      return false;
   } // empty
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */