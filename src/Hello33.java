public class Hello33 {
    public static void main(String a[]) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Shreyas";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Prashant";
        s2.marks = 77;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Pratik";
        s3.marks = 88;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int j = 0; j < students.length; j++) {
        //     System.out.println(students[j].name + " : " + students[j].marks);
        // }

        for(Student stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        }

        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for(int i = 0; i < nums.length; i++) {
        //     System.out.println();
        // }

        // for (int n : nums) {
        //     System.out.println(n);
        // }
    }
}