public class CSDepartment extends Departments {
    private final int departmentSize;
    public CSDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }
    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }
    public static void main(String[] args) {

        CSDepartment csDep = new CSDepartment(10);
        System.out.println("Department Size: " + csDep.getDepartmentSize());
    }
}
