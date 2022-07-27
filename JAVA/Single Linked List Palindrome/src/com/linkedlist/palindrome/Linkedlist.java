package com.linkedlist.palindrome;

import java.util.Stack;

public class Linkedlist {
	public static void main(String args[])
    {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
        five.ptr = six;
        six.ptr = seven;
        isPalindrome(one);
        //System.out.println("isPalidrome :" + condition);
    }
	static void isPalindrome(Node head)
    {
        Node slow = head;
        //boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();
 
        while (slow != null)
        {
            stack.push(slow.data);
            slow = slow.ptr;
        }
 
        while (head != null)
        {
            int i = stack.pop();
            System.out.print(i);
			/*
			 * if (head.data == i) { ispalin = true; } else { ispalin = false; break; }
			 */
            head = head.ptr;
        }
        //return ispalin;
    }
}

