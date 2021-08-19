/**
 * @param {number[]} height
 * @return {number}
 */
 var maxArea = function(height) {
    
    let i=0;
    let j=height.length-1;
    let water=0;
    while(i<j){
        let width=j-i;
        let _hight=Math.min(height[i],height[j]);
        water=Math.max(width*_hight,water);
        if(height[i]<height[j]) i++;
        else j--;
    }
    
    
    return water;
    
};
