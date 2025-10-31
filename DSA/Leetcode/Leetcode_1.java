class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer>map = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){
            int remainder = target - nums[i];

            if(map.containsKey(remainder)){
                return new int[] {map.get(remainder) , i};
            }
            map.put(nums[i] , i);
        }
        return new int[]{-1,-1};
    }
}


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i + 1; j < nums.length; j++){
//                 if(nums[i] + nums[j] == target){
//                     return new int[] {i,j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }
