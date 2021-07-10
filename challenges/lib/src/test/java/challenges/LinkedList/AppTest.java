package challenges.LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test void insertNewNodeTest(){
        LinkedList list=new LinkedList();
        //check emptylist
        assertEquals("{null}",list.toString());

        // check non empty list
        list.insertNewNode("Hello");
        list.insertNewNode("World");

        assertEquals("{World} -> {Hello} -> {null}",list.toString());
    }
    @Test void includesTest(){
        LinkedList list=new LinkedList();
        //check emptyList
        assertEquals(false,list.includes("Hello"));

        //check non empty list
        list.insertNewNode("Hello");
        assertEquals(true,list.includes("Hello"));

    }
    @Test void appendTest(){
        LinkedList list=new LinkedList();
        list.append("Hello");
        list.append("World");
        assertEquals("{Hello} -> {World} -> {null}",list.toString());
    }
    @Test void insertBefore(){

        LinkedList list=new LinkedList();

        //if the value was at head
        list.append("my");
        list.append("friends");
        list.insertBefore("my","Hello");
        assertEquals("{Hello} -> {my} -> {friends} -> {null}",list.toString());

        //if value was in the last node
        list.insertBefore("friends","beautiful");
        assertEquals("{Hello} -> {my} -> {beautiful} -> {friends} -> {null}",list.toString());
    }
    @Test void insertAfter(){

        LinkedList list=new LinkedList();

        //if the value was at head
        list.append("Hello");
        list.append("beautiful");
        list.insertAfter("Hello","my");
        assertEquals("{Hello} -> {my} -> {beautiful} -> {null}",list.toString());

        //if value was in the last node
        list.insertAfter("beautiful","friends");
        assertEquals("{Hello} -> {my} -> {beautiful} -> {friends} -> {null}",list.toString());
    }
@Test void kthFromLast(){
        LinkedList list=new LinkedList();
    list.append("Hello");
    list.append("My");
    list.append("beautiful");
    list.append("friends");
    //the node size is 4 here
    // check a k value less than the size
    assertEquals("My",list.kthFromEnd(2));
    //check a k value of 0;
    assertEquals("friends",list.kthFromEnd(0));
    //check a k larger or equal to the size
    assertEquals("5 is greater than or equal to the Node Length which is 4",list.kthFromEnd(5));
    assertEquals("4 is greater than or equal to the Node Length which is 4",list.kthFromEnd(4));
    // check when k is less than 0
    assertEquals("k cannot be a negative value",list.kthFromEnd(-1));
}

@Test void zipTwoLinkedLists(){
        LinkedList list1=new LinkedList();
        list1.append("1");
        list1.append("2");
        list1.append("3");

        LinkedList list2=new LinkedList();
        list2.append("4");
        list2.append("5");
        list2.append("6");

     assertEquals("{1} -> {4} -> {2} -> {5} -> {3} -> {6} -> {null}",list1.zipListis(list2));
}



    
}
