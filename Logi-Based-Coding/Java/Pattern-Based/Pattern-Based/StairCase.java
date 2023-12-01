/*
 Stair Case Pattern:
 
________#						
_______##
______###
_____####
____#####
___######
__#######
_########
#########
 

___#
__##
_###
####

* */
package PatternBased;

public class StairCase {

	public static void main(String[] args)
	{
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5-i;j++)
			{
				System.out.print("_");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
