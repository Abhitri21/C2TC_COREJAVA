import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> orig=List.of(13,45,63,24,78,96,54,33,21,27,89);
		System.out.println(orig);
		
		
	/*	List<Integer> evenlist=new ArrayList<>();
		for(Integer i:orig)
		{
		 if(i%2==0)
		 {
			 evenlist.add(i;)
			
		 }

	}
   System.out.println(evenlist); */
		Stream<Integer> stream=orig.stream();
	  List<Integer>	l=stream.filter(i->i>20).collect(Collectors.toList());
	  System.out.println(l);
	}
}
