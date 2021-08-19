/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function (nums, target) {
    let i = 0;
    let j = nums.length - 1;
    let mid = 0;
    while (i <= j) {
        mid = Math.floor((i + j) / 2)
        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[i] <= nums[mid]) {
            if (nums[i] <= target && nums[mid] >= target) j = mid - 1;
            
            else i = mid + 1;
            
        } else {
            if (nums[j] >= target && nums[mid] <= target)  i = mid + 1;
            else j = mid - 1;
            
        }
    }
    return -1;

};