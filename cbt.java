import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;



 class Student { 

  Scanner s = new Scanner(System.in);

  public void test() throws FileNotFoundException,IOException{      
  new Reminder(5*60);
  System.out.println("Task scheduled.");
  
    int ch=0;
       // public void option(){


          System.out.println("Enter the option\n");
          System.out.println("1.MCQ \n 2.Fill in the blanks \n 3.One Word ");
          ch=s.nextInt();
          switch(ch)
          {
            case 1:mcq();
                    break;
            case 2:fillIn();
                    break;
            case 3: oneWord();
                    break;
            default: System.out.println("Invalid option");
          }
        }
                           // }
          public void mcq() {

             
         int marks=0;

   try( BufferedReader br = new BufferedReader(new FileReader("questions.txt")))
    {
      BufferedReader br1 = new BufferedReader(new FileReader("answers.txt"));

      String current;
       
      
      int flag=0;
      
      while ((current = br.readLine()) != null ) {

        
        System.out.println(current);
        flag++;
        if(flag==5){
          String n =s.nextLine();
          String ans = br1.readLine();
          if(n.equals(ans)){
                System.out.println("Correct!");
                  marks++;
              }
              
              else{
                System.out.println("Wrong!");
              }
          flag=0;
          System.out.println("Score"+ marks);
        }
        

      }
      
    }
 catch (IOException e) {
      e.printStackTrace();
    }

        }
   // System.out.println("Score"+marks);

   // System.out.println("Score" + marks);
 
  public void fillIn(){

  }
  public void oneWord(){

  }
        
 }
        
       

class Reminder extends Student{
    Timer timer;

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
  }

    class RemindTask extends TimerTask {
        public void run() {

            System.out.println("Time's up!");

            //Do you want to 
            timer.cancel(); //Terminate the timer thread
        }
    } 
}

class cbt{
  public static void main(String[] args) throws FileNotFoundException,IOException{
    Scanner s =new Scanner(System.in);
    System.out.println("Faculty or Student?");
    String user =s.nextLine();
    if(user.equals("student")){
    try(BufferedReader br3 = new BufferedReader(new FileReader("data.txt"))){
              System.out.println("Enter the username");
              String s2=s.nextLine();                     //Error condition unique userid and password should be maintained *
              System.out.println("Enter the password");
              String s3=s.nextLine();
              String line4;
              int ch1=0;
              int ch2=0;
              while((line4=br3.readLine())!=null){   {
                  if(s2.equals(line4)) {
                      ch1=1;
                  }
                  if(s3.equals(line4)) {
                      ch2=1;
                  }
              }
              if(ch1==1&&ch2==1){
                  System.out.println("Login sucess");
                  Student stu=new Student(); 
                  stu.test();         
              }
              else{
                  System.out.println("Login failed");                                
              }
          }
    }catch (IOException e) {
      e.printStackTrace();
    }
  }
    else{
      System.out.println("Invalid Username or Password");
    }
  }
}
 