class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] product = new int[nums.length];
        
        // Count zeros and calculate product of non-zero elements
        int zeroCount = 0;
        int productWithoutZero = 1;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            } else {
                productWithoutZero *= nums[i];
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            product[i] = 1;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(zeroCount > 1){
                // More than one zero means all products are 0
                product[i] = 0;
            } else if(zeroCount == 1){
                // Exactly one zero
                if(nums[i] == 0){
                    product[i] = productWithoutZero;
                } else {
                    product[i] = 0;
                }
            } else {
                // No zeros - your original logic
                for(int j = 0; j < nums.length; j++){
                    product[i] = product[i] * nums[j];
                } 
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0 && zeroCount == 0){
                product[i] = product[i] / nums[i];   
            }
        }
        
        return product;
    }
}  
