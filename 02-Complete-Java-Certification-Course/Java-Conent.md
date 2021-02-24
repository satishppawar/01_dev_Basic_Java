# Content

### Basic Programming


### OOP


### Other

1. Creating a jar of Java project

 - Extract jar conent
 
	* jar -xvf <file.jar>

		> x - extract

		> f -file

 - Creating a jar file  using eclipse

- Creating a jar file  using CMD

	* Create a class file e.g ExampleProgram

	* Create Mainfest file - It contains additional information such as class containing main method

		```mainfest.mf
		Main-Class: ExampleProgram
		```
	* Create a jar file

	> jar -cvfm  myprogram.jar mainfest.mf *.class

	>> -m mainfest file

	>> -c create

	* List content of jar file

	> jar -tvf <<jar-file-name>>.jar

2. 

3. 