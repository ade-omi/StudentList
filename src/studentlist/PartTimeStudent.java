
package studentlist;

/**
 *@date Feb 7 2021
 * @author dapo
 */
public class PartTimeStudent extends Student {
    //This is done
    
    private int numCourses;

    public PartTimeStudent(int numCourses, String name) {
        super(name);
        this.numCourses = numCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
}
