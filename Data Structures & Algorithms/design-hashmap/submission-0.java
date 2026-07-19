class MyHashMap {

    class Node{
        int key;
        int value; 
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    LinkedList<Node>[] buckets;
    public MyHashMap() {
        buckets=new LinkedList[1000];
    }
    
    private int Hash(int key){
        return key%buckets.length;
    }

    public void put(int key, int value) {
        int index=Hash(key);
        if(buckets[index]==null){
            buckets[index]=new LinkedList<>();
        }
        for(Node node : buckets[index]){
            if(node.key==key){
                node.value=value;
                return;
            }
        }
        buckets[index].add(new Node(key,value));
    }
    
    public int get(int key) {
        int index=Hash(key);
        if(buckets[index]==null){
            return -1;
        }
        for(Node node : buckets[index]){
            if(node.key==key){
                return node.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int index=Hash(key);
        if(buckets[index]==null){
            return;
        }
        Node removeNode=null;
        for(Node node : buckets[index]){
            if(node.key==key){
                removeNode=node;
                break;
            }
        }
        if(removeNode!=null){
            buckets[index].remove(removeNode);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */