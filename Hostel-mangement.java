import java.util.*;
class Student
{
    private int Room_No;
    private String Student_Name;
    private int Bad_No;

    Student(int  Room_No,String Student_Name,int  Bad_No )
    {
        this.Room_No=Room_No;
        this.Student_Name=Student_Name;
        this. Bad_No= Bad_No;
    }
    public int getRoom_No()
    {
        return  Room_No;

    }
    public int getBad_No()
    {
        return  Bad_No;
    }
    public String getStudent_Name()
    {
        return Student_Name;
    } 
    public String toString()
    {
        return Room_No+" "+Student_Name+" "+ Bad_No;
    }
}

class Hostel_mangement{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        List<Student>c=new ArrayList<Student>();
        @SuppressWarnings("resource")
        Scanner s= new Scanner(System.in);
        @SuppressWarnings("resource")
        Scanner s1= new Scanner(System.in);

        int ch;
        do
        {
            System.out.println("------WELCOME------");
            System.out.println("===== VGU HOSTEL-1.2 =====  ");
            System.out.println("1. INSERT OF STUDENT ");
            System.out.println("2. DISPLAY IN STUDENT information");
            System.out.println("3. SEARCH OF THE STUDENT");
            System.out.println("4. DELETE OF STUDENT information");
            System.out.println("5. UPDATE OF STUDENT information");
            System.out.print("Enter your choice-:");
            ch=s.nextInt();

            switch (ch) 
            {
                case 1: 
                System.out.print("Enter Room_No -:");
                int Room_No=s.nextInt();
                System.out.print("Enter Student_Name -:");
                String Student_Name=s1.nextLine();
                System.out.print("Enter  Bad_No -:");
                int  Bad_No=s.nextInt();

                c.add(new Student(Room_No, Student_Name,  Bad_No));
               
                break;
                
                case 2:
                System.out.println("---------------------------");
                java.util.Iterator<Student> i=c.iterator();
                while (i.hasNext())
                {
                    Student e=i.next();
                    System.out.println(e); 
                }
                System.out.println("----------------------------");
                break;


                case 3:
                boolean found=false;
                System.out.println("Enter Room_No to search -:");
                Room_No=s.nextInt();
                System.out.println("---------------------------");
                i=c.iterator();
                while (i.hasNext())
                {
                    Student e=i.next();
                    if(e.getRoom_No()==Room_No)
                    {
                    System.out.println(e);
                    found=true;
                    } 
                }
                if(!found)
                {
                    System.out.println("Record not found");
                }
                System.out.println("----------------------------");
                break;
                

                case 4:
                found=false;
                System.out.println("Enter Room_No to delete -:");
                Room_No=s.nextInt();
                System.out.println("---------------------------");
                i=c.iterator();
                while (i.hasNext())
                {
                    Student e=i.next();
                    if(e.getRoom_No()==Room_No)
                    {
                    i.remove();
                    found=true;
                    } 
                }
                if(!found)
                {
                    System.out.println("Record not found");
                }
                else
                {
                    System.out.println("Record is deleted Successfully-----!");
                }
                System.out.println("----------------------------");
                break;



                case 5:
                found=false;
                System.out.println("Enter Room_No to update -:");
                Room_No=s.nextInt();
                System.out.println("---------------------------");
                ListIterator<Student>li=c.listIterator();
                while (li.hasNext())
                {
                    Student e=li.next();
                    if(e.getRoom_No()==Room_No)
                    {
                    System.out.print("Enter new name -:");
                    Student_Name=s1.nextLine();

                    System.out.print("Enter new  Bad_No -:");
                     Bad_No=s.nextInt();
                    li.set(new Student(Room_No, Student_Name,  Bad_No));
                    found=true;
                    } 
                }
                if(!found)
                {
                    System.out.println("Record not found");
                }
                else
                {
                    System.out.println("Record is update Successfully-----!");
                }
                System.out.println("----------------------------");
                break;
            }

        }
        while(ch!=0);
    }
}

