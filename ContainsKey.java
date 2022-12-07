import java.util.HashMap;

public class ContainsKey {
    public static void main(String[] args){
        HashMap<String, String> places = new HashMap<String, String>();
    
        places.put("New York", "The Bronx");
        places.put("Georgia", "College Park");
        places.put("California", "San Ysidro");
        places.put("Virginia", "Ocean View");
        
        System.out.println(places.containsKey("California"));
        System.out.println(places.containsKey("New York"));
        System.out.println(places.containsKey("Maryland"));
}
}
