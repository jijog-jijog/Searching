


This roadmap organizes your LeetCode problems **pattern-wise and in a learnable order**.  
Solve them **in order** inside each section so the technique you learn in one problem directly helps with the next.

---

## How to use this roadmap
- **Master the pattern**, not the single problem.
- Skim the “Pattern” and “Core Technique” before solving.
- After solving, **write a 2–3 line summary** of the idea in your notes so you can reuse it later.
- Use built-in sort only when appropriate; prefer **two pointers, counting/frequency, greedy, cycle sort, quickselect, merge sort** where they are the intended patterns.

---

## 1) Basics: Sorting, Sets, Frequency (start here)
1. **[Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)**  
   Pattern: Two Pointers on sorted arrays → **in-place backward merge**  
   Core Technique: Start from the end of `nums1` (`p1`, `p2`, `write`), compare & place larger.
2. **[Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)**  
   Pattern: Set / Sorting dedupe  
   Core Technique: Use `HashSet` or sort and check adjacent.
3. **[Majority Element](https://leetcode.com/problems/majority-element/)**  
   Pattern: Frequency / Boyer–Moore majority vote  
   Core Technique: Boyer–Moore O(n), O(1) space.
4. **[Missing Number](https://leetcode.com/problems/missing-number/)**  
   Pattern: Math or XOR or Sorting  
   Core Technique: `sum(0..n) - sum(nums)` or XOR fold.
5. **[Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)**  
   Pattern: Set or Sorting + Two Pointers  
   Core Technique: Deduplicate with set, or sort both and advance.
6. **[Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)**  
   Pattern: Frequency map or Sorting + Two Pointers  
   Core Technique: Count in hashmap; or sort then intersect with counts.

---

## 2) Greedy + Sorting (choose optimal after ordering)
7. **[Assign Cookies](https://leetcode.com/problems/assign-cookies/)**  
   Pattern: Greedy after sort  
   Core Technique: Sort `g` and `s`, give smallest possible cookie.
8. **[Array Partition I](https://leetcode.com/problems/array-partition-i/)**  
   Pattern: Greedy via sorting pairs  
   Core Technique: Sort and sum elements at even indices (mins of pairs).
9. **[Largest Perimeter Triangle](https://leetcode.com/problems/largest-perimeter-triangle/)**  
   Pattern: Greedy + sorted triple check  
   Core Technique: Sort desc; first valid triangle `a < b + c`.
10. **[Average Salary Excluding the Minimum and Maximum Salary](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/)**  
    Pattern: Min/Max tracking or sort then slice  
    Core Technique: Track min, max, sum in one pass.
11. **[Can Make Arithmetic Progression From Sequence](https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/)**  
    Pattern: Sort then check constant difference  
    Core Technique: Sort; verify `a[i]-a[i-1]` fixed.
12. **[Make Two Arrays Equal by Reversing Sub-arrays](https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/)**  
    Pattern: Multiset equality  
    Core Technique: Frequency maps (or sort both) must match.

---

## 3) Sorting + Two Pointers / Index Manipulation
13. **[Third Maximum Number](https://leetcode.com/problems/third-maximum-number/)**  
    Pattern: Selection / Tracking top-k  
    Core Technique: Track three uniques; or sort & dedupe.
14. **[Maximum Product of Three Numbers](https://leetcode.com/problems/maximum-product-of-three-numbers/)**  
    Pattern: Extremes after sort  
    Core Technique: Compare `max1*max2*max3` vs `min1*min2*max1`.
15. **[Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/)**  
    Pattern: Partition by predicate  
    Core Technique: Two pointers; move evens to front.
16. **[Sort Array By Parity II](https://leetcode.com/problems/sort-array-by-parity-ii/)**  
    Pattern: Indexed parity partition  
    Core Technique: Place evens on even indices, odds on odd (two pointers stride 2).
17. **[Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)**  
    Pattern: Two pointers merging absolute values  
    Core Technique: Fill from end with larger |a| squared.
18. **[Relative Sort Array](https://leetcode.com/problems/relative-sort-array/)**  
    Pattern: Counting / custom order  
    Core Technique: Frequency count by `arr2` order + append the rest sorted.
19. **[Minimum Absolute Difference](https://leetcode.com/problems/minimum-absolute-difference/)**  
    Pattern: Adjacent difference after sort  
    Core Technique: Sort; scan adjacent diffs; collect minima.
20. **[Rank Transform of an Array](https://leetcode.com/problems/rank-transform-of-an-array/)**  
    Pattern: Coordinate compression  
    Core Technique: Sort uniques → assign incremental rank.
21. **[Sort Integers by The Number of 1 Bits](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/)**  
    Pattern: Custom comparator  
    Core Technique: Sort by `(popcount(x), x)`.
22. **[How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)**  
    Pattern: Counting / prefix sums  
    Core Technique: If constraints small, counting array; else sort + first index lookup.
23. **[Maximum Product of Two Elements in an Array](https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/)**  
    Pattern: Extremes tracking  
    Core Technique: Track top2; compute `(a-1)*(b-1)`.
24. **[Matrix Cells in Distance Order](https://leetcode.com/problems/matrix-cells-in-distance-order/)**  
    Pattern: Sort by key or BFS  
    Core Technique: Sort by Manhattan distance `(abs(r-r0)+abs(c-c0))`.
25. **[Height Checker](https://leetcode.com/problems/height-checker/)**  
    Pattern: Compare to sorted copy  
    Core Technique: `sum( a[i]!=sorted[i] )`.

---

## 4) Frequency / Buckets / “Custom” Sorting
26. **[Sort Array by Increasing Frequency](https://leetcode.com/problems/sort-array-by-increasing-frequency/)**  
    Pattern: Frequency + custom comparator  
    Core Technique: Sort by `(freq[x], -x)`.
27. **[Special Array With X Elements Greater Than or Equal X](https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/)**  
    Pattern: Counting / binary search on answer  
    Core Technique: Sort desc and find feasible `x`; or counting + prefix.

---

## 5) Duplicate & Missing Numbers (Cycle Sort Family)
28. **[Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)**  
    Pattern: Index marking or cycle sort  
    Core Technique: Negate at index `|x|-1` or place `x` to `x-1`.
29. **[Set Mismatch](https://leetcode.com/problems/set-mismatch/)**  
    Pattern: Index marking / cycle sort  
    Core Technique: Same as above; find dup + missing.
30. **[Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/)**  
    Pattern: Floyd cycle detect / index marking  
    Core Technique: Tortoise–Hare on value→index graph; or marking (if allowed).
31. **[Find All Duplicates in an Array](https://leetcode.com/problems/find-all-duplicates-in-an-array/)**  
    Pattern: Index marking or cycle sort  
    Core Technique: Negation trick; collect repeats.
32. **[First Missing Positive](https://leetcode.com/problems/first-missing-positive/)** ⭐ *HARD*  
    Pattern: Cycle sort / in-place hashing  
    Core Technique: Place `x` in `x-1` if `1..n`; scan first mismatch.

---

## 6) K-Sum & Two Pointers (after sorting)
33. **[Two Sum](https://leetcode.com/problems/two-sum/)**  
    Pattern: Hashing (baseline) / Two pointers on sorted copy  
    Core Technique: Hash map index; or sort + two pointers (careful with indices).
34. **[3Sum](https://leetcode.com/problems/3sum/)**  
    Pattern: Sort + two pointers  
    Core Technique: Fix `i`; two-sum on `i+1..n-1`; skip duplicates.
35. **[3Sum Closest](https://leetcode.com/problems/3sum-closest/)**  
    Pattern: Sort + two pointers minimizing |sum-target|  
    Core Technique: Same as 3Sum but track closest sum.
36. **[4Sum](https://leetcode.com/problems/4sum/)**  
    Pattern: Sort + two pointers with pruning  
    Core Technique: Fix two, two-sum on inner; skip duplicates.

---

## 7) Advanced Sorting, Lists, Intervals, Selection
37. **[Group Anagrams](https://leetcode.com/problems/group-anagrams/)**  
    Pattern: Canonical key (sorted string / count signature)  
    Core Technique: Map `sorted(s)` or 26-count tuple → bucket.
38. **[Merge Intervals](https://leetcode.com/problems/merge-intervals/)**  
    Pattern: Sort + sweep merge  
    Core Technique: Sort by start; merge if `cur.start <= prev.end`.
39. **[Sort Colors](https://leetcode.com/problems/sort-colors/)**  
    Pattern: Dutch National Flag (3-way partition)  
    Core Technique: `low/mid/high` pointers; single pass.
40. **[Insertion Sort List](https://leetcode.com/problems/insertion-sort-list/)**  
    Pattern: Linked list insertion sort  
    Core Technique: Dummy head; insert current into sorted prefix.
41. **[Sort List](https://leetcode.com/problems/sort-list/)**  
    Pattern: Linked list merge sort  
    Core Technique: Split by slow/fast; merge two halves.
42. **[Largest Number](https://leetcode.com/problems/largest-number/)**  
    Pattern: Custom comparator on strings  
    Core Technique: Sort by `a+b > b+a` order; handle leading zeros.
43. **[Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)**  
    Pattern: Quickselect / Heap  
    Core Technique: Quickselect avg O(n); or min-heap of size k.

---

## Suggested Progression (macro order)
- Sections 1 → 2 → 3 → 4 → 5 → 6 → 7 in order.
- Within a section, go top-to-bottom.

---

### Tips
- **Two pointers**: always maintain the meaning of each pointer and invariant (<=, >=, etc.).
- **Cycle sort family**: “place value `x` at index `x-1`” and loop until positioned.
- **Greedy + sort**: after sorting, try to greedily match the “smallest that works” first.
- **Custom comparator**: design the sort key that matches the requirement exactly.
- **Linked lists**: prefer merge sort over quick sort; pointer manipulation > arrays.

Good luck! Keep a short note after each problem summarizing the technique so you can quickly revise patterns later.
"""

path = "/mnt/data/README.md"
with open(path, "w", encoding="utf-8") as f:
    f.write(content)

path
