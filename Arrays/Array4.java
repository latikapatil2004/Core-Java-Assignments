/*Find repeating elements	[1, 2, 3, 2, 4, 1]	1,2*/


class Array4 {
    public int sumOfUnique(int[] nums) {
        int nums[]={1,2,3,2,4,1};
        Map<Integer, Integer> frequency = new LinkedHashMap<>();
		for(int num:nums)
		{
			frequency.put(num,getordefault(num,0)+1);
		}
		for(int num:nums)
		{
			if(frequency.get(num)>=2)
			{
				System.out.println(num);
			}
		}
    }
}