class ProductOfNumbers {
    List<Integer> elements;
    List<Integer> prd;
    public ProductOfNumbers() {
        elements = new ArrayList<>();
        prd = new ArrayList<>();
    }
    
    public void add(int num) {
        elements.add(num);
        if(num==0){
            prd.clear();
        }else if(prd.size()==0){
            prd.add(num);
        }else{
            if(prd.get(prd.size()-1)!=0){
                prd.add(num*prd.get(prd.size()-1));
            }else{
                prd.add(num);
            }
        }
        //System.out.println(elements.get(prd.size()-1)+" "+prd.get(prd.size()-1));
    }
    
    public int getProduct(int k) {
        if(k==prd.size()){
            return prd.get(k-1);
        }
        if(k>prd.size()){
            return 0;
        }
        return prd.get(prd.size()-1)/prd.get(prd.size()-(k+1));
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */