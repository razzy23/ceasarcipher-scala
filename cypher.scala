object Cipher extends App{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    //to take any value, even negative or bigger than the alphabet size
    val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size

	//plaintext to be encrypted
	val inputText = scala.io.StdIn.readLine("Enter text to cipher/decipher: ")

	//cyphertext
	val outputText = inputText.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)
    
		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
			} 
	});

	println(outputText);
}