import java.nio.charset.StandardCharsets;
import java.util.HashMap;


public class Zomato {

	/**
	 * @param args
	 */
	
	public static HashMap<String, Character> mappings = new HashMap<String , Character>(); 
	public static HashMap<Character, String> forwardMappings = new HashMap<Character , String>(); 
	
	public static void main(String[] args) {
		//Each possible character is assigned a code to represent it. So instead of 2Bytes i.e. 16 bits for each character, we'll just need a maximum of 5bits.
		updateMappings();
		
		//your input text here 
		//NOTE: compression useful for inputText length > 10
		//size of this input = 100
		String compressed = compress("kuchbbhikarrdebhenchodkuchbbhikarrdebhenchodkuchbbhikarrdebhenchodkuchbbhikarrdebhenchodkuchbbhikarrdebhenchodkuchbbhikarrdebhenchodkuchbbhikarrdebhenchodkuchbbhikarrdebhenchodkuchbbhikarrdebhenchodkuchbbhikarrdebhenchodkuchbbhikarrdebhenchod");
		System.out.println("Compressed-  "+compressed);
		byte[] compressedSize = compressed.getBytes(StandardCharsets.UTF_8);
		System.out.println("Size of compressed string = "+compressedSize.length+" bytes");
		
		String decompressed = decompress(compressed);
		System.out.println("Decompressed-  "+decompressed);
		byte[] decompressedSize = decompressed.getBytes(StandardCharsets.UTF_8);
		System.out.println("Size of decompressed string = "+decompressedSize.length+" bytes");
		
	

	}
	
	public static String compress(String input)
	{
		
		if(input.length()<10)
			System.out.println("NOTE: This compresion will be useful for larger input sets");
		
		input=input+"junk";
		StringBuilder byteStream = new StringBuilder();
		
		
		//generating byteStreamString from the forwardMappings map
		int i=0;
		while(i<input.length())
		{
			String code = forwardMappings.get(input.charAt(i));
			if(code==null)
			{
				System.out.println("INPUT CAN ONLY CONTAIN CHARACTERS IN THE RANGE a-z");
				System.exit(0);
			}
			byteStream.append(code);
			
			i++;
		}
		int size = byteStream.length()/7;
		size++;
		byte[] byteArray = new byte[size];
		
		 i =0;
		 int j=0;
		 int byteCounter=0;
		 
		 //generating a byte array out of the stream.
		while(i<byteStream.length())
		{
			
			StringBuilder x = new StringBuilder();
			j=i;
			int count = 0;
			while(j<byteStream.length() && count<7)
			{
				x.append(byteStream.charAt(j));
				count++;
				j++;
			}
			//Integer byteValueInteger = Integer.parseInt(x.toString(),2);
			Byte byteValue = Byte.parseByte(x.toString(), 2);
			byteArray[byteCounter] = byteValue;
			//System.out.println(byteValue);
			byteCounter++;
			i=j;
		}
		String returnValue = new String(byteArray);
		
		return returnValue;
	}
	public static String decompress(String compressed)
	{
		byte[] bA = compressed.getBytes(StandardCharsets.UTF_8);	
		int i=0;
		StringBuilder stream = new StringBuilder();
		StringBuilder output = new StringBuilder();
		
		//generating a byte stream string from the input string
		while(i<bA.length)
		{
			byte b = bA[i];
			String s;
			s ="" + ("0000000" + Integer.toBinaryString(0xFF & b)).replaceAll(".*(.{7})$", "$1");
			stream.append(s);
			i++;
		}
		//System.out.println(stream);
		i=0;
		int j=0;
		
		//updating the output string by traversing the byteStream string and checking the mappings map
		while(i<stream.length())
		{
			j=i;
			StringBuilder temp = new StringBuilder();
			while(j<stream.length())
			{
				temp.append(stream.charAt(j));
				if(mappings.containsKey(temp.toString())){
					output.append(mappings.get(temp.toString()));
					j++;
					break;
				}
				
				j++;
			}
			
			i=j;
		}
		
		//Integer.toBinaryString(byteValue & 0xFF) 
		
		String returnValue = output.toString();
		Integer ind = returnValue.lastIndexOf("ju");
		return returnValue.substring(0,ind);
	}
	
	public static void updateMappings()
	{
		//Used Hoffman tree approach to figure out these codes.
		//Please check the attached image
		mappings.put("0000",'a'); forwardMappings.put('a',"0000");
		mappings.put("0001", 'b'); forwardMappings.put('b',"0001");
		mappings.put("0010", 'c'); forwardMappings.put('c',"0010");
		mappings.put("0011", 'd'); forwardMappings.put('d',"0011");
		mappings.put("10000", 'e'); forwardMappings.put('e',"10000");
		mappings.put("10001", 'f'); forwardMappings.put('f',"10001");
		mappings.put("10010", 'g'); forwardMappings.put('g',"10010");
		mappings.put("10011", 'h'); forwardMappings.put('h',"10011");
		mappings.put("10100", 'i'); forwardMappings.put('i',"10100");
		mappings.put("10101", 'j'); forwardMappings.put('j',"10101");
		mappings.put("10110", 'k'); forwardMappings.put('k',"10110");
		mappings.put("10111", 'l'); forwardMappings.put('l',"10111");
		mappings.put("11000", 'm'); forwardMappings.put('m',"11000");
		mappings.put("11001", 'n'); forwardMappings.put('n',"11001");
		mappings.put("11010", 'o'); forwardMappings.put('o',"11010");
		mappings.put("11011", 'p'); forwardMappings.put('p',"11011");
		mappings.put("11100", 'q'); forwardMappings.put('q',"11100");
		mappings.put("11101", 'r'); forwardMappings.put('r',"11101");
		mappings.put("11110", 's'); forwardMappings.put('s',"11110");
		mappings.put("11111", 't'); forwardMappings.put('t',"11111");
		mappings.put("01000", 'u'); forwardMappings.put('u',"01000");
		mappings.put("01001", 'v'); forwardMappings.put('v',"01001");
		mappings.put("01010", 'w'); forwardMappings.put('w',"01010");
		mappings.put("01011", 'x'); forwardMappings.put('x',"01011");
		mappings.put("0110", 'y'); forwardMappings.put('y',"0110");
		mappings.put("0111", 'z'); forwardMappings.put('z',"0111");
		
		
	}

}
