package _001_createPattern._003_clone.deepClone;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.setName("张三");
        Citation citation = new Citation();
        citation.setStudent(student);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("/Users/liyan/github_projects/patternDesign/src/_001_createPattern/_003_clone/deepClone/a.txt"));
        outputStream.writeObject(citation);
        outputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/liyan/github_projects/patternDesign/src/_001_createPattern/_003_clone/deepClone/a.txt"));
        Citation citation1 = (Citation) objectInputStream.readObject();
        objectInputStream.close();
        citation1.getStudent().setName("李四");
        System.out.println(citation1 == citation);
        citation.show();
        citation1.show();
    }
}
