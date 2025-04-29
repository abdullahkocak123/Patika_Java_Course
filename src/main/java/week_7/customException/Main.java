package week_7.customException;

public class Main {

    public static void main(String[] args) {

        Stu s = null;

        try {

            s = Stu.find(123);

            System.out.println("ID : " + s.getId());

            System.out.println("Name : " + s.getName());

        } catch (StuException e) {

            System.out.println(e.getMessage());

        }

    }

}
