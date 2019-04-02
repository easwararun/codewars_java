public class TenMinWalk {
    public static void main(String []args) {
        System.out.println("Hello World"); // prints Hello World
        TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'});
     }

    public static boolean isValid(char[] walk) {
      // Insert brilliant code here
      int arr_len = 0;
      int north_count = 0;
      int south_count = 0;
      int east_count = 0;
      int west_count = 0;
      arr_len = walk.length;
      if (arr_len == 10) {
            for (int i = 0; i < arr_len; i++) {

                if (walk[i] == 'n')
                    north_count++;
                
                if (walk[i] == 's')
                    south_count++;
                
                if (walk[i] == 'e')
                    east_count++;
                
                if (walk[i] == 'w')
                    west_count++;
            }
        System.out.println(north_count);
        System.out.println(south_count);
        System.out.println(east_count);
        System.out.println(west_count);

        if ( north_count == south_count && east_count == west_count )  
           return true;
        else
            return false;
          
      } else {
          return false;
      }
    }

    public static boolean isValid1(char[] walk) {
        if (walk.length != 10) return false;
        
        int x = 0, y = 0;
        for (char c: walk) {
          switch (c) {
            case 'n': y++; break;
            case 's': y--; break;
            case 'w': x++; break;
            case 'e': x--; break;
          }
        }
        
        return x == 0 && y == 0;
      }
  }


public class TenMinWalk1 {
    
  }