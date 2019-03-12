import java.util.Comparator;

public class StudentCompare implements Comparator<Student>  {
	public int compare(Student s1, Student s2) { 
		if (s1.cgpa < s2.cgpa) 	// highest cgpa will have high priority
			return 1; 			//arrange queue in descending order using  cgpa
		else if (s1.cgpa > s2.cgpa) 
			return -1; 
		else {
			if(s1.name.compareTo(s2.name)>0)
			return s1.name.compareTo(s2.name);	//arrange queue in ascending order alphabetically using name  
			else if(s1.name.compareTo(s2.name)<0) {
				return -1;
			}
			else {
				if(s1.token>s2.token) {//small token will have high priority
					return 1;			//arrange in ascending order using token value
				}
				else
					return 0;
			}
		}
		
		}
	
}
