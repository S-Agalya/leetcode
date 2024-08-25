//using hashmap class 
import java.util.HashMap;
class Hashmapdemo{
public static void main(String[] args){
HashMap<Integer,String> places=new HashMap<Integer,String>();
places.put(0,"chennai");
places.put(1,"hydrabad");
places.put(2,"mumbai");
places.put(3,"bangalore");
places.put(4,"coimabtore");
//System.out.println(places.get(3));
places.remove(3);
System.out.println(places);
// for(int i:places.keySet()){
//   System.out.println(i);
// }
// for(String i:places.values()){
//   System.out.println(i);
// }

}
}