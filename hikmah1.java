
public class hikmah1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 		String nh = "NURHIKMAH";
			System.out.println("Bentuk Plaintextnya adalah	:"+nh);
			
			String im = encript(nh);
			System.out.println("Bentuk Enkripsinya adalah	:"+im);
			
			String nh1 = decript(im);
			System.out.println("Bentuk Dekripsinya adalah	:"+nh1);  
			
			
		}
		public static final String[] nh = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," "};
		public static final String[] im = {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"," "};
		
		
		public static String encript(String plaintext){
			String ciphertext = "";
			for(int i=0 ; i<plaintext.length(); i++){
				String s0 = plaintext.substring(i, i+1);
				String s1 = " ";							
				//
				for(int j=0; j<nh.length; j++){				
					if(s0.equals(nh[j])){					
						s1 = im[j];
						break;
					}
				}
				ciphertext+=s1;
			}
					
			return ciphertext;
		}
		public static String decript(String ciphertext){
			String plaintext = "";
					for(int i=0 ; i<ciphertext.length(); i++){
						String s0 = ciphertext.substring(i, i+1);
						String s1 = " ";							
						//
						for(int j=0; j<im.length; j++){				
							if(s0.equals(im[j])){					
								s1 = nh[j];
								break;
							}
						}
						plaintext+=s1;
					}
			return plaintext;
		}
	}

