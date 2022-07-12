package ClassTreeWeb;

import javax.ws.rs.core.Application;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Web-приложение в котором регистрируются все ресурсы.
 */
public class WebApplication extends Application {

    private List<String> list = new ArrayList<>();
    private ClassTreeWeb root;

    public WebApplication() {
        root = new ClassTreeWeb("Root");
        ClassTreeWeb child = new ClassTreeWeb("Barrel 1");
        root.add(child);
        ClassTreeWeb chile = new ClassTreeWeb("Barrel 2");
        root.add(chile);
        ClassTreeWeb kide = new ClassTreeWeb("Leaf 3");
        chile.add(kide);
        ClassTreeWeb kid = new ClassTreeWeb("Leaf 1");
        child.add(kid);
        ClassTreeWeb kidd = new ClassTreeWeb("Leaf 2");
        child.add(kidd);
    }

    /**
     * Возвращает список всех ресурсов web-приложения.
     * 
     * @return список всех ресурсов web-приложения.
     */
    @Override
    public Set<Object> getSingletons() {
        Set<Object> resources = new HashSet<>();
        resources.add(new ListPresentationController(list, root));
        return resources;
    }
}
