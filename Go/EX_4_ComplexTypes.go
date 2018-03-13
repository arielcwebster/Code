package main

import "fmt"

func main() {	
    
	//Two ways to declare arrays
	//The first cannot assign on the declaration line
	//while the second can
	var a [2]string
    a[0] = "Hello"
    a[1] = "World"
	
	b := [2]string{"Goodbye","World"}
	
	fmt.Println(a)
	fmt.Println(b)
	
	
	//Slices are a unique data structure very similar
	//to arrays but are dynamically sized
	c := [10]int{0,1,2,3,4,5,6,7,8,9}
	d := c[0:4]
	fmt.Println(c)
	fmt.Println(d)
	
	elements := make(map[string]string)
    elements["H"] = "Hydrogen"
    elements["He"] = "Helium"
    elements["B"] = "Boron"
    elements["C"] = "Carbon"
    elements["N"] = "Nitrogen"
    elements["O"] = "Oxygen"
	fmt.Println(elements)
	
	
}


