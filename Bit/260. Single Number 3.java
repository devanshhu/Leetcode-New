class Solution {
		public int[] singleNumber(int[] nums) {
				if(nums.length == 2 ) return nums;
				int xor = 0;
				for(int x: nums) xor ^= x;
				int x1=0, x2=0;
				int index =0;
				int tmp = xor;
				while( tmp != 0 ){
						if((tmp & 1) == 1) break;
						index++;
						tmp = tmp>>1;
				}

				int mask = (1<<index);
				for(int x: nums){
						if( (x & mask) == 0 ){
							 x1 = x1 ^ x;
						} 
						else x2 = x2^ x;
				}

				return new int[]{x1, x2};
		}
}
