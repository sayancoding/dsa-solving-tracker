## Binary search 

`TC - O(logN)`

## Algorithm
```
1. calculate mid (low_high)/2
2. find target at arr[mid]
3. if(target > arr[mid]) low = mid+1
4. else if(target < arr[mid]) high = mid -1
5. repeat till low < high
```
## Concept:

```
lower bound and upper bound :
lower_bound is greater or equal to target
upper_bound is only greater that target
```



