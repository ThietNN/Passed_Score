import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students' score do you want to enter (max = 30): ");
        size = sc.nextInt();
        if (size>30) {
            System.out.println("Can not enter more than 30 scores");
            System.exit(0);
        }
        int[] arr = new int[size];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter student #" + (i+1) + " 's score");
            arr[i] = sc.nextInt();
        }

        int pass =0;
        System.out.println("Score list: ");
        for(int i=0;i<arr.length;i++){
            System.out.println("Student #" + (i+1) + ": " + arr[i]);
            if (arr[i]>=5)
                pass++;
        }
        System.out.println("There are " + pass + " students passed the exam");

    }
}
