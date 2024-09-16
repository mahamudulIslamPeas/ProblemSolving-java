package testDataGenerator;
import com.github.javafaker.Faker;

import static org.bouncycastle.asn1.iana.IANAObjectIdentifiers.mail;


@SuppressWarnings("unused")
public class TestDataGenerator {
	static int numberOfData = 10; //Specify the number of data

	public static void main(String[] args) {
        int i;
        for (i = 0; i < numberOfData; i++) {
            print(randomEmail());
        }
        print("TotalCount: " + i);
    }
	static Faker faker = new Faker();
	public static String randomFirstName() {
		return faker.address().firstName();
	}
	public static String randomlastName() {
		return faker.address().lastName();
	}
	private String randomName() {
		return randomFirstName() +" " + randomlastName();
	}
	public static String randomEmail() {
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

