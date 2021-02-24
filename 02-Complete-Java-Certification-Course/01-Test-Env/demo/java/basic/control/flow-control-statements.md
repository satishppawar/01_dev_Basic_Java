## Java flow control Statements

There are three types of flow control statements in java

1) Selection Statements
2) Iteration statements
3) Transfer statements

### 1) Selection Statements

#### a. If 

- If syntax:-

``` java
	if (condition){ 
		true body; 
	}
	else{ 
		false body; 
	}
```
- If is taking condition that condition must be `Boolean condition otherwise compiler will raise compilation error`.

- The curly brasses are optional whenever we are taking single statements and the curly brasses are mandatory whenever we are taking multiple statements.

#### b. If-else 

#### c. switch

1) Switch statement is used to declare multiple selections.

2) Inside the switch It is possible to declare any number of cases but is possible to declare only one default.

3) Switch is taking the argument the allowed arguments are

	a. Byte 

	b. Short 

	c. Int 

	d.Char 

	e.String(allowed in 1.7 version)

4) `Float and double and long` is `not allowed `for a switch argument because these are having
more number of possibilities (float and double is having infinity number of possibilities) hence inside the switch statement it is not possible to provide float and double and long as a argument.

5) Based on the provided argument the matched case will be executed if the cases are not matched default will be executed.

##### Syntax:-

```java
switch(argument){
	case label1 : 
		sop(“ “);
		break;

	case label2 : 
		sop(“ “);
		break;

	| |
	| |

	default : 
	 	sop(“ “); 
		break;
}
```


