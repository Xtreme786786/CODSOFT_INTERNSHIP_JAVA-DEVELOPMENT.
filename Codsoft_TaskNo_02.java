import java.util.Scanner;

public class Codsoft_TaskNo_02 {
    public static void main(String[] args) {
        // Student grade calculator:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Subject:-");
        int sub = sc.nextInt();
        int tmarks=0;
        for(int i=1;i<=sub;i++){
            System.out.println("Enter the marks of subjects "+i+":-");
            int marks = sc.nextInt();
            tmarks+=marks;
        }
        System.out.println("Total Marks of "+sub+" subject is : "+tmarks);
        int avg = tmarks/sub;
        System.out.println("Average Percentage of "+sub+" subject is "+avg+"%");
        String grade;
        if(avg>=90)grade="A+";
        else if(avg>=80 && avg<90)grade ="A";
        else if(avg>=70 && avg<80)grade ="B";
        else if(avg>=60 && avg<70)grade ="C";
        else if(avg>=50 && avg<60)grade ="D";
        else grade = "F";
        System.out.println("Grade : "+grade);
    }
}
