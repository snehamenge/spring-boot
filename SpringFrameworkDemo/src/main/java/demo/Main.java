package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // This is by setting getter setter method and constructor-args
        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
        System.out.println(staff.getQualification());

        //This is by using property method
        Nurse n = context.getBean(Nurse.class);
        n.assist();

        //This is by referencing id
        Specialist sp = (Specialist) context.getBean("spec");
        sp.assist();

    }
}
