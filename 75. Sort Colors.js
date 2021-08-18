/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
 var sortColors = function(arr) {
    let start = 0;
let mid = 0;
let end = arr.length - 1;

while (mid <= end) {
  if (arr[mid] == 0) {
    swap(arr, start, mid);
    start++;
    mid++;
  } else if (arr[mid] == 1) {
    mid++;
  } else if (arr[mid] == 2) {
    swap(arr, mid, end);
    end--;
  }
}
return arr;
};
const swap = (arr, i, j) => {
const temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
return arr;
};