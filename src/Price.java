public class Price {
    private int amount;
    public Price(){
        amount=0;
    }

    public int price(String s) {
        int count[]={0,0,0,0};
        char list[]=s.toCharArray();
        for (char aList : list) {
            switch (aList) {
                case 'A':
                    count[0]++;
                    break;
                case 'B':
                    count[1]++;
                    break;
                case 'C':
                    count[2]++;
                    break;
                case 'D':
                    count[3]++;
                    break;
            }
        }
        int price_a=(count[0]/3)*130+(count[0]%3)*50;
        int price_b=(count[1]/2)*45+(count[1]%2)*30;
        int price_c=count[2]*20;
        int price_d=count[3]*15;
        amount=price_a+price_b+price_c+price_d;
        return amount;
    }
}
