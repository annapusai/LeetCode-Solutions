package helloworld;


public class JudgeRouteCircle_657 {

public boolean judgeCircle(String moves) {
        
		int x=0,y=0;
        char[] charMoves = moves.toCharArray();
        for(char c : charMoves)
        {
        	if(c=='U') y++;
        	else if(c=='D') y--;
        	else if(c=='L') x--;
        	else if(c=='R') x++;
        }
        
        return x==0 && y==0;
		
	}
		public static void main(String args[])
		{
			System.out.println(new JudgeRouteCircle_657().judgeCircle("UD"));
		}
        
    }
