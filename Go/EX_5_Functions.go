package main

import "fmt"

func multiReturn() (int, int) {
    return 5, 6
}

func add(args ...int) int {
    total := 0
    for _, v := range args {
        total += v
    }
    return total
}

func main() {

	//Functions can have multiple return
	//values which are listed after the
	//parameters 
	a,b := multiReturn()
	fmt.Println(a,b)
	
	//Variadic functions take zero or more
	//of one parameter as shown here with
	//an addition example which can be expanded
	//as needed
	c := add(1,4,3,7,5,4,2,4,0)//expected: 30
	fmt.Println(c)
	
	//Go supports closures as seen here 
	//creating a simpler add function
	add2 := func(x,y int) int{
		return x+y
	}
	fmt.Println(add2(1,1))
	
	
}