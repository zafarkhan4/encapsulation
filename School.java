public class School {

  public static void main(String [] args) {

    Student student1 = new Student("Zafar", "B", 1);
    System.out.println(student1.getGrade());
    System.out.println(student1.getGroup());
    student1.upgrade();
    System.out.println("Details after upgrading grade");
    System.out.println(student1.getGrade());
    System.out.println(student1.getGroup());

    student1.downgrade();
    System.out.println("Details after downgrading grade");
    System.out.println(student1.getGrade());
    System.out.println(student1.getGroup());
    
  }
  
}
