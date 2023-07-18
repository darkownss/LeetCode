/*
    hashmap usando como key os valores e value como o index
    Pode-se atribuir os valores ao mapa e depois procurar pelo complemento 
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        int[]result = new int[2];
        
       for(int i = 0; i < nums.length;i++){
           int atual = nums[i];
            int valorProcurar = target - atual;
            if(m.containsKey(valorProcurar)){
                result[0]= m.get(valorProcurar);
                result[1]=i;
                return result;
                
                // return new int[]{numMap.get(complement), i};
            }
            m.put(atual,i);
       }
       return new int[]{};

    }
}