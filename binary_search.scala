object binary_search
{
	def binary_recursion(arr:Array[Int],key:Int,l:Int,r:Int):Int=
	{
		var mid=(l+r)/2;
		if(l>r)
		{
		return -1;
		}
		else if(arr(mid)==key)
		{
		return mid;
		}
		else if(arr(mid)<key)
		{
		binary_recursion(arr,key,mid+1,r);
		}
		else
		{
		binary_recursion(arr,key,l,mid-1);
		}
	}
	
	def binary_norecursion(arr:Array[Int],key:Int,r:Int):Int=
	{
		var low=0;
		var high=r;

		while(low<=high)
		{
			 var mid=(low+high)/2;

			 if(arr(mid)==key)
			 {
			 return mid;
			 }

			else if(arr(mid)<key)
			{
			low=mid+1;
			}

			else
			{
			high=mid-1;
			}
		
		}
		return -1;
	}


	def main(args:Array[String])
	{
		println("Enter Size of an array::");
		var n:Int=Console.readInt;
		var arr=new Array[Int](n);
		println("enter an array elements:");
		for(i<-0 to n-1)
		{
		arr(i)=Console.readInt;
		}
		arr=arr.sorted;
		println("Sorted array::");
		for(i<-0 to n-1)
		{
		println(arr(i));
		}
		println("Enter an element to searched:");
		var key:Int=Console.readInt;
		println("binary search with recursion:");

		var pos:Int=binary_recursion(arr,key,0,n-1);

		println("Element found at position:"+pos);
		println("binary search without recursion:");
		var pos2:Int=binary_norecursion(arr,key,n-1);
		println("Element found at position:"+pos2);
		
	
	}
}
