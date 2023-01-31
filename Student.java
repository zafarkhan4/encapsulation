
public class Student {

  private String name;
  private String grade;
  private int group;
  private String secretNickName;

  private enum StudentGrade {
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    F("F");

    public final String grade;

    private StudentGrade(String grade) {
      this.grade = grade;
    }

    public static StudentGrade grade(String label) {
      for (StudentGrade e : values()) {
        if (e.grade.equalsIgnoreCase(label)) {
          return e;
        }
      }
      return null;
    }
  };

  public Student(String name, String grade, int group) {

    StudentGrade studentGrade = StudentGrade.grade(grade);
    
    if (studentGrade == null)
      throw new IllegalArgumentException("Group must be between 1 and 6");

    if (group < 1 || group > 6)
      throw new IllegalArgumentException("Group must be between 1 and 6");

    this.name = name;
    this.grade = studentGrade.grade;
    this.group = group;
    this.secretNickName = "MySecretNickName";
  }

  public String getName() {
    return name;
  }

  public String getGrade() {
    return grade;
  }

  public int getGroup() {
    return group;
  }

  public void upgrade() {
    changeGrade(true);
  }

  public void downgrade() {
    changeGrade(false);
  }

  private void changeGrade(boolean upgrade) {
    switch(grade) {
      case "A":
        this.grade = upgrade ? "A" : "B";
        break;
      case "B":
        this.grade = upgrade ? "A" : "C";
        break;
      case "C":
        this.grade = upgrade ? "B" : "D";
        break;
      case "D":
        this.grade = upgrade ? "C" : "E";
        break;
      case "E":
        this.grade = upgrade ? "D" : "F";
        break;
      case "F":
        this.grade = upgrade ? "E" : "E";
        break;
    }
  }

}