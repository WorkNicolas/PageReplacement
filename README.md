# Page Replacement
FIFO and LRU methods of page replacement.

## Sample Inputs
### Reference String
Input Reference String: 7 0 1 2 0 3 0 4 2 3 0 3 2

### Frame Size
Input Frame Size: 4

### Algorithm Option
Input Option [1 - FIFO, 2 - LRU]: 1

## Sample Output

### Final Output
**Note:** The table is printed vertically instead of horizontally unlike ITE 005 assignment.

Reference String [7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2]

Frames 4

Page Faults 7
<br>
Reference String | Frames

7| 7

0| 7 0

1| 7 1 0

2| 7 2 1 0

0| 7 2 1 0

3| 3 2 1 0

0| 3 2 1 0

4| 4 3 2 1

2| 4 3 2 1

3| 4 3 2 1

0| 4 3 2 0

3| 4 3 2 0

2| 4 3 2 0
