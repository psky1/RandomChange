import java.util.Random;

public class RandomGenerator{
    public static void main(String[] args)
    {
//        output("Generate 10 random integers between 5 and 95");

        Random rnd = new Random();
        
        for (int i = 1; i <= 95; ++i)
        {
          int randomInt = 5 + rnd.nextInt(95);
          System.out.println("Generated number: " + randomInt);
        }
    
        System.out.println("Done.");
    }
}