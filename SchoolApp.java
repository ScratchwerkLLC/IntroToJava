public class SchoolApp {

  public static void main(String[] args){
      System.out.println("This is my School App");

      int arraySize = args.length;

      String firstname = "";
      String lastname = "";

      double pointTotal = 0;
      double classTotal = 0;

      for(int i = 0; i < arraySize; i++){
          if(i == 0){
              firstname = args[i];
          }else if(i ==1){
              lastname = args[i];
          }else{
              pointTotal = pointTotal + convertToPoints(args[i]);
              classTotal = classTotal + 1;
          }
      }

      double studentGPA = calcGPA(classTotal, pointTotal);
      System.out.println("Student " + firstname + " " + lastname + " GPA is: " + studentGPA);

  }

  public static double calcGPA(double classes, double points){
      double gpa = points / classes;
      return gpa;
  }

  public static int convertToPoints(String letter){
      switch (letter){
          case "A" :
             return 4;
          case "B":
              return 3;
          case "C":
              return 2;
          case "D":
              return 1;
          default:
              return 0;
      }
  }


}
