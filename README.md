# 🧩 DSA Practice in Java

A **learning repository for Data Structures and Algorithms (DSA)** using Java programming. This repo is designed for **beginners to advanced learners**, featuring **well-documented code, problem-solving strategies, exercises, and efficiency analysis**.  

---

## 🚀 Features

- Step-by-step roadmap for DSA in Java
- Beginner-friendly → Advanced topics
- Common **problem-solving patterns**
- Exercises with **time & space complexity**
- Mini projects to apply DSA concepts

---

## 📚 Step-by-Step Roadmap

### **Step 1: Java Basics**
**Goal:** Learn Java syntax and write simple programs.  
**Topics:**  
- Variables, Data types, Operators  
- Input/Output (`Scanner`, `System.out.println`)  
- Conditional statements (`if`, `switch`)  
- Loops (`for`, `while`, `do-while`)  
- Methods/functions  
- Arrays & Strings  

**Practice:**  
- Print "Hello World"  
- Sum of first N numbers → **TC:** O(N), **SC:** O(1)  
- Reverse a string → **TC:** O(N), **SC:** O(1)  
- Check palindrome → **TC:** O(N), **SC:** O(1)  
- Find largest/smallest in array → **TC:** O(N), **SC:** O(1)  

---

### **Step 2: Loops & Problem-Solving Patterns**
**Topics:**  
- Nested loops, `for-each` loops  
- Patterns: **Two Pointers**, **Sliding Window**, **Fast & Slow Pointers**, **Prefix Sum**  
- Basic recursion  

**Practice Examples:**  
- Maximum sum subarray (Sliding Window) → **TC:** O(N), **SC:** O(1)  
- Detect cycle in linked list (Fast & Slow) → **TC:** O(N), **SC:** O(1)  
- Reverse an array using loop → **TC:** O(N), **SC:** O(1)  

---

### **Step 3: Arrays & Strings**
**Topics:**  
- 1D & 2D arrays, insertion, deletion, search  
- Sorting: Bubble, Selection, Insertion, Merge, Quick  
- Searching: Linear & Binary  
- String manipulation & StringBuilder  
- Array patterns: Prefix sum, Kadane’s algorithm  

**Complexity Overview:**  
| Operation | Time Complexity | Space Complexity |
|-----------|----------------|-----------------|
| Linear Search | O(N) | O(1) |
| Binary Search | O(log N) | O(1) |
| Bubble/Selection/Insertion Sort | O(N²) | O(1) |
| Merge Sort | O(N log N) | O(N) |
| Quick Sort | O(N log N) avg, O(N²) worst | O(log N) recursion |

**Practice:**  
- Rotate array → **TC:** O(N), **SC:** O(1)  
- Subarray with sum K → **TC:** O(N) using prefix sum, **SC:** O(N)  
- Longest substring without repeating characters → **TC:** O(N), **SC:** O(N)  

---

### **Step 4: Recursion & Backtracking**
**Topics:**  
- Recursion: base case, recursive call, tail recursion  
- Backtracking: subsets, permutations, N-Queens, Sudoku  
- Divide & Conquer: Merge Sort, Quick Sort  

**Complexity Examples:**  
- Fibonacci (recursive) → **TC:** O(2ⁿ), **SC:** O(N) recursion stack  
- Factorial → **TC:** O(N), **SC:** O(N) recursion stack  
- N-Queens → Exponential (≈O(N!)), **SC:** O(N²) board  

---

### **Step 5: Linked Lists**
**Topics:**  
- Singly, Doubly, Circular linked lists  
- Operations: insert, delete, search, reverse  
- Fast & slow pointer pattern  

**Complexity Overview:**  
| Operation | Singly | Doubly | Space |
|-----------|--------|--------|-------|
| Insert/Delete (head) | O(1) | O(1) | O(1) |
| Insert/Delete (tail) | O(N) | O(1) | O(1) |
| Search | O(N) | O(N) | O(1) |
| Reverse | O(N) | O(N) | O(1) |

---

### **Step 6: Stack & Queue**
**Topics:**  
- Stack: push, pop, peek  
- Queue: enqueue, dequeue, circular queue, priority queue  
- Deque  

**Complexity:**  
| Operation | Stack | Queue | Deque |
|-----------|-------|-------|-------|
| Push/Pop | O(1) | - | O(1) |
| Enqueue/Dequeue | - | O(1) | O(1) |
| Peek/Front | O(1) | O(1) | O(1) |

---

### **Step 7: Hashing**
**Topics:**  
- HashMap, HashSet  
- Frequency counting  
- Two-sum, subarray sum, counting pairs  

**Complexity:**  
| Operation | Average TC | Worst-case TC | Space |
|-----------|------------|---------------|-------|
| Insert | O(1) | O(N) | O(N) |
| Search | O(1) | O(N) | O(N) |
| Delete | O(1) | O(N) | O(N) |

---

### **Step 8: Trees**
**Topics:**  
- Binary Tree & BST  
- Traversals: preorder, inorder, postorder, level-order  
- Height, diameter, sum of nodes  
- Lowest Common Ancestor (LCA)  

**Complexity Examples:**  
- Traversals → **TC:** O(N), **SC:** O(N) recursion stack or queue  
- Search in BST → **TC:** O(log N) avg, O(N) worst, **SC:** O(1)  
- Insert/Delete in BST → **TC:** O(log N) avg, O(N) worst  

---

### **Step 9: Graphs**
**Topics:**  
- Graph representation: adjacency list/matrix  
- BFS & DFS  
- Shortest path: Dijkstra, Bellman-Ford  
- MST: Kruskal, Prim  

**Complexity Examples:**  
- BFS/DFS → **TC:** O(V + E), **SC:** O(V)  
- Dijkstra (adjacency list + min-heap) → **TC:** O((V+E) log V)  
- Bellman-Ford → **TC:** O(V*E), **SC:** O(V)  

---

### **Step 10: Dynamic Programming & Greedy**
**Topics:**  
- 1D DP: Fibonacci, Climbing stairs  
- 2D DP: Grid paths, LCS  
- Subset DP: Knapsack  
- Greedy: Activity selection, Interval scheduling  

**Complexity Examples:**  
| Problem | TC | SC |
|---------|----|----|
| Fibonacci DP | O(N) | O(N) |
| LCS | O(M*N) | O(M*N) |
| 0/1 Knapsack | O(N*W) | O(N*W) |
| Coin Change (Greedy) | O(N log N) | O(1) |

---

### **Step 11: Competitive Patterns & Mini Projects**
**Patterns:** Two pointers, sliding window, fast & slow, prefix sum, recursion/backtracking, binary search, heap, graph BFS/DFS  

**Mini Projects:**  
- Maze solver → Backtracking  
- Text editor undo/redo → Stack  
- Airline booking system → PriorityQueue  
- Social network recommendations → Graph  
- Spell checker → Trie  

---

## 🔗 Resources
- [Java Documentation](https://docs.oracle.com/javase/8/docs/)  
- [GeeksforGeeks – DSA](https://www.geeksforgeeks.org/data-structures/)  
- [LeetCode](https://leetcode.com/)

---

## 💡 Tips
1. Practice **daily**, gradually increasing problem difficulty.  
2. Focus on **patterns and efficiency**.  
3. Track progress in **GitHub repo**.  
4. Solve **1-2 easy + 1 medium problem/day**.  
5. Learn **Java Collections** for practical use.  

---

> “Master both logic and efficiency. Time complexity is as important as correct output.” 💻✨
