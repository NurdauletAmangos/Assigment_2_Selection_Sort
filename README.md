# Assignment 2 — Selection Sort (with Early Termination)

## Overview
This project implements the **Selection Sort** algorithm optimized with **early termination** detection when the array becomes sorted before completing all iterations.

This implementation is part of **Pair 1: Basic Quadratic Sorts**  
- Student A: Insertion Sort (optimized for nearly sorted data)  
- Student B: Selection Sort (this implementation)

## Algorithm Description
Selection Sort repeatedly selects the minimum element from the unsorted portion and places it in its correct position.  
The **early termination** check stops the algorithm early if the array is already sorted.

### Time Complexity
| Case | Complexity | Explanation |
|------|-------------|-------------|
| **Best** | Ω(n) | Early termination if array is already sorted |
| **Average** | Θ(n²) | Nested loops over all pairs |
| **Worst** | O(n²) | Fully unsorted input |
| **Space** | O(1) | In-place sorting |

## Features
- Clean, well-documented Java code
- Performance tracking (comparisons, swaps, array accesses)
- Command-line interface for benchmarking
- Comprehensive JUnit 5 tests

## Repository Structure

src/
├─ main/java/
│ ├─ algorithms/SelectionSort.java
│ ├─ metrics/PerformanceTracker.java
│ └─ cli/BenchmarkRunner.java
├─ test/java/
  └─ algorithms/SelectionSortTest.java
