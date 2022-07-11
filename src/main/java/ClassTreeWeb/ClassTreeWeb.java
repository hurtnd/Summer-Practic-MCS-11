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

    public String printTree() {
        return printTree("", 0);
    }

    private String printTree(String s, int t) {
        for (int i = 0; i < t; i++) {
            s += " ";
        }
        s += name;
        s += "\n";
        if (child.size() == 0) {
            return s;
        }
        else {
            for (int i = 0; i < child.size(); i++) {
                s += child.get(i).printTree("", t + 1);
            }
            return s;
        }
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
                for(int j = i + 1; i < child.size(); j++) {
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

    public String printstr4(/*ClassTreeWeb root*/) {
        String result = "";
        result += "<li>";
        result += name;
        result += "</li>";
        for(int i = 0; i < child.size(); i++) {
            result += "<li>";
            result += child.get(i).printToHtml();
            result += "</li>";
        }
        result += "</li>";
        return result;
    }
    public String printToHtml() {
        String result = "     <ul>";
        result += printstr4();
        result += "</ul>";
        return result;
    }
}



