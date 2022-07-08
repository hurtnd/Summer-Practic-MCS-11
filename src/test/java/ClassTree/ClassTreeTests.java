package ClassTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassTreeTests {

    @Test
    void createNode(){
        ClassTree node = new ClassTree("Root");
        assertEquals("Root", node.getName());
    }

    @Test
    void addNode(){
        ClassTree root = new ClassTree("Root");
        ClassTree child = new ClassTree("Leaf");
        root.add(child);
        assertEquals(1, root.getChild().size());
        assertEquals("Leaf", root.getChild().get(0).getName());
    }

    @Test
    void deleteNode()
    {
        ClassTree root = new ClassTree("Root");
        ClassTree child = new ClassTree("Leaf");
        root.add(child);
        assertEquals(1, root.getChild().size());
        assertEquals("Leaf", root.getChild().get(0).getName());
        child.delete("Leaf");
    }

    @Test
    void deleteChild()
    {
        ClassTree root = new ClassTree("Root");
        ClassTree child = new ClassTree("Leaf");
        ClassTree parent = new ClassTree("Parent");
        root.add(child);
        root.add(parent);
        assertEquals(2, root.getChild().size());
        assertEquals("Leaf", root.getChild().get(0).getName());
        assertEquals("Parent", root.getChild().get(1).getName());
        root.deleteOC("Root");
    }

    @Test
    void search()
    {
        ClassTree root = new ClassTree("Root");
        ClassTree child = new ClassTree("Leaf");
        ClassTree parent = new ClassTree("Parent");
        root.add(child);
        root.add(parent);
        assertEquals(2, root.getChild().size());
        assertEquals("Leaf", root.getChild().get(0).getName());
        assertEquals("Parent", root.getChild().get(1).getName());
        root.search("Parent");
    }

    @Test
    void rename()
    {
        ClassTree root = new ClassTree("Root");
        ClassTree child = new ClassTree("Leaf");
        ClassTree parent = new ClassTree("Parent");
        root.add(child);
        root.add(parent);
        assertEquals(2, root.getChild().size());
        assertEquals("Leaf", root.getChild().get(0).getName());
        assertEquals("Parent", root.getChild().get(1).getName());
        root.rename("Parent", "Friend");
    }
}