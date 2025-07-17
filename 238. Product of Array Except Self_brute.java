class Solution
{
    public int[] productExceptSelf(int[] nums) 
    {
        // Final answer store karaycha array - sagle values 1 ne initialize karto
        int Arr[] = new int[nums.length];
        for(int iCnt = 0; iCnt < Arr.length; iCnt++) 
	{
            Arr[iCnt] = 1;
        }

        // Prefix array - ith each index sathi, tya index chya aadhiche sagle numbers cha multiplication asnar
        int Prefix[] = new int[nums.length];
        for(int iCnt = 0; iCnt < Arr.length; iCnt++) 
	{
            Prefix[iCnt] = 1;
        }

        // Postfix array - ith each index sathi, tya index nantarche sagle numbers cha multiplication asnar
        int Postfix[] = new int[nums.length];
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
	{
            Postfix[iCnt] = 1;
        }

        // Prefix calculate karto
        // Prefix[0] = 1 mhanje pahilya index la konachya aadhicha number nahi
        Prefix[0] = 1;
        for(int iCnt = 1; iCnt < Arr.length; iCnt++) 
	{
            // ith Prefix[i] = Prefix[i-1] * nums[i-1]
            // mhanje ith paryantcha sagla multiplication store hotoy
            Prefix[iCnt] = Prefix[iCnt - 1] * nums[iCnt - 1];
        }

        // Postfix calculate karto
        // Last index la 1 asel (karan tya nantar kahi element nahi)
        Postfix[Arr.length - 1] = 1;
        for(int iCnt = (Arr.length) - 2; iCnt >= 0; iCnt--) 
	{
            // Postfix[i] = Postfix[i+1] * nums[i+1]
            // mhanje pudhche sagle numbers cha multiplication
            Postfix[iCnt] = Postfix[iCnt + 1] * nums[iCnt + 1];
        }

        // Final answer calculate karto
        // ith pratek index sathi, tya index chya aadhicha ani nantarcha product multiply karto
        for(int iCnt = 0; iCnt < Arr.length; iCnt++) 
	{
            Arr[iCnt] = Postfix[iCnt] * Prefix[iCnt];
        }

        return Arr; // Final result return karto
    }
}
