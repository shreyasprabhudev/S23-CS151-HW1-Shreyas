package hw1;

import java.util.Date;

public class PrabhudevTest{
        public static void main(String[] args){
                long time = 1047564000000L;
                Date dob = new Date(time);
                Student Shreyas = new Student("Shreyas", "I am a second year CS major attending SJSU.", 6750, Branch.COMPUTER_SCIENCE, dob);
                System.out.println(Shreyas);
        }
}

