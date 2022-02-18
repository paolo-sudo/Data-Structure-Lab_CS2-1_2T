import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

// movie record linked list

class Movies{
    int id;
    String title, actor, director;

        //overloading construct
    public Movies(int id, String title, String actor, String director){
        this.id = id;
        this.title = title;
        this.actor = actor;
        this.director = director;
    }
}
public class linked_list {
    
    public static void main(String[] args){
        //create a list of movies as instance of Movies class
        List<Movies> movie_rec = new LinkedList<Movies>();

        //add movies on the list
        Movies m1 = new Movies(111, "Spiderman 1", "Robin", "Manny");
        Movies m2 = new Movies(222, "Spiderman 2", "Manny", "Robin");
        Movies m3 = new Movies(333, "Spiderman 3", "Parker", "Sharon");

        movie_rec.add(m1);
        movie_rec.add(m2);
        movie_rec.add(m3);


        System.out.println(m1.hashCode());

        for(Movies m : movie_rec){
            System.out.println(m.id + " " + " " + m.title + " " + m.actor + " " + m.director + " ");
        }
        
        System.out.println();
        movie_rec.remove(1);
        for(Movies m : movie_rec){
            System.out.println(m.id + " " + " " + m.title + " " + m.actor + " " + m.director + " ");
        }
    }
 }


    /*
        LinkedList<String> fname = new LinkedList<String>();
        LinkedList<String> lname = new LinkedList<String>();

        fname.add("Paolo Santos");
        fname.add("Christian Andrei");
        fname.add("Raychal Andreil");

        Iterator<String> list = fname.iterator();
            while(list.hasNext()){
            System.out.print(" " + list.next());
        }

        System.out.println();
        //add element at the last position
        fname.addLast("Christian Andrei");
        Iterator<String> list2 = fname.iterator();
            while(list2.hasNext()){
            System.out.print(" " + list2.next());
        }

        System.out.println();
        fname.addFirst("Mark Peter");
        Iterator<String> list3 = fname.iterator();
        while(list3.hasNext()){
            System.out.print(" " + list3.next());
        }

        System.out.println();
        fname.add(2, "Manny");
        Iterator<String> list4 = fname.iterator();
        while(list4.hasNext()){
            System.out.print(" " + list4.next());
        }
    }
    
    
}
*/