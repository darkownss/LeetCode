/**
    Abordagem de comparação de metade do numero com a outra metade 

 */
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || ( x !=0 &&(x % 10)==0))//necessario um and senao ele 
                                           //da false na condição caso x seja 0
            return false; //-123 -> 321-// 1230 -> 0321
        if(x == 0 )
            return true;
        //2,147,483,647 -> 7,463,847,412, int = 4
        //                                long = 4
        //                                long long = 8 
        // nao há necessidade no caso de comparção pela metade do número

        int inverso = 0;
        int temp = x;

        while(x > inverso){
            //cada iteração retira o algarismo menos significante
            //após de ter atribuido este algarismo a var inverso
            //com isso, na nova iteração, o numero anterior irá ser multiplicado por 10, ganhando mais uma ordem de grandeza
            inverso = inverso*10 + temp%10;
            temp /= 10;
        }
        return (x == inverso);// return (x == inverso) || (x == inverso / 10); neste caso testa a condição de for igual ou se o numero for 0, retornando true
    }
}