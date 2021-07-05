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
}
