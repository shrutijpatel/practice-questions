class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map=new HashMap<String,Integer>();
        map.put("I",1);
		map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("p",0);   // this is just dummy
        s="p"+s;
        int len=s.length(),sum=0;
        int i=len-1;
        while(i>0)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i-1);
            System.out.println(sum);
            if(map.get(ch1+"")>map.get(ch2+""))
            {sum=sum-map.get(ch2+"")+map.get(ch1+"");
            i-=2;
            }
            else
            {    sum+=map.get(ch1+"");
            i--;}
        }
        return sum;
    }
}
