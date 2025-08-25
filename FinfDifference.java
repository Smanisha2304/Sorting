class Solution {
    public char findTheDifference(String s, String t) 
    {
        char [] a = s.toCharArray();
         char [] b = t.toCharArray();
         Arrays.sort(a);
         Arrays.sort(b);
         char r = 0;
        // String aa = new String(a);
        //  String bb = new String(b);
        for(char num:a)
        {
            r^=num;
        }
        for(char num:b)
        {
            r^=num;
        }
        return r;
    }

}
