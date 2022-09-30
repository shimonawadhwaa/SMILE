package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
//hushhhhhhhhhh...bohot mushkil se hua postfix vala..thank god..hufff
public class Stak {
    public static void main(String[] args) {
       /* Stackk ref=new Stackk(100);
        String s1="{[[()][]]}";
        char s[]=s1.toCharArray();
        ref.bracketBalancer(s);*/
        Stack<Character> ref=new Stack<>();
        ArrayList<Character> ref2=new ArrayList(10);
        System.out.println("enter: ");
        Scanner cin=new Scanner(System.in);
        String line=cin.nextLine();
        char[] lin=line.toCharArray();
        int index=0;
        while(index<lin.length) {
            if (lin[index] == '(') {
                ref.push(lin[index]);
            }
            else
                if (lin[index]==')')
                {
                    while(ref.peek()!='(')
                    {
                        ref2.add(ref.peek());
                        ref.pop();
                    }
                    ref.pop();
                }
            else
                if(lin[index]=='-'||lin[index]=='+'||lin[index]=='*'||lin[index]=='/') {
                    if( lin[index] == '+' || lin[index] == '-') {
                        if(ref.empty())
                        {
                            ref.push(lin[index]);
                        }
                        else {
                            if (ref.peek() == '/' || ref.peek() == '*') {
                                ref2.add(ref.peek());
                                ref.pop();
                                ref.push(lin[index]);
                            }
                            else ref.push(lin[index]);
                        }
                    }
                    else {
                        ref.push(lin[index]);
                    }
                }
                else
                    if(lin[index]>='a'&&lin[index]<='z'||lin[index]>='A'&&lin[index]<='Z'||lin[index]>='0'&&lin[index]<='9')
                    {
                        ref2.add(lin[index]);
                    }
                    index++;

        }
        while(!ref.empty())
        {
            if(ref.peek()=='(')
                break;
            ref2.add(ref.peek());
                    ref.pop();
        }
        System.out.println(ref2);

    }

    }

/*class Stackk
{
    int[] stack;
    int index=-1;
    Stackk(int N)
    {
        stack =new int[N];
    }
    boolean isEmpty()
    {
        if(index==-1)
            return true;
        else
            return false;
    }
    boolean isFull()
    {
        if(index==stack.length-1)
            return true;
        else
            return false;
    }
    void push(char val)
    {
        if(isFull())
        {
            System.out.println("cannot push more elements");
        }
        else
        {
            stack[++index]=val;
        }
    }
    void pop()
    {
        if(isEmpty())
        {
            System.out.println("no more values can be removed");
        }
        else
        {
            index--;
        }
    }

    void bracketBalancer(char[] s) {
        int i=0;
        while(i<s.length){
            if(s[i]=='['||s[i]=='{'||s[i]=='(')
            {
                push(s[i]);
            }
            else {
                if (s[i] == ']' || s[i] == '}' || s[i] == ')') {
                    if ((s[i] == ']' && stack[index] == '[') || (s[i] == '}' && stack[index] == '{') || (s[i] == ')' && stack[index] == '('))
                        pop();
                    else
                        return;
                }
            }
            i++;
        }
        if(isEmpty())
        {
            System.out.println("bracket is balanced");
        }
        else
            System.out.println("not balanced");
    }
}*/
