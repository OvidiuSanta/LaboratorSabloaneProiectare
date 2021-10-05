import java.util.ArrayList;
import java.util.List;

public class Book {
    public List<String> paragrafe;
    public List<String> imagini;
    public List<String> tabele;

    public Book(List<String> paragrafe, List<String> imagini, List<String> tabele) {
        this.paragrafe = new ArrayList<>();
        this.imagini = new ArrayList<>();
        this.tabele = new ArrayList<>();
    }

    public void createNewParagraf(String paragraf){
        paragrafe.add(paragraf);
    }

    public void createNewImg(String imagine){
        imagini.add(imagine);
    }

    public void createNewTab(String tabel){
        tabele.add(tabel);
    }


    public void print(){
        System.out.println(paragrafe);
        System.out.println(imagini);
        System.out.println(tabele);
    }
}
