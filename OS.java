import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Scheduling {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, temp;
        String tmp;
        System.out.println("Enter the no. of processes : ");
        n = Integer.parseInt(br.readLine());

        int[] arrival = new int[n];
        int[] burst = new int[n];
        String[] process = new String[n];


        /** This has complexity of O(n) required for input of the details */
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for the process " + (i + 1));
            process[i] = "Process " + (i + 1);
            System.out.println("Enter the arrival time : ");
            arrival[i] = Integer.parseInt(br.readLine());
            System.out.println("Enter the burst time  : ");
            burst[i] = Integer.parseInt(br.readLine());
        }
    }
}

        