class Trie {

    public static Node root;
    public Trie() {
        root = new Node();
    }
    
    public int countWordsStartingWith(String pref){
        Node node = root;
        for(int i=0;i<pref.length();i++){
            if(!node.containsKey(pref.charAt(i))) return 0;
            node = node.get(pref.charAt(i));
        }
        return node.countPrefix;
    }
    
    public void insert(String word) {
        Node node = root;
        for(int i=0;i< word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i), new Node());   
            }
            
            node = node.get(word.charAt(i));
            node.increasePrefix();
        }
        node.setEnd();
        node.increaseEnd();
    }
    
    public boolean search(String word) {
        Node node = root;
        for(int i=0;i< word.length();i++){
            if(!node.containsKey(word.charAt(i))) return false;
            
            node = node.get(word.charAt(i));
        }
        
        return node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
            Node node = root;
        for(int i=0;i< prefix.length();i++){
                if(!node.containsKey(prefix.charAt(i))) return false;
            node = node.get(prefix.charAt(i));
        }
        return true;
    }
}



class Node{
    Node links[] = new Node[26];
    boolean flag = false;
    int countEndsWith = 0;
    int countPrefix =0;
    
    public Node(){}
    
    boolean containsKey(char ch){
        return (links[ch-'a'] != null); 
    }
    
    Node get(char ch){
        return links[ch -'a'];
    }
    void put(char ch, Node node){
        links[ch-'a'] = node;
        // cp = 1;
    }
    void setEnd(){
        flag = true;
    }
    boolean isEnd(){
        return this.flag;
    }
    
    void increaseEnd(){
        countEndsWith++;
    }
    void decreaseEnd(){
        countEndsWith--;
    }
    void increasePrefix(){
        countPrefix++;
    }
    void decreasePrefix(){
        countPrefix--;
    }
}
