package main

import (
    "fmt"
    "math/rand"
    "time"
)

//type empty {}
//type semaphore chan int
//c := make(chan int)  // Allocate a channel.

func main() {
    
    rand.Seed(time.Now().Unix())
    fmt.Println(rand.Int()%2000)
   
	c := make(chan int)  // Allocate a channel.
	   fmt.Println("here")
	var x = 3
	   fmt.Println(x)
	foo(c)
	go fo(c, x)
	foo(c)
}

func fo (c chan int, x int){
	c<-x
	return
}


func foo(c chan int){

	fmt.Println("ummm")
	fmt.Println(<-c)
	}
	
	
	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	*/
	package main

import "fmt"

func sum(a int, c chan int) {
    sum := a +1
    c <- sum // send sum to c
}

func Red(direct int, c chan int) {
    direct = direct + 1;
    c <- direct
}

func main() {
    
      c := make(chan int)
    
   ns := 20
   ew := 20
   Lns := false
   // am := false
    
     fmt.Println("hi")
   
    if(ns > ew){
    	Lns = true
    }else{
    	Lns = false 
    }
    
    fmt.Println("hi")
    
    if (Lns){
    	go Red (ns, c)
    }
    fmt.Println("hi")
    fmt.Println(ns)
    
    //ns = <-c
    
    fmt.Println("hi")
    
    fmt.Println(ns)
    
    //a := []int{7, 2, 8, -9, 4, 0}
    

  
    go sum(ns, c)
    go sum(ew, c)
    x, y := <-c, <-c // receive from c

    fmt.Println(x, y, x+y)
}
	*/