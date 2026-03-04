import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    Scanner sc = new Scanner(System.in);
    String choose;
    boolean run = true;
    ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args){
        Lista listaobj = new Lista();
        listaobj.def();
        listaobj.save(listaobj.list);
    }
    void def(){
        while(run){
            System.out.println("Choose: \n 1-Add \n 2-Show \n 3-Exit \n 4-Exit and save");
            choose = sc.nextLine();
            if (choose.equals("1")){
                System.out.println("New:");
                String ch = sc.nextLine();
                list.add(ch);
            } else if (choose.equals("2")) {
                System.out.println(list);
            } else if (choose.equals("3")) {
                run = false;
                list.clear();
            } else if (choose.equals("4")) {
                run = false;
            }
        }
    }
    void save(ArrayList<String> data){
        try {
            FileWriter fw = new FileWriter("text.txt");
            for (String s : data){
                fw.write(s +"\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("-Error-");
        }
    }
}
