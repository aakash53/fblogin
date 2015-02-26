package model;

public class Student {
	
	private Integer id;
	private Integer age;
   private String name;
   private String Branch;
   private String grade;
   private String university;
   
   public String getBranch() {
	return Branch;
}
public void setBranch(String branch) {
	Branch = branch;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getUniversity() {
	return university;
}
public void setUniversity(String university) {
	this.university = university;
}


   public void setAge(Integer age) {
      this.age = age;
   }
   public Integer getAge() {
      return age;
   }

   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }

   public void setId(Integer id) {
      this.id = id;
   }
   public Integer getId() {
      return id;
   }
}