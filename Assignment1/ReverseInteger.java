class Solution {
    public int reverse(int x) {
        long number = 0;
        boolean negative = false;
        if(x<0){
            x*=-1;
            negative = true;
        }
        while(x>0){
            int temp = x%10;
            number = number*10 + (long)temp;
            x/=10;
        }
        if(negative) number*=-1;
        if(number>2147483647 || number<-2147483648)
            return 0;
        else return (int)number;
    }
}
