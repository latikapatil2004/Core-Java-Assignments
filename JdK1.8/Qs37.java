class Qs37
{
	public static void main(String[]args)
	{
		List<Integer>al=List.of(10,20,30,20,40,10,50,30,60);
		HashMap<Integer,Integer>map=new HashMap<>()
		for(int num :al)
		{
			if(map.containsKey(num))
			{
				map.put(num,map.get(num)+1);
			}
			else
			{
				map.put(num,1);
			}
		}
		for(Map.Entry<Integer,Integer>entry:map.entrySet<>())
		{
            Stream<Integer>s=entry.stream();
		}
		
	     
	}
}