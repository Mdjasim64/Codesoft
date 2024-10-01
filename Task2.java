//package CodSoft;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Total No. of Subjects: ");
        int sub=sc.nextInt();
        if(sub<0){
            System.out.println("Please Enter Valid NO. of Subjects!! ");
            return;
        }
        int totalMarks=0;
        int maxMarks=100;
        for(int i=1;i<=sub;i++){
            System.out.print("Enter the marks obtained(out of 100) in subjects "+i+": ");
            int marks=sc.nextInt();
            if(marks<0 || marks>maxMarks){
                System.out.println("Please Enter valid marks between 0 to 100!!");
                i--;
            }
            totalMarks+=marks;
        }
        double percentage=totalMarks/sub;
        String grade;
        if(percentage>=90){
            grade ="A+";
        }
        else if(percentage>=80){
            grade="A";
        }
        else if(percentage >=70){
            grade ="B+";
        }
        else if(percentage >=60){
            grade ="B";
        }
        else if(percentage >=50){
            grade ="C+";
        }
        else if(percentage >=40){
            grade ="C";
        }
        else{
            grade ="F";
        }
        System.out.println("TotalMarks: "+totalMarks);
        System.out.println("Average Percentage: "+percentage+"%");
        System.out.println("Grade: "+grade);

    }
}
