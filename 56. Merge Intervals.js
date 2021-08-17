/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
 var merge = function(intervals) {
    
    if (intervals.length <2) return intervals;
       
       intervals.sort((a,b)=>a[0]-b[0]);
   const uniqueIntervals=[];

   let startTime=intervals[0][0];
   let endTime=intervals[0][1];
   for(let i=0;i<intervals.length;i++){
       let currentStart=intervals[i][0];
       let currentEnd=intervals[i][1];
       
       if(currentStart<=endTime){
           endTime=Math.max(endTime,currentEnd);
       }else{
           uniqueIntervals.push([startTime,endTime]);
           startTime=currentStart;
           endTime=currentEnd;
       }
       
   }
   
   uniqueIntervals.push([startTime,endTime]);
   return uniqueIntervals;
   
   
};