package main

import "fmt"

func main() {	
   
	//Variable assignment can be done inline with
	//the if statement
	x := 5
	if v := x; v < 4 {
        fmt.Println("V < 4")
    }else if v == 4{
		fmt.Println("V = 4")
	}else{
        fmt.Println("V > 4")
    }	
	
	//switch statement in Go
	i:=3
	
	switch i {
		case 0: fmt.Println("Zero")
		case 1: fmt.Println("One")
		case 2: fmt.Println("Two")
		case 3: fmt.Println("Three")
		case 4: fmt.Println("Four")
		case 5: fmt.Println("Five")
		default: fmt.Println("Unknown Number")
	}

}