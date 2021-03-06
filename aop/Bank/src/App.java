import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.displayFunc();
		List<Integer> alist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		List<Integer> narray = alist.stream().map(i -> i + 2).filter(i -> i % 2 == 0).collect(Collectors.toList());
		narray.forEach((item) -> {
			System.out.println(item);
		});
		List<Integer> marray = alist.stream().map((i) ->{
			return (i + 2);
			
		}).collect(Collectors.toList());
		System.out.println("******************************");
		marray.forEach((item) -> {
			System.out.println(item);
		});
	}

}
