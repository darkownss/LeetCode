class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> m = new HashMap<>();

        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int ans = 0;
        /*gasto em espaço ;
    
        char[] c = s.toCharArray();
        Caso faça um array de char, gasta de o(n) para espaço e o if muda para:
            if(i < s.length() - 1 && m.get(c[i]) < m.get(c[i+1]))
        */
        for( int i = 0; i < s.length() ; i++){
            if(i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
         
                ans -= m.get(s.charAt(i));
            }else{
                ans += m.get(s.charAt(i));
            }
        }
        return ans;
    }
}