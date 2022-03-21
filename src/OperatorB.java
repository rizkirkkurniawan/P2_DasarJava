public class OperatorB {
    public static void main(String[] args) {
        float total = 14000;
        System.out.println("original investment:$" + total);
        //increases by 40 precent the first year
        total = total + (total* .4f);

        System.out.println("after one year : $ " + total);
        // loses $1,500 the second year
        total=total-1500f;
        System.out.println("after two years:$"+total);
        //incerseases by 12 precent the third year
        total=total+(total* .12f);
        System.out.println("after three years:$"+total);
    }
    }
