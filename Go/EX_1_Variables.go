package main

import "fmt"


func main() {	

	// add pointers

	//abc inferred typing
	a,b,c := 1, 2, "GO!"
	
	//def inferred typing without ":="
	var d,e,f = 3, 4.44, "Stop!"
	
	//gh Strong Typing used
	var g,h int = 5,6
	
	//constant i must be strongly typed
	const i string = "Start Again"
	
	//Cast e from float to int
	var j int = d + int(e)
	
	//Another way to declare many vars
	//with inferred typing
	var(
		k = 8
		l = 9
		m = "Stop Finally"
	)
	
	
    fmt.Println(a,b,c)
	fmt.Println(d,e,f)
	fmt.Println(g,h)
	fmt.Println(i)
	fmt.Println(j)
	fmt.Println(k,l,m)
}