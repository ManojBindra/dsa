package StackAndQueue;

import java.util.Deque;
import java.util.LinkedList;

public class StackMaxAPI {
    public static void main(String[] args) {
        StackMaxAPI.Stack s = new StackMaxAPI.Stack();
        System.out.println(s.isEpmty());
        s.push(2);
        s.push(6);
        s.push(1);
        System.out.println(s.maxPeek());

    }

    public static class ElementWithMax {
        private Integer element;
        private Integer max;

        ElementWithMax(Integer element, Integer max) {
            this.element = element;
            this.max = max;
        }

        public Integer getMax() {
            return this.max;
        }

        public Integer getElement() {
            return this.element;
        }
    }

    public static class Stack {
        Deque<ElementWithMax> stack = new LinkedList<>();

        public boolean isEpmty() {
            return stack.isEmpty();
        }

        public Integer maxPeek() {
            return stack.peek().getMax();
        }

        public void push(Integer element) {
            ElementWithMax e = new ElementWithMax(element, isEpmty() ? element : Math.max(element, maxPeek()));
            stack.addFirst(e);
        }

        public Integer pop(){
            if(isEpmty()){
                throw new IllegalStateException("the stack is empty");
            }
            return stack.pop().getElement();
        }
    }

}
