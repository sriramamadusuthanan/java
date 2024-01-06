package java_from_0;

public class Array2 {
	
	
	public class Student
	{
	
		int Rollno;
		String Name;
		float Mark;
		
	}

	public static void main(String[] args) {
		
		
		Array2 ar = new Array2();
		
		Student stud1 = ar.new Student();
		
		stud1.Rollno = 1;
		stud1.Name = "Sri ram";
		stud1.Mark = 12.4f;
		
		
		Student stud2 = ar.new Student();
		
		stud2.Rollno = 2;
		stud2.Name = "joswin";
		stud2.Mark = 13.4f;
		
		
		Student stud3 = ar.new Student();
		
		stud3.Rollno = 3;
		stud3.Name = "Prince";
		stud3.Mark = 14.4f;
		
		//students array
		// this array will hold student refernces in hiep memory 
		
		Student studentsarray[] = new Student[3];
		
		studentsarray[0] = stud1;
		studentsarray[1] = stud2;
		studentsarray[2] = stud3;
		
		for (int i=0; i<studentsarray.length; i++)
		{
			System.out.println(studentsarray[i].Rollno + " " + 
					studentsarray[i].Name + " " +
					studentsarray[i].Mark);
		}
 		
		
		

	}

}
