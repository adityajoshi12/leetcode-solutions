/**
 * @param {number} n
 * @return {string[]}
 */
 var generateParenthesis = function(n) {
    let result=[];
    let str="";
    
    t(str,0,0);
    return result;
    function t(str,left,right){
        
        if(left==n && right==n){
            result.push(str)
            return;
        }  if(left !=n){
            t(str+"(",left+1,right)
        } if(left>right){
            t(str+")",left,right+1)
            }
    }
};