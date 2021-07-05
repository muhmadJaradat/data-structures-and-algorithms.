package challenges.LinkedList;

public class LinkedList {
    
    private Node head;
    public int size=0;
    public LinkedList(){}

    public  void insertNewNode(String data){
        Node node=new Node(data);
        if (this.head==null){
            this.head=node;
        size++;}
        else{
            node.setNext(this.head);
            this.head=node;
            size++;
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
    if(this.head==null){
        this.head=node;
        size++;}
else {
        Node current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
        size++;
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
                    size++;
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
                    size++;
                }
               current= current.getNext();
            }
    }

    public String kthFromEnd(int k){
        Node current=this.head;
        if (k<0){
            return "k cannot be a negative value";
        }

        if(k>=size){
            return k+" is greater than or equal to the Node Length which is "+size;
        }
        else {
            int steps=size-k-1;
            for(int i=0;i<steps;i++){
                current=current.getNext();
            }
            return current.getData();
        }
    }

}
