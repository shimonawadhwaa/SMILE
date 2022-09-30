package com.company;

import java.util.Stack;

public class StkPalindrome {
    public static void main(String[] args) {
        Stack<Character> stk1=new Stack<>();
       // Stack<Character> stk2=new Stack<>();
        stk1.push('M');
        stk1.push('A');
        stk1.push('D');
        stk1.push('A');
        stk1.push('M');
        stk1.push('M');
       /* int len= stk1.size();
        int k=len/2;
        if(stk1.size()%2==0)
        {
            while(stk2.size()!=2)
            {
                stk2.push(stk1.peek());
                        stk1.pop();
            }
        }
        else
        {
            while(stk2.size()!=2)
            {
                stk2.push(stk1.peek());
                stk1.pop();
            }
            stk2.push(stk1.peek());
        }
        while(!stk1.empty())
        {
            if(stk1.peek()!=stk2.peek())
                break;
            stk1.pop();
            stk2.pop();
        }
        if(stk1.empty()&&stk2.empty())
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");*/

        //-------------------------------------------

        //TRAVERSE STACK
       /* traverse ref=new traverse();
        ref.trav(stk1);
        System.out.println(stk1.size());*/

        //--------------------
        //******************REVERSE STACK------VERY VERY VERY VERY VERY IMPORTANT*******************************************

       /* Reverse ref=new Reverse();
        ref.doRev(stk1);
        System.out.println(stk1.peek());
        stk1.pop();
        System.out.println(stk1.peek());*/

        //-----------------------------

        //ascending descending stack
        Stack<Integer> stakk=new Stack<>();
        stakk.push(10);
        stakk.push(20);
        stakk.push(30);
        Reverse ref = new Reverse();
        ref.ascending(stakk);

    }
}
class traverse
{

    void trav(Stack<Character> stk1) {
        if(stk1.empty())
            return;
        char i=stk1.peek();
        System.out.println(i);
        stk1.pop();
        trav(stk1);
        stk1.push(i);
    }
}
class Reverse {

    void doRev(Stack<Character> stk1) {
        if (stk1.empty())
            return;

        char i = stk1.peek();
        stk1.pop();
        doRev(stk1);
        helper(i, stk1);
    }

    void helper(char i, Stack<Character> stk1) {
        if (stk1.empty()) {
            stk1.push(i);
            return;
        } else {
            char c = stk1.peek();
            stk1.pop();
            helper(c, stk1);
            stk1.push(i);
        }
    }

    void ascending(Stack<Integer> stakk) {
        Stack<Integer> stakk2 = new Stack<>();
        while (!stakk.empty()) {
            int temp = stakk.peek();
            stakk.pop();
            try {
                while (stakk2.peek() > temp) {
                    if(stakk2.empty())
                        break;
                    stakk.push(stakk2.peek());
                    stakk2.pop();
                }
            }
            catch(Exception exp)
            {
                exp.getMessage();
            }

            stakk2.push(temp);
        }
        while(!stakk2.empty())
        {
            stakk.push(stakk2.peek());
            stakk2.pop();
        }
        System.out.println(stakk.peek());
        stakk.pop();
        System.out.println(stakk.peek());
        stakk.pop();
        System.out.println(stakk.peek());
    }
}

