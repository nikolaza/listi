import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Pocetna {

	public static void main(String[] args) {
		List<Integer> listaNaBroevi;
		listaNaBroevi = new Vector<>();
		listaNaBroevi.add(4);
		listaNaBroevi.add(15);
		listaNaBroevi.add(88);
		listaNaBroevi.add(50);
		List<Integer> pomaliOd50 = listaNaBroevi.stream()
				.filter(x -> x<=20)
				.map(x -> x*3)
				.collect(Collectors.toList());
		System.out.println(pomaliOd50);
		
		}
		
	}
		

