Create a web server that solves the Fizzbuzz problem over a range of inputs.

## Requirements :
1.	The server should accept its inputs over HTTP
2.	The server should accept a range of integer values specified by a start and stop value.
3.	The integer range will be between 0 and (2^32 - 1)
4.	The server should return an array of objects containing the input and output values.
	For example: [{ “in”: 4, result: “4”}]
5.	The return content type should be application/json

## Fizzbuzz:
The fizzbuzz problem is stated as follows:
For any integer value:
1.	If the integer is divisible by 3: return “fizz”
2.	If the integer is divisible by 5: return “buzz”
3.	If the integer is divisible by 3 and 5: return “fizzbuzz”
4.	Otherwise return a string representation of the integer

## Run :
1.	Clone the project
2.	`mvn clean test` to execute test cases of the application
3.	`mvn clean package` to package the application in a fat jar
4.	`mvn clean spring-boot:run` to run the application on port 8080

## API Doc
1.	Run the application
2.	Doc URL : http://localhost:8080/swagger-ui.html#/fizzbuzz-controller