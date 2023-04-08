import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class program8 {
    public static void main(String args[]) {
        try {
            Student s1 = new Student(14, "Adi");
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();

            FileInputStream fin = new FileInputStream("f.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Student s2 = (Student) in.readObject();
            in.close();

            System.out.println("Student ID: " + s2.id);
            System.out.println("Student Name: " + s2.name);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}