class MyHashSet {
    List<Integer> elements;
    public MyHashSet() {
        elements = new ArrayList<>();
    }
    
    public void add(int key) {
        boolean isPre = false;
        for(int i=0;i<elements.size();i++){
            if(elements.get(i)==key){
                isPre = true;
                break;
            }
        }
        if(!isPre){
            elements.add(key);
        }
    }
    
    public void remove(int key) {
        int id = -1;
        for(int i=0;i<elements.size();i++){
            if(elements.get(i)==key){
                id = i;
                break;
            }
        }
        if(id!=-1){
            elements.remove(id);
        }
    }
    
    public boolean contains(int key) {
        for(int i=0;i<elements.size();i++){
            if(elements.get(i)==key){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */