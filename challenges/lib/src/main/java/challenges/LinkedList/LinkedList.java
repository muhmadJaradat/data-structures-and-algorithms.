package challenges.LinkedList;

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

public void append(String value){
    Node node=new Node(value);
    if(this.head==null){this.head=node;}
else {
        Node current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
    }
}

public void insertBefore(String value,String newValue){
    Node node=new Node(newValue);


        Node current = this.head;
        Node previousNode = current;
        if (this.head.getData() == value) {
            insertNewNode(newValue);
        } else {
            while (current!= null) {
                if (current.getData() == value) {

                node.setNext(current);
                    previousNode.setNext(node);
                    break;
                }

                previousNode = current;
                current = current.getNext();

            }

        }

}

    public void insertAfter(String value,String newValue){
        Node node=new Node(newValue);

            Node current = this.head;
            while (current!= null) {
                if (current.getData() == value) {
                    node.setNext(current.getNext());
                    current.setNext(node);
                }
               current= current.getNext();
            }
    }

}
