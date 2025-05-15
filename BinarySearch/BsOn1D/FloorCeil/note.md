## Floor & Ceil

```
floor -> lesser or equal to target & largest elem in array
ceil ->  greater or equal to target & smallest elem in array
```
### Floor find : 
```java
int left = 0;
int right = nums.length-1;
int floor = -1;
while (left <= right) {
    int mid = (left + right) / 2;
    if (nums[mid] <= x) {
        floor = mid;
        left = mid + 1;
    } else {
        right = mid - 1;
    }
}
        
```
### Ceil find : 
```java
int left = 0;
int right = nums.length-1;
int ceil = -1;
while (left <= right) {
    int mid = (left + right) / 2;
    if (nums[mid] >= x) {
        ceil = mid;
        right = mid - 1;
    } else {
        left = mid + 1;
    }
}
        
```