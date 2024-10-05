// 232. Implement Queue using Stacks
// https://leetcode.com/problems/implement-queue-using-stacks/description/

import java.util.Stack;

class MyQueue {
   private Stack<Integer> stackIn;
   private Stack<Integer> stackOut;
   private int queueSize;

   public MyQueue() {
      this.stackIn = new Stack<>();
      this.stackOut = new Stack<>();
      this.queueSize = 0;
   } // MyQueue

   /**
    * Pushes element {@code x} to the back of the queue.
    * 
    */
   public void push(int x) {
      this.stackIn.push(x);
      this.queueSize++;
   } // push

   public int pop() {
      int temp;
      while (!this.stackIn.isEmpty()) {
         this.stackOut.push(this.stackIn.pop());
      } // while
      temp = this.stackOut.pop();
      while (!this.stackOut.isEmpty()) {
         this.stackIn.push(this.stackOut.pop());
      } // while
      this.queueSize--;
      return temp;
   } // pop

   public int peek() {
      int temp;
      while (!this.stackIn.isEmpty()) {
         this.stackOut.push(this.stackIn.pop());
      } // while
      temp = this.stackOut.peek();
      while (!this.stackOut.isEmpty()) {
         this.stackIn.push(this.stackOut.pop());
      } // while
      return temp;
   } // peek

   public boolean empty() {
      if (this.queueSize == 0) {
         return true;
      }
      return false;
   }
} // MyQueue

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */