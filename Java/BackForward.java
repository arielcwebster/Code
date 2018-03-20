import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.zip.*;



public class AddressBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	  new ArrayList<Entry>();

      ZipFile zip = null;
      String path = "/Users/kisslynezim/Desktop/address_book.zip";
      try {
          zip = new ZipFile(path);
      } catch (IOException e) {
          System.out.println("Zip didn't open");
          e.printStackTrace();
      }

      String names = "address_book/names.txt";
      String addresses = "address_book/addresses.txt";
      String phones = "address_book/phones.txt";

      ZipEntry namesEntry = zip.getEntry(names);
      zip.getEntry(addresses);
      zip.getEntry(phones);

      InputStream namesStream = null;
      try {
          namesStream = zip.getInputStream(namesEntry);
      } catch (IOException e) {
          System.out.println("Input never set up");
          e.printStackTrace();
      }
      Scanner read = new Scanner(namesStream);

      Pattern lookForTab = Pattern.compile("\t");
      read.useDelimiter(lookForTab);

      while (read.hasNext()) {
          String Line = read.nextLine();
          System.out.println(Line);
      }

      ZipEntry addressesEntry = zip.getEntry(addresses);

      InputStream addressesStream = null;
      try {
          addressesStream = zip.getInputStream(addressesEntry);
      } catch (IOException e) {
          System.out.println("Input never set up");
          e.printStackTrace();
      }

      Scanner read1 = new Scanner(addressesStream);

      Pattern lookForTab1 = Pattern.compile("\t");
      read1.useDelimiter(lookForTab1);

      while (read1.hasNext()) {
          String Line = read1.nextLine();
          System.out.println(Line);

      }
      ZipEntry phonesEntry = zip.getEntry(phones);

      InputStream phonesStream = null;
      try {
          phonesStream = zip.getInputStream(phonesEntry);
      } catch (IOException e) {
          System.out.println("Input never set up");
          e.printStackTrace();
      }

      Scanner read2 = new Scanner(phonesStream);

      Pattern lookForTab2 = Pattern.compile("\t");
      read2.useDelimiter(lookForTab2);

      while (read2.hasNext()) {

          String Line = read2.nextLine();
          System.out.println(Line);

      }
  }
}