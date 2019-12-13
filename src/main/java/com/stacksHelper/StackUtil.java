package com.stacksHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StackUtil {
    static final int MAX = 1000;
    static int top=0;
    static int stack[] = new int[MAX]; // Maximum size of Stack

    public void push(int id) throws Exception
    {
        if(top<MAX )
        {
            stack[top]=id;
            top++;
            display();
        }
        else
        {
            throw new Exception("No space in stack!");
        }

    }

    public void pop() throws Exception
    {

        if(top!=-1)
        {
            int id = stack[top];
            top--;
            display();
        }
        else
        {
            throw new Exception("No space in stack!");
        }

    }

    public void display()
    {
        System.out.println("Updated stack is ->>>>>");

        for(int i=top-1; i>-1;i--)
        {
            System.out.println("|"+stack[i]+"|");
            System.out.println(" _");
        }
    }
}
