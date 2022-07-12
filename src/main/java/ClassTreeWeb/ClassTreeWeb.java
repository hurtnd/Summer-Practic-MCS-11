package ClassTreeWeb;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ClassTreeWeb {
    private String id;
    private String name;
    private List<ClassTreeWeb> child;

    public ClassTreeWeb(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.child = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<ClassTreeWeb> getChild() {
        return child;
    }

    public void add(ClassTreeWeb child) {
        this.child.add(child);
    }

    public void delete(String name) {
        for (int i = 0; i < child.size(); i++) {
            if (child.get(i).getName().equals(name)) {
                child.remove(i);
            }
        }
    }

    public String delete_temp(String name) {
        Boolean temp = false;
        String text = "";
        for (int i = 0; i < child.size(); i++) {
            if (child.get(i).getName().equals(name)) {
                child.remove(i);
                temp = true;
            }
            if (temp)
            {
                text = "Completed";
                break;
            }
            else
            {
                text = "Do not exist";
                break;
            }
        }
        return text;
    }

    public void deleteOC(String name) {
        for (int i = 0; i < child.size(); i++) {
            if (child.get(i).getName().equals(name)) {
                for (int j = i + 1; i < child.size(); j++) {
                    child.remove(j);
                }
            }
        }
    }

    public boolean search(String name) {
        for (int i = 0; i < child.size(); i++) {
            if (child.get(i).getName().equals(name)) {
                return true;
            } else
                return false;
        }
        return false;
    }
    public String rename_temp(String name, String rename) {
        String temp = "";
        for (int i = 0; i < child.size(); i++) {
            if (child.get(i).getName().equals(name)) {
                child.set(i, child.get(i));
                temp = child.get(i).toString();
            }
        }
        return temp;
    }
    public void rename(String name, String rename) {
        for (int i = 0; i < child.size(); i++) {
            if (child.get(i).getName().equals(name)) {
                child.set(i, child.get(i));
            }
        }
    }

    public String printTree() {
        String result = "";
        result += name;
        for (int i = 0; i < child.size(); i++) {
            result += child.get(i).printToHtmlOutput();
        }
        return result;
    }

    public String printToHtmlOutput() {
        String result = "<ul>";
        result += printTree();
        result += "</ul>";
        return result;
    }

    public String printTreeDelete() {
        String result = "";
        result = delete_temp("Leaf 1");
        return result;
    }

    public String printToHtmlDelete() {
        String result = "   <ul>";
        result = printTreeDelete();
        return result;
    }
}