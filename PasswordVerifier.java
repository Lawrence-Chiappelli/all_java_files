public class PasswordVerifier
{
	
		public static final int MIN_PASSWORD_LENGTH = 6; // Constant for minimum password length
	   
		public static boolean isValid(String str, int charCount)
		{
			boolean status; // Validity status
		  
			if (str.length() >= MIN_PASSWORD_LENGTH && 
								  hasUpperCase(str, charCount) && 
				                  hasLowerCase(str, charCount) && 
								  hasDigit(str, charCount)   )
				status = true;
			else
				status = false;
			 
			return status;
		}

		private static boolean hasUpperCase(String str, int charCount)
		{
//			System.out.println("Called hasUpperCase. charCount: " + charCount);
			boolean status = true;
			char ch;
			int index;
			
				for(index = 0; index < charCount; index++)
				{			
					ch = str.charAt(index);
						if(Character.isUpperCase(ch))
						{
							//FOUND UPPERCASE
//							System.out.println("Uppercase found");
							status = true;		
							return status;
						}
						else
						{
							//DID NOT FIND UPPERCASE
							status = false;
//							System.out.println("Uppercase not found");					
						}
				}
				
			return status;
		}
	   
		private static boolean hasLowerCase(String str, int charCount)
		{
//			System.out.println("Called hasLowerCase");
			boolean status = true;
			char ch;
			int index;
			

				for(index = 0; index < charCount; index++)
				{
					ch = str.charAt(index);
						if(Character.isLowerCase(ch))
						{
							//LOWER CASE FOUND
							status = true;
							return status;
//							System.out.println("Lowercase found");
						}
						else
						{
							//DID NOT FIND LOWERCASE
							status = false;
//							System.out.println("Lowercase not found");			
						}				
				}

			return status;
		}
	   
		private static boolean hasDigit(String str, int charCount)
		{
//			System.out.println("Called hasDigit");
			boolean status = true;
			char ch;
			int index;
			
				for(index = 0; index < charCount; index++)
				{
					ch = str.charAt(index);
						if(Character.isDigit(ch))
						{
							//FOUND DIGIT CHARACTER
							status = true;
//							System.out.println("Digit found");
							return status;
						}
						else
						{
							//DID NOT FIND DIGIT CHARACTER
							status = false;
//							System.out.println("Digit not found: ");							
						}					
				}
			return status;
		}
		
		
}