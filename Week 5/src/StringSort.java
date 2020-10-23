import java.util.*;
public class StringSort
{
    public static void main(String[] args)
    {
        String[] values =  {"mouse", "dog", "cat", "horse", "cow",
                "moose", "tiger", "lion", "elephant", "bird", "hamster",
                "guinea pig", "leopard", "aardvark", "hummingbird"};

        Arrays.sort(values);
        System.out.println(Arrays.toString(values));


    }
}

