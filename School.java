class Subject{
    String subj_name;
    String teacher_name;
    int marks;

    Subject(String subj_name,String teacher_name,int marks){
        this.subj_name=subj_name;
        this.teacher_name=teacher_name;
        this.marks=marks;
    }
}
class Student{
    String student_name;
    Subject[] subjects;

    Student(String student_name,Subject[] subjects) {
        this.student_name=student_name;
        this.subjects=subjects;
    }
	void   average() {
    int total = 0;
    for (Subject s : subjects) {
        total += s.marks;
    }
    int  avg =  total / subjects.length;
    System.out.println(this.student_name +"'s avg marks are ="+avg);
}
void   marks() {
    
    for (Subject s : subjects) {
        System.out.println(this.student_name +"'s marks are ="+s.marks+" in subject "+s.subj_name);

    }
    
}

}
class School{
	public static void main(String[] args){
	Subject sub1=new Subject("Python","Abdul Sir",50);
	Subject sub2=new Subject("Java","Abdul Sir",60);
	Subject sub3=new Subject("Quant","Babar Sir",40);
	Subject[] arr={sub1,sub2,sub3};
	Student divyanshu=new Student("Divyanshu Mishra",arr);
	divyanshu.average();
	divyanshu.marks();
}}