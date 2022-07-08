package ClassTree;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ClassTree {
    private String id;
    private String name;
    private List<ClassTree> child;

    public ClassTree(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.child = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<ClassTree> getChild() {
        return child;
    }

    public void add(ClassTree child) {
        this.child.add(child);
    }

    public void delete(String name) {
        for (int i = 0; i < child.size(); i++) {
            if (child.get(i).getName().equals(name)) {
                child.remove(i);
            }
        }
    }

    public void deleteOC(String name) {
        for(int i = 0; i < child.size(); i++) {
            if (child.get(i).getName().equals(name)) {
                for(int j = i + 1; i < child.size(); j++)
                {
                    child.remove(j);
                }
            }
        }
    }

    public boolean search(String name) {
        for(int i = 0; i < child.size(); i++) {
            if (child.get(i).getName().equals(name)) {
                return true;
            }
            else
                return false;
        }
        return false;
    }

    public void rename(String name, String rename) {
        for(int i = 0; i < child.size(); i++) {
            if (child.get(i).getName().equals(name)) {
                child.set(i,child.get(i));
            }
        }
    }
}
