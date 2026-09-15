class Solution {
    public int addDigits(int num) {
        if(num<=9)
           return num;

    int number=num;

    int sumOfDigits=0;
    while(true){
        sumOfDigits=0;
        while(number !=0){
           int digit = number%10;
            sumOfDigits += digit;
            number/=10;
        }
        if(sumOfDigits <= 9)
          return sumOfDigits;
        number= sumOfDigits;
    }


        
    }
}