
# M-th-to-Last-Element
For this question, you will write a program that, given a positive integer M and a list of integers L, outputs the list element M links away from the end of the list. For this program, we will use 1-indexing. That means mth_to_last(1) is the "1st-to-last" element, or simply the last element in the list. If you are given an invalid index, output NIL instead.

**Examples**

*Input:*

> 4

> 10 200 3 40000 5

*Output:*

> 200

*Input:*

> 2

> 42

*Output*

> NIL

**Input Format and Restrictions**
Each test case will consist of two lines. The first line contains the value of M. The second line contains the values of L, each separated by a space character.

The inputs will always satisfy the following restrictions:

0 < M < 2^32 - 1,

Each element of the list satisfies 0 <= L[i] <= 2^32 - 1,

The number of elements in the list satisfies 0 < \|L\| < 1024. The bonus test cases may be much larger!

https://www.hackerrank.com/contests/programming-interview-questions/challenges/m-th-to-last-element
