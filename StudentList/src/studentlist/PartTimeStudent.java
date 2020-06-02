package studentlist;
/**
 * This class represents a part-time student
 * @author Jeremiah Torralba
 */
public class PartTimeStudent extends Student{
    private  int numCourses;
    
    public PartTimeStudent(String name, int numCourses) {
        super(name);
        this.numCourses = numCourses;
    }

    /**
     * @return the numCourses
     */
    public int getNumCourses() {
        return numCourses;
    }

    /**
     * @param numCourses the numCourses to set
     */
    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
}
