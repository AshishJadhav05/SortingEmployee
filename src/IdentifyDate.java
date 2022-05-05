import java.util.Scanner;
public class IdentifyDate {

    public static void dateByNumber(int days){
        int arr[] = new int[] {31,59,90,120,151,181,212,243,273,304,334,365};
        String month = "";
        int date = 0;
        for(int i=0;i<arr.length;i++){
            if(days<=arr[0]){
                month="January";
                date = days;
            }
            else if(days>arr[0]&&days<=arr[1]){
                month= "february";
                date = days-arr[0];
            }
            else if(days>arr[1]&&days<=arr[2]){
                month ="March";
                date = days - arr[1];
            }
            else if(days>arr[2]&&days<=arr[3]){
                month="April";
                date = days - arr[2];
            }
            else if(days>arr[3]&&days<=arr[4]){
                month="May";
                date = days - arr[3];
            }
            else if(days>arr[4]&&days<=arr[5]){
                month="June";
                date = days - arr[4];
            }
            else if(days>arr[5]&&days<=arr[6]){
                month="July";
                date = days - arr[5];
            }
            else if(days>arr[6]&&days<=arr[7]){
                month="August";
                date = days - arr[6];
            }
            else if(days>arr[7]&&days<=arr[8]){
                month="September";
                date = days - arr[7];
            }
            else if(days>arr[8]&&days<=arr[9]){
                month="Octomber";
                date = days - arr[8];
            }
            else if(days>arr[9]&&days<=arr[10]){
                month="November";
                date = days - arr[9];
            }
            else if(days>arr[10]&&days<=arr[11]){
                month="December";
                date = days - arr[10];
            }
            else{
                month =" bhai kya kar raha hai tu";

            }
        }
        System.out.println(date+" "+month);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int days = scan.nextInt();
        dateByNumber(days);

    }
}
