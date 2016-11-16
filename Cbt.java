import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

 class Student extends Cbt{ 
      int marks=0;
      public void choose()
    {
      
        try(BufferedReader br3 = new BufferedReader(new FileReader("data.txt"))){
              System.out.println("Enter the username");
              String s2=s.nextLine();                    
              System.out.println("Enter the password");
              String s3=s.nextLine();
              String line4;
              int ch1=0;
              int ch2=0;
              while((line4=br3.readLine())!=null)   {
                  if(s2.equals(line4)) {
                      ch1=1;
                  }
                  if(s3.equals(line4)) {
                      ch2=1;
                                      }
                                                    
              if(ch1==1&&ch2==1){
                  System.out.println("Login sucess");
                  test();        
                               }
              else{
                  System.out.println("Login failed");                                
                  }
                                                  }
                                                                              }
    catch (IOException e) {
      e.printStackTrace();
                          }
    }


  Scanner s = new Scanner(System.in);

  public void test(){      
  new Reminder(5*60);
  System.out.println("Task scheduled.");
  
    int ch=0;
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

                       try( BufferedReader br = new BufferedReader(new FileReader("mcq.txt")))
                        {
                          BufferedReader br1 = new BufferedReader(new FileReader("mans.txt"));

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
           try( BufferedReader br = new BufferedReader(new FileReader("fillin.txt")))
                        {
                          BufferedReader br1 = new BufferedReader(new FileReader("fans.txt"));

                          String current;
                           
                          
                          int flag=0;
                          
                          while ((current = br.readLine()) != null ) {

                            
                            System.out.println(current);
                            flag++;
                            if(flag==1){
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
  public void oneWord(){
          try( BufferedReader br = new BufferedReader(new FileReader("oneq.txt")))
                        {
                          BufferedReader br1 = new BufferedReader(new FileReader("oans.txt"));

                          String current;
                           
                          
                          int flag=0;
                          
                          while ((current = br.readLine()) != null ) {

                            
                            System.out.println(current);
                            flag++;
                            if(flag==1){
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

                          
class Faculty extends Cbt{
  public void choose()
    {
        Scanner s = new Scanner(System.in);
        try(BufferedReader br3 = new BufferedReader(new FileReader("data.txt"))){
              System.out.println("Enter the username");
              String s2=s.nextLine();                   
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
    }

public abstract class Cbt{

  public abstract void choose();

 public static void main(String[] args) {
     Scanner s =new Scanner(System.in);
     System.out.println("Faculty or Student?");
     String user =s.nextLine();

    if(user.equals("faculty"))
      {
        Faculty f = new Faculty();
        f.choose();
        }
     if(user.equals("student"))
        {
        Student stu= new Student();
        stu.choose();
     }
       else{
      System.out.println("Invalid Username or Password");
    }  
 } // for main//
 
}
 