public class HW2{
    public static void main(String[] args) {
        Student student1= new Student();
        student1.setName("Anne");
        student1.setId("10802XXXX");
        student1.setGender("Female");
        student1.setDepartment("CSIE");
        student1.setGroup("B");

        System.out.println("Name:"+student1.getName());
        System.out.println("Id:"+student1.getId());
        System.out.println("Gender:"+student1.getGender());
        System.out.println("Department:"+student1.getDepartment());
        System.out.println("Group:"+student1.getgroup());
        System.out.println();

        Student student2= new Student();
        student2.setName("Roger");
        student2.setId("10802AFDG");
        student2.setGender("Male");
        student2.setDepartment("CSIE");
        student2.setGroup("A");

        System.out.println("Name:"+student2.getName());
        System.out.println("Id:"+student2.getId());
        System.out.println("Gender:"+student2.getGender());
        System.out.println("Department:"+student2.getDepartment());
        System.out.println("Group:"+student2.getgroup());
        System.out.println();

        Student student3= new Student();
        student3.setName("Kate");
        student3.setId("10802FGRQ");
        student3.setGender("Female");
        student3.setDepartment("CSIE");
        student3.setGroup("A");

        System.out.println("Name:"+student3.getName());
        System.out.println("Id:"+student3.getId());
        System.out.println("Gender:"+student3.getGender());
        System.out.println("Department:"+student3.getDepartment());
        System.out.println("Group:"+student3.getgroup());
        System.out.println();
    }
}