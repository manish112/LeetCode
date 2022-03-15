class TwoSum {

    HashMap<Integer, Integer> num;
    
    public TwoSum() {
        
        this.num=new HashMap<Integer, Integer>();
    }
    
    public void add(int number) {
        
        if(num.containsKey(number)){
          
             num.put(number, num.get(number)+1);
         }else{
            num.put(number, 1);
         }
        
    }
    
    public boolean find(int value) {
        
       for(Map.Entry<Integer, Integer> entry: num.entrySet()){
           
           int remaining = value-entry.getKey();
           
           
          if(remaining!=entry.getKey()){ 
            if(num.containsKey(remaining)){
               return true;
            }
           
          }else{
               if(entry.getValue()>1){
                   return true;
               }
           
           
       }
        
      
       }
   
        return false;
        
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */