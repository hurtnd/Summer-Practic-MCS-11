package ClassTree;

import ClassTree.ClassTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassTreeTests {

    @Test
    void createNode(){
        ClassTree node = new ClassTree("Корень");
        assertEquals("Корень", node.getName());
    }

    @Test
    void addNode(){
        ClassTree root = new ClassTree("Корень");
        ClassTree child = new ClassTree("Лист");
        root.add(child);
        assertEquals(1, root.getChild().size());
        assertEquals("Лист", root.getChild().get(0).getName());
    }

    @Test
    void deleteNode()
    {
        ClassTree root = new ClassTree("Корень");
        ClassTree child = new ClassTree("Лист");
        root.add(child);
        assertEquals(1, root.getChild().size());
        assertEquals("Лист", root.getChild().get(0).getName());
        child.delete("Лист");
    }

    @Test
    void deleteChild()
    {
        ClassTree root = new ClassTree("Корень");
        ClassTree child = new ClassTree("Лист");
        ClassTree parent = new ClassTree("Родитель");
        root.add(child);
        root.add(parent);
        assertEquals(2, root.getChild().size());
        assertEquals("Лист", root.getChild().get(0).getName());
        assertEquals("Родитель", root.getChild().get(1).getName());
        root.deleteOC("Корень");
    }

    @Test
    void search()
    {
        ClassTree root = new ClassTree("Корень");
        ClassTree child = new ClassTree("Лист");
        ClassTree parent = new ClassTree("Родитель");
        root.add(child);
        root.add(parent);
        assertEquals(2, root.getChild().size());
        assertEquals("Лист", root.getChild().get(0).getName());
        assertEquals("Родитель", root.getChild().get(1).getName());
        root.search("Родитель");
    }

    @Test
    void rename()
    {
        ClassTree root = new ClassTree("Корень");
        ClassTree child = new ClassTree("Лист");
        ClassTree parent = new ClassTree("Родитель");
        root.add(child);
        root.add(parent);
        assertEquals(2, root.getChild().size());
        assertEquals("Лист", root.getChild().get(0).getName());
        assertEquals("Родитель", root.getChild().get(1).getName());
        root.rename("Родитель", "Папа");
    }
}