import javax.xml.parsers.SAXParser;
import java.util.Scanner;
import java.util.ArrayList;


public class Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name :  ");
        String nameinput =sc.nextLine();


        ArrayList<String> items = new ArrayList<>();

        items.add("Milk");
        items.add("Bread");
        items.add("Eggs");

        if(items.contains(nameinput)){
            System.out.println("yes");
        }else {
            items.add(nameinput);
            System.out.println("nothing , so add  :" + nameinput);

        }

        System.out.println("Current items: " + items);
        sc.close();













    }
}
