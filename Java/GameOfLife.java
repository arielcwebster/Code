
public class GameOfLife {

    public int[][] array1 = new int[25][25];
    public int x;
    public int y;
    public int pop = 0;
    public int[][] array2=new int[25][25];

    public int population() {
      
    if (x > 0 && x < 24 && y > 0 && y < 24) {
      
        if ((array1[x-1][y-1]) == 1) {
            pop++;
        }
        if ((array1[x][y-1]) == 1) {
            pop++;
        }
        if ((array1[x+1][y-1]) == 1) {
            pop++;
        }
        if ((array1[x-1][y]) == 1) {
            pop++;
        }
        if ((array1[x+1][y]) == 1) {
            pop++;
        }
        if ((array1[x-1][y+1]) == 1) {
            pop++;
        }
        if ((array1[x][y+1]) == 1) {
            pop++;
        }
        if ((array1[x+1][y+1]) == 1) {
            pop++;
        }
    }
   
    if (x == 0 && y == 0) {
         if ((array1[x+1][y]) == 1) {
             pop++;
         }
         if ((array1[x][y+1]) == 1) {
             pop++;
         }
         if ((array1[x+1][y+1]) == 1) {
             pop++;
         }
    }
   
    if (x == 0 && y != 0 && y < 24) {
        if ((array1[x][y-1]) == 1) {
            pop++;
        }
        if ((array1[x+1][y-1]) == 1) {
            pop++;
        }
        if ((array1[x+1][y]) == 1) {
            pop++;
        }
        if ((array1[x][y+1]) == 1) {
            pop++;
        }
        if ((array1[x+1][y+1]) == 1) {
            pop++;
        }
    }
   
    if (x < 24 && x != 0 && y == 0) {
        if ((array1[x-1][y]) == 1) {
            pop++;
        }
        if ((array1[x+1][y]) == 1) {
            pop++;
        }
        if ((array1[x-1][y+1]) == 1) {
            pop++;
        }
        if ((array1[x][y+1]) == 1) {
            pop++;
        }
        if ((array1[x+1][y+1]) == 1) {
            pop++;
        }
    }
   
    if (x == 24 && y == 24) {
        if ((array1[x-1][y-1]) == 1) {
            pop++;
        }
        if ((array1[x][y-1]) == 1) {
            pop++;
        }
        if ((array1[x-1][y]) == 1) {
            pop++;
        }
    }
   
    if (x == 24 && y > 0 && y != 24) {
        if ((array1[x-1][y-1]) == 1) {
            pop++;
        }
        if ((array1[x][y-1]) == 1) {
            pop++;
        }
        if ((array1[x-1][y]) == 1) {
            pop++;
        }
        if ((array1[x-1][y+1]) == 1) {
            pop++;
        }
        if ((array1[x][y+1]) == 1) {
            pop++;
        }
    }
   
    if (x > 0 && y == 24 && x != 24) {
        if ((array1[x-1][y-1]) == 1) {
            pop++;
        }
        if ((array1[x][y-1]) == 1) {
            pop++;
        }
        if ((array1[x+1][y-1]) == 1) {
            pop++;
        }
        if ((array1[x-1][y]) == 1) {
            pop++;
        }
        if ((array1[x+1][y]) == 1) {
            pop++;
        }
    }
        return pop;
    }
  
    public void isAlive() {
       
        if (array1[x][y] == 1 && (pop == 2 || pop == 3)) {
            array1[x][y] = 1;
        }
        else {
            array1[x][y] = 0;
        }
    }
  
    public void birth() {
        if (array1[x][y] == 0 && pop == 3) {
            array1[x][y] = 1;
        }
        else {
            array1[x][y] = 0;
        }
    }
  
    public void checkLife() {
       
        population();
        isAlive();
        birth();
        
    }
    
}
