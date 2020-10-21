public class CountSpaces{
    static int i, count_space = 0, result;
    public static void main(String[] args) {
        String quote = "You change the world by being yourself ";
        result = CountSpaces.calculateSpaces(quote);

        System.out.println("The number of white space: "+result);
    }
    public static int calculateSpaces(String inString) {
        for(i=0,count_space=0;i<inString.length();i++)
        {
            char ch=inString.charAt(i);
            if(ch==' ')
                count_space++;
        }
        return count_space;
    }
}
