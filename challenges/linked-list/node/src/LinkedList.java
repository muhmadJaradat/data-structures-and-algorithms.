public class LinkedList {
    
    private Node head;
    public LinkedList(){}

    public  void insertNewNode(String data){
        Node node=new Node(data);
        if (this.head==null)this.head=node;
        else{
            node.setNext(this.head);
            this.head=node;
        }
    }
public boolean includes(String data){
    Node current= this.head;
    while(current!=null){
        if(current.getData()==data)return true;
        else {
            current=current.getNext();
        }
        
    }
    return false;
}
public String toString(){
    Node current=this.head;
    String newString="";
    while(current!=null){
        newString=newString+"{"+current.getData()+"} -> ";
        current=current.getNext();
    }
    
    return newString+"{null}";
}

}
