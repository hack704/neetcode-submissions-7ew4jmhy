class Solution {
    public int maxProfit(int[] prices) {
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for(int i=0;i<prices.length;i++){
            for(int j=i;j<prices.length;j++){
                if(j>i){
                    if(prices[j]-prices[i]>=0){
                        set.add(prices[j]-prices[i]);
                    }
                }
            }
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}
