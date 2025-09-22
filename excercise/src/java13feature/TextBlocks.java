package java13feature;

public class TextBlocks {

	public static void main(String[] args) {
		
		//before java 13
		
		
		
		String html1 = "<html> \n" +
	              "  <body>\n" +
	              "    <p style=\"color:red\">This is a paragraph</p>\n" +
	              "  </body>\n" +
	              "</html>";
/*
 * Requires + concatenation operators
	Newlines must be explicitly added using \n.
	Double quotes inside the string require escaping (\").
	Visually cluttered and hard to maintain for large multi-line strings
 */
			
		//Text blocks allow multi-line string literals without escape characters
		
		//Using triple double-quotes ("""), you can write multi-line strings naturally, without escapes or concatenation:

		
		String html = """
			    <html>
			        <body>
			            <p>Hello, World!</p>
			        </body>
			    </html>
			    """;
			System.out.println(html);

	}

}
