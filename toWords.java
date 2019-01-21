package amountinwords;
//asdfasdf
public class AmountInWords {

    public static String convertRupeesToWords(int num) {

        String[] denominations = {" crore", " lakhs", " thousand", " hundred", ""};

        int[] valueDenominations = {10000000, 100000, 1000, 100, 1};

        int value;

        StringBuilder inWords = new StringBuilder();

        for (int i = 0; i < valueDenominations.length; i++) {

            value = num / valueDenominations[i];
            
            if (value > 0)
            {
                if(i == valueDenominations.length)
                    inWords.append(" and");
                inWords.append(convert_two_digits(value));
                inWords.append(denominations[i]);
            }
            num %= valueDenominations[i];

        }

        return inWords.toString();

    }

    public static String convert_two_digits(int num) {

        String[] oneToNineteen = {" ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", "fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};

        String[] ten = {" ", " ", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};

        if (num > 19) {

            return ten[num / 10] + oneToNineteen[num % 10];

        } else {

            return oneToNineteen[num];

        }

    }

    public static void main(String[] args) {

        int rupees;
        int paise;
        int n;
        String amount = "4005.67";
        String[] amountInRupees = amount.split("\\.");

        rupees = Integer.parseInt(amountInRupees[0]);
        paise = Integer.parseInt(amountInRupees[1]);
        
        if (rupees > 0)
        {
            System.out.print(convertRupeesToWords(rupees) + " rupees and");
        }
        System.out.print(convert_two_digits(paise) + " paise");
        System.out.println(" only");
    }
}
