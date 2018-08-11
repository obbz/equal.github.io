package oubao;

public class index {
    public static void main(String[] args) {
//        int x = 10;
//        int y = 10;
//        String str1 = new String("abc");
//        String str2 = str1;

        //        System.out.println(x == y); // 输出true
//        System.out.println(str1 == str2); // 输出false


        Student s1 = new Student(23);
        Student s2 = new Student(23);
        System.out.println(s1.equals(s2));


    }
    static class Student{
        private int age;
        public Student(){}
        public Student(int age){
            this.age=age;
        }
        @Override
        public boolean equals(Object obj) {
             Student other=(Student ) obj;
             return this.age==other.age;
        }
    }

}
