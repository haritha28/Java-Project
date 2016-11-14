import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;




class Student {
 
  public void test() throws FileNotFoundException,IOException{            
        int points=0;
        BufferedReader br1 = new BufferedReader(new FileReader("answers.txt"));

    try (BufferedReader br = new BufferedReader(new FileReader("questions.txt")))
    {
       int flag=0;
      String current;
      Scanner s = new Scanner(System.in); 
      
     
      
      while ((current = br.readLine()) != null ) {

        
        System.out.println(current);
        flag++;
        if(flag==6){
          String n =s.nextLine();
          String ans = br1.readLine();
          
          if(n.equals(ans)){
                System.out.println("Correct!");
                  points++;
                  flag=0;
              }
              
              else{
                System.out.println("Wrong!");
              }
          
        }
        

      }
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Score: " + points);
  }
}


class cbt{
  public static void main(String[] args) throws FileNotFoundException,IOException{
    Scanner s =new Scanner(System.in);
    System.out.println("Faculty or Student?");

    String user =s.nextLine();
    if(user.equals("student")){
    System.out.println("----------------------------------------------------------------------------------------------------------------------------");
    System.out.println("                                                          Student                                                                                       ");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------");
    try(BufferedReader br3 = new BufferedReader(new FileReader("data.txt"))){
              System.out.println("Username:");
              String users=s.nextLine();   
              System.out.println("Password");                  
              String pass=s.nextLine();
              String line4;
              int count1=0;
              int count2=0;
              while((line4=br3.readLine())!=null){   {
                  if(users.equals(line4)) {
                      count1=1;
                  }
                  if(pass.equals(line4)) {
                      count2=1;
                  }
              }
              if(count1==1&&count2==1){
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
      System.out.println("Login Failed");
    }
  }
}
 