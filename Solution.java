import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.*;

public class Solution {
    public static void main(String args[] ) throws Exception {

        Scanner scan = new Scanner(new File("in.txt"));// System.in
       	long M = scan.nextInt();
		LinkedList L = new LinkedList();

		while(scan.hasNextInt()){
			long elem = scan.nextInt();

			if(L.size() == M){
				L.remove_top();
			}
			L.add(elem);
		}
		long r = L.findKthToLast(M);
		if(r == -1)
			System.out.println("NIL");
		else System.out.println(r);
    }
}


class LinkedList{
	Node head;
	Node last;
	long size;
    
	LinkedList(){
		size = 0;
	}
	
	void add(long elem){
		Node n = new Node(elem);
		size++;

		if(size == 1){
			head = last = n;
		}else{
			head.next = n;
			last = n;
		}
	}

	void remove_top(){
		if(head == null) return;
		Node n = head.next;
		head = n;
		size --;
	}
	
	long size(){
		return size;
	}

	long findKthToLast(long k){
		long toFind = size - k + 1;
		if(toFind <= 0 || k <= 0)
			return -1;
		return head.data;
	}
}

class Node{
	long data;
	Node next;
	
	Node(long data){
		this.data = data;
	}
}
