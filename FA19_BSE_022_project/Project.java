// Author : FA19_BSE_022(B)  AREEB AHMED


/*
Sir! 
	when you compile the program ,ignore the "-xlint:unchacked" massage by compiler, it's just a warning,
	then just run the program 
	you will get the output!
Thanku!

*/

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Project implements Serializable{
    public static ArrayList<Student> studentArrayList = new ArrayList<>();

    public static void addStudent(String data) throws Exception{
       
        FileWriter writer = new FileWriter(new File("ErrorMessages.txt "));
        boolean err = true;

        Student check = null;
        File f = new File(data);
        StringTokenizer tokenizer;
        String str = "";
        String str1;
        Scanner scanner = new Scanner(f);
        while (scanner.hasNextLine()) {
            err = true;
            str1 = scanner.nextLine();
            tokenizer = new StringTokenizer(str1, ",");
            check = new Student();
            //StudentID
				Pattern pattern = Pattern.compile("(FA|SP)\\d{2}[-](BCS|BSE|BCE)[-]\\d{3}");
				str = tokenizer.nextToken();
				Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                check.setSID(str);
            } else {
                err = false;
                writer.write("\nIncorrect SID " + str);
            }

            check.setFName(tokenizer.nextToken());
            check.setLName(tokenizer.nextToken());
            //CNIC
            pattern = Pattern.compile("\\d{5}[-]\\d{7}[-]\\d");
            str = tokenizer.nextToken();
            matcher = pattern.matcher(str);
            if (matcher.matches()) {
                check.setCNIC(str);
            } else {
                err = false;
                writer.write("\nIncorrect CNIC " + str);
            }
			//Age
            str = tokenizer.nextToken();
            pattern = Pattern.compile("\\d{2}");
            matcher = pattern.matcher(str);
            if (matcher.matches()) {
                check.setAge(str);
            } else {
                err = false;
                writer.write("\nIncorrect Age : " + str);
            }
            ;
            //GPA
            str = tokenizer.nextToken();
            pattern = Pattern.compile("[1-4][.]\\d{2}");
            matcher = pattern.matcher(str);
            if (matcher.matches()) {
                check.setCGPA(str);
            } else {
                err = false;
                writer.write("\nIncorrect CGPA : ");
            }
            //email
            str = tokenizer.nextToken();
            pattern = Pattern.compile("(FA|SP)\\d{2}[-][A-Z]{3}[-]\\d{3}[@]cuilahore.edu.pk");
            matcher = pattern.matcher(str);
            if (matcher.matches()) {
                check.setEmailAddress(str);
            } else {
                err = false;
                writer.write("\nIncorrect EmailAddress : " + str);
            }

            if (err) {
                studentArrayList.add(check);
            } else {
                writer.write("\nLine " + str1);
            }

        }

        writer.close();
    }

    private static void display() {
        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.println(studentArrayList.get(i));
        }
    }

    private static void readSerFile()
	{
        studentArrayList = null;
		try{
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("StudentData.ser"));
			// Explicit Casting
			studentArrayList = (ArrayList<Student>) objectInputStream.readObject();
			objectInputStream.close();
		}
		catch(IOException ioException){
			System.err.println("Error opening file.");
			System.exit(1);
		}
		catch(ClassNotFoundException classNotFoundException){
			System.err.println("Class not found.Terminating...");
			System.exit(1);
		}
        
    }


    public static void main(String[] args){
        float avgGPA = 0.0f;
        float avgAge = 0.0f;
        
		try{
			addStudent(args[0]);
			ObjectOutputStream StudentData = new ObjectOutputStream(new FileOutputStream("StudentData.ser"));
			StudentData.writeObject(studentArrayList);
			StudentData.close();
		}
		catch(IOException ioException){
			System.err.println("Error opening file.");
			System.exit(1);
		}
		catch(Exception ex){
			System.err.println("Error opening file.");
		}
        
        readSerFile();
        System.out.println("UnSorted ");
        display();
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSID().compareTo(o2.getSID());
            }
        });
        System.out.println(" Sorted list by SID");
        display();
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        System.out.println(" Sorted list by Age");
        display();
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getCGPA().compareTo(o1.getCGPA());
            }
        });
        System.out.println("Sorted list by CGPA in descending order");
        display();
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFName().compareTo(o2.getFName());
            }
        });
        System.out.println("Sorted list by First Name");
        display();
        for (int i = 0; i < studentArrayList.size(); i++) {

            avgGPA += Float.parseFloat(studentArrayList.get(i).getCGPA());
            avgAge += Float.parseFloat(studentArrayList.get(i).getAge());
        }
        System.out.println("The average is " + (avgAge / studentArrayList.size()));
        System.out.println("The CGPA is " + (avgGPA / studentArrayList.size()));


    }

}


class Student implements Serializable {
    private String SID, FName, LName, CNIC, Age, CGPA, EmailAddress;
	
	//Constructor
    public Student(String SID, String FName, String LName, String CNIC, String age, String CGPA, String emailAddress) {
        this.SID = SID;
        this.FName = FName;
        this.LName = LName;
        this.CNIC = CNIC;
        Age = age;
        this.CGPA = CGPA;
        EmailAddress = emailAddress;
    }
    public Student() {
		
    }

    @Override
    public String toString() {
        return "Student{" +"SID='" + SID + '\'' +", FName='" + FName + '\'' +", LName='" + LName + '\'' +", CNIC='" + CNIC + '\'' + ", Age='" + Age + '\'' +", CGPA='" + CGPA + '\'' +", EmailAddress='" + EmailAddress + '\'' +  '}';
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getCGPA() {
        return CGPA;
    }

    public void setCGPA(String CGPA) {
        this.CGPA = CGPA;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }
}