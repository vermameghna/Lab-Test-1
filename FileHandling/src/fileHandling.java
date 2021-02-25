import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fileHandling {
	public static void main(String[] args) {
		String code;
		int quantity;
		Double unitPrice;
		List<MerchandiseItem> merchandises = new ArrayList<>();

		String line = null;
		
		try (BufferedReader br = new BufferedReader(
				new FileReader(new File("C:\\Users\\ve00ym226\\Documents\\Lab Test 1\\FileHandling\\src\\input.dat.txt")))) {

			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(" ");
				code = tokens[0];
				quantity = Integer.parseInt(tokens[1]);
				unitPrice = Double.parseDouble(tokens[2]);
				merchandises.add(new MerchandiseItem(code, quantity, unitPrice));
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		System.out.println("Sorting by name ----------------");
		Collections.sort(merchandises, (o1, o2) -> o1.getItemCode().compareTo(o2.getItemCode()));
		merchandises.forEach((Item) -> System.out.println(Item));
		
		
		
		
		System.out.println("------------------------*********************************-----------------------");
		System.out.println("Sorting by price ----------------");
		System.out.println("-----------------------***********************************-----------------");
		
		//Sorting by Price
		Collections.sort(merchandises, (o1, o2) -> o2.getUnitPrice().compareTo(o1.getUnitPrice()));
		merchandises.forEach((Item) -> System.out.println(Item));
		

}
	
}
