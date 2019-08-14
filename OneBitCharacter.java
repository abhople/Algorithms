class Solution {
    public boolean isOneBitCharacter(int[] bits) {
     
        // Corner case
        if(bits.length == 1 && bits[0] == 0) {
            return true;
        }
        
        int length = bits.length;
        
        for(int i=0 ; i< bits.length; ) {
                       
            if(bits[i] == 1) {
                i = i + 2;
            } else i++;
            
            if(i == bits.length - 1 && bits[i]==0) {
                return true;
            }
        }
        
        return false;
        
    }
}
