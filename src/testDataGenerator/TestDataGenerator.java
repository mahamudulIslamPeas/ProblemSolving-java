package testDataGenerator;
import com.github.javafaker.Faker;
@SuppressWarnings("unused")
public class TestDataGenerator {
	static int numberOfData = 10; //Specify the number of data
	public static void main(String[] args) {
		for (int i=0; i<numberOfData; i++ ) 
		{
			print(randomEmail()); //call the method here
		}
	}
	static Faker faker = new Faker();
	public static String randomFirstName() {
		return faker.address().firstName();
		}
	private static String randomlastName() {
		return faker.address().lastName();
		}
	private static String randomName() {
		return randomFirstName() +" " + randomlastName();
		}
	private static String randomEmail() {
		return randomFirstName().toLowerCase() + "_" + randomlastName().toLowerCase().concat("@yopmail.com");
	}
	private static String randomCity() {
		return faker.address().cityName();
	}
	private static String randomPostalCode() {
		return faker.address().zipCode();
	}
	private static void print( String passedPararm) {
		System.out.println(passedPararm);
	}
}

