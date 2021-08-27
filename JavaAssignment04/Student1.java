//2.Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'


class Student1
{
    int  rollno_of_Sam=54;
    int rollno_of_john=65;
    long phoneno_of_Sam=9421357924L;
    long phoneno_of_john=9146585914L;
    String adrress_of_sam="latur", addrress_of_john="pune";
   public static void main(String[] args)
    {
       Student1 s1=new Student1();
       Student1 s2=new Student1();
       System.out.println("Roll Number of the Sam::"+s1.rollno_of_Sam);
       System.out.println("Roll Number of the John::"+s2.rollno_of_john);
       System.out.println("Phone Number of the sam::"+s1.phoneno_of_Sam);
       System.out.println("Phone Number of the John::"+s2.phoneno_of_john);
       System.out.println("Address of sam::"+s1.adrress_of_sam);
       System.out.println("Address of john::"+s2.addrress_of_john);
    }
}