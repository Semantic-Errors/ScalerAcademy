# Homework

<details>
<summary><b>Smaller and Greater</b></summary><br>

Same as LeetCode problem [2148. Count Elements With Strictly Smaller and Greater Elements](https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/description/)

---
</details>


<details>
<summary><b>Pattern Printing</b></summary><br>


Print a Pattern According to The Given Value of A.

- Example: For A = 3 pattern looks like:

    ```
    1 0 0
    1 2 0
    1 2 3
    ```

__Problem Constraints:__

1 <= A <= 1000

__Input Format__

First and only argument is an integer denoting A.


__Output Format__

Return a two-dimensional array where each row in the returned array represents a row in the pattern.

__Examples__ 

Input 1:

```
 A = 3
```

Output :1

```
 [    [1, 0, 0]   [1, 2, 0]   [1, 2, 3] ]
```

Input 2:

```
 A = 4
```

Output 2:


```
 [    [1, 0, 0, 0]   [1, 2, 0, 0]   [1, 2, 3, 0]   [1, 2, 3, 4] ]
```

Explanation:


```
  For A = 4 pattern looks like:
                             1 0 0 0
                             1 2 0 0
                             1 2 3 0
                             1 2 3 4 
  So we will return it as two-dimensional array.
```

---
</details>


<details>
<summary><b>Minimum Picks</b></summary><br>

You are given an array of integers A of size N.

Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.

__Problem Constraints:__

$2 <= N <= 1e5$ \
$-1e9 <= A[i] <= 1e9$ \
There is atleast 1 odd and 1 even number in A


__Input Format__

The first argument given is the integer array, A.


__Output Format__

Return maximum among all even numbers of A - minimum among all odd numbers in A.


__Examples__

Input 1:

```
 A = [0, 2, 9]
```

Output 1:

```
-7
```

Explanation 1:

Maximum of all even numbers = 2, Minimum of all odd numbers = 9,\
ans = 2 - 9 = -7

Input 2:

```
 A = [5, 17, 100, 1]
```

Output 2:

```
99
```

Explanation 2:

Maximum of all even numbers = 100, Minimum of all odd numbers = 1,\
ans = 100 - 1 = 99

---
</details>


<details>
<summary><b>Elements Which have At Least Two Greater</b></summary><br>

You are given an array of __distinct__ integers A, \
you have to find and return all elements in array which have at-least two greater elements than themselves.

__NOTE:__ The result should have the order in which they are present in the original array.

__Problem Constraints__

$3 <= |A| <= 105$

$-109 <= A[i] <= 109$



__Input Format__

First and only argument is an integer array A.


__Output Format__

Return an integer array containing the elements of A which have at-least two greater elements than themselves in A.


__Examples__

Input 1:

```
 A = [1, 2, 3, 4, 5]
```

Output 1:

```
 [1, 2, 3]
```

Explanation 1:

```
 Number of elements greater than 1: 4 
 Number of elements greater than 2: 3 
 Number of elements greater than 3: 2 
 Number of elements greater than 4: 1 
 Number of elements greater than 5: 0 
 Elements 1, 2 and 3 have atleast 2 elements strictly greater than themselves.
```

Input 2:

```
 A = [11, 17, 100, 5]
```

Output 2:

```
 [11, 5]
```

Explanation 2:

```
 Number of elements greater than 11: 2 
 Number of elements greater than 17: 1 
 Number of elements greater than 100: 0 
 Number of elements greater than 5: 3 
 Elements 5 and 11 have atleast 2 elements strictly greater than themselves.
```
---
</details>
