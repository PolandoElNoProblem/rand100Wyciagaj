import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] cyferki = new int[100];
        Random rnd= new Random();
        System.out.println("NiePosortowana tablica");
        for(int i=0;cyferki.length>i;i++){
            int n=rnd.nextInt(20,71);
            cyferki[i]+=n;

            System.out.print(cyferki[i] + " ");
        }
        System.out.println("\nPosortowana tablica");
        Arrays.sort(cyferki);
        for(int i=0;cyferki.length>i;i++)
            System.out.print(cyferki[i] + " ");

        int n=cyferki.length;

        int maxim = 1;
        int temp = cyferki[0];
        int count = 1;

        for (int i = 1; i < cyferki.length; i++)
        {
            if (cyferki[i] == cyferki[i - 1])
                count++;
            else
            {
                if (count > maxim)
                {
                    maxim = count;
                    temp = cyferki[i - 1];
                }
                count = 1;
            }
        }


        if (count > maxim)
        {
            maxim = count;
            temp = cyferki[n - 1];
        }
        System.out.println("\nNajczesciej wystepuje:"+temp);
    }

}



