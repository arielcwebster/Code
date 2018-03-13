package main

import "fmt"

func main() {	
	//there is only one repetition control
	//in go used to various affect
	
	//While loop, requires condition vars to be
	//declared in advance. There is no Do...While 
	//structure but it's functionality can be imitated
	i := 1
	for i <= 9 {
        fmt.Print(i)
        i = i + 1
    }
	//Output: Numbers 1-9
	fmt.Println()
	
	//Standard for loop but increment condition
	//must be included
	for j := 1; j <= 9; j++ {
        fmt.Print(j)
    }
	//Output: Numbers 1-9
	fmt.Println()
	
	
	//For Ever loop has infinite repetition
	//and must be escaped somehow like a break.
	k:=1
	for{
		k++
		if(k == 5){break}
		fmt.Print(k)
	}
	//Output: Numbers 2-4
	fmt.Println()	
	
	//Foreach loop using the range keyword
	a := [3]string{"a","b","c"}
	
	for l := range a{
		fmt.Print(a[l])
	}
	fmt.Println()
	
	
}