import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.*;

public class Solution {
    public static void main(String args[] ) throws Exception {

        Scanner scan = new Scanner(System.in);
       	long M = scan.nextInt();
		LinkedList L = new LinkedList();
		while(scan.hasNextInt()){
			long elem = scan.nextInt();
			L.add(elem);
		}
		long r = findKthToLast(M, L);
		if(r == -1)
			System.out.println("NIL");
		else System.out.println(r);
    }

	public static long findKthToLast(long k, LinkedList list){
		Node end = list.last;

		while(-- k != 0 && end.previous != null)
			end = end.previous;

		if(end.previous == null)
			return -1;
		return end.data;
	}
}

// reverse singly linked list
// A <- B <- C

class LinkedList{
	Node head;
	Node last;
	int size;

	LinkedList(){
		size = 0;
	}
	
	void add(long elem){
		Node n = new Node(elem);
		size++;

		if(size == 1){
			head = last = n;
		}else{
			n.previous = last;
			last = n;
		}
	}
}

class Node{
	long data;
	Node previous;
	
	Node(long data){
		this.data = data;
	}
}
